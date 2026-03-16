package is.hi.hbv202g.ass9.compositeObserved;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MultiplyCompositeObserverTest {

	private MultiplyComposite multiplyComposite;

	@BeforeEach
	public void createMultiplyComposite() {
		multiplyComposite = new MultiplyComposite();
	}

	@Test
	public void testOneElementMultiplyCompositeObserver() {
		NumberLeaf number2 = new NumberLeaf(2);
		multiplyComposite.add(number2);

		multiplyComposite.update(); // This will cause stuff printed on the screen: this screen output is not tested.

		assertEquals(2, multiplyComposite.getLastObservedResult(), "An observing multiply composite with one number leaf should store in its lastObservedField the value 2 to which the observed " +
				"leaf was set");
	}
}
