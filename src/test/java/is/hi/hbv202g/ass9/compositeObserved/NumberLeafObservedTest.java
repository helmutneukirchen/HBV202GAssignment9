package is.hi.hbv202g.ass9.compositeObserved;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NumberLeafObservedTest implements Observer {

	private int lastObservedResult;
	private NumberLeaf number1;

	@BeforeEach
	public void setUp() {
		lastObservedResult=0; // This value here must be different than the one set in the next line
		number1 = new NumberLeaf(1);
	}

	@Test
	public void testAttachAndUpdateAfterSetValue() {
		number1.attach(this);
		number1.setValue(3);

		assertEquals(3,
				lastObservedResult, "A leaf observed by this testcase should call the update method of this testcase when " +
						"setting the value of this leaf to 3 and this leaf should return this new value 3 when getResult is used by the called update method");
	}

	@Override
	public void update() { // We need to provide this method according to the Observer interface that this test class implements
		lastObservedResult=number1.getResult(); // If we get called we store the value in lastObservedResult so that the test case above can assert on it
	}
}
