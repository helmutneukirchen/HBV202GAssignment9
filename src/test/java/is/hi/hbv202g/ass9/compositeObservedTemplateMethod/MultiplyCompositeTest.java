package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MultiplyCompositeTest {

	private MultiplyComposite multiplyComposite;

	@BeforeEach
	public void createMultiplyComposite() {
		multiplyComposite = new MultiplyComposite();
	}

	@Test
	public void testOneElementMultiplyComposite() {

		NumberLeaf number2 = new NumberLeaf(2);

		multiplyComposite.add(number2);
		assertEquals(2,
				multiplyComposite.getResult(), "A multiply composite consisting only of one leaf with value 2 should return 2");
	}

	@Test
	public void testTwoElementMultiplyComposite() {

		NumberLeaf number2 = new NumberLeaf(2);
		NumberLeaf number4 = new NumberLeaf(4);

		multiplyComposite.add(number2);
		multiplyComposite.add(number4);
		assertEquals(8,
				multiplyComposite.getResult(), "A multiply composite consisting of leafs with values 2 and 4 should return 8");
	}

	@Test
	public void testNestedMultiplyComposite() {

		NumberLeaf number2 = new NumberLeaf(2);
		NumberLeaf number4 = new NumberLeaf(4);

		multiplyComposite.add(number2);
		multiplyComposite.add(number4);

		MultiplyComposite multiplyComposite2 = new MultiplyComposite();
		multiplyComposite2.add(multiplyComposite);
		multiplyComposite2.add(multiplyComposite);
		assertEquals(64, multiplyComposite2.getResult(), "A multiply composite consisting two further multiply composites, each consisting of leafs with " +
				"values 2 and 4 should return (2*4)*(2*4)=64");
	}

}
