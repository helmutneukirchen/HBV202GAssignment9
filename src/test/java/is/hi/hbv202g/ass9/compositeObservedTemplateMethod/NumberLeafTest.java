package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class NumberLeafTest {

	@Test
	public void testNumberLeaf() {
		NumberLeaf number1 = new NumberLeaf(1);
		assertEquals(1, number1.getResult(), "A leaf with value 1 should return 1");

		NumberLeaf number2 = new NumberLeaf(2);
		assertEquals(2, number2.getResult(), "A leaf with value 2 should return 2");
	}

}

