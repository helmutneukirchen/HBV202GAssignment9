package is.hi.hbv202g.ass9.compositeObserved;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlusCompositeObserverTest {

	private PlusComposite plusComposite;

	@BeforeEach
	public void createPlusComposite() {
		plusComposite = new PlusComposite();
	}

	@Test
	public void testOneElementPlusCompositeObserver() {
		NumberLeaf number1 = new NumberLeaf(1);
		plusComposite.add(number1);

		plusComposite.update(); // This will cause stuff printed on the screen: this screen output is not tested.

		assertEquals(1, plusComposite.getLastObservedResult(), "An observing plus composite with one number leaf should store in its lastObservedField the value 1 to which the observed " +
				"leaf was set");
	}

}
