package is.hi.hbv202g.ass9.compositeObserved;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlusCompositeTest {

    private PlusComposite plusComposite;

    @BeforeEach
    public void createPlusComposite() {
        plusComposite = new PlusComposite();
    }

    @Test
    public void testEmptyPlusComposite() {
        assertEquals(0, plusComposite.getResult(), "An empty plus composite should return 0");
    }

    @Test
    public void testOneElementPlusComposite() {
        NumberLeaf number2 = new NumberLeaf(2);

        plusComposite.add(number2);
        assertEquals(2,
                plusComposite.getResult(), "A plus composite consisting only of one leaf with value 2 should return 2");
    }

    @Test
    public void testTwoElementPlusComposite() {
        NumberLeaf number1 = new NumberLeaf(1);
        NumberLeaf number2 = new NumberLeaf(2);

        plusComposite.add(number1);
        plusComposite.add(number2);
        assertEquals(3,
                plusComposite.getResult(), "A plus composite consisting of leafs with values 1 and 2 should return 3");
    }

    @Test
    public void testNestedPlusComposite() {
        NumberLeaf number1 = new NumberLeaf(1);
        NumberLeaf number2 = new NumberLeaf(2);

        plusComposite.add(number1);
        plusComposite.add(number2);

        PlusComposite plusComposite2 = new PlusComposite();
        plusComposite2.add(plusComposite);
        plusComposite2.add(plusComposite);

        assertEquals(6, plusComposite2.getResult(), "A plus composite consisting two further plus composites, each consisting of leafs with values " +
                "1 and 2 should return (1+2)+(1+2)=6");
    }

}
