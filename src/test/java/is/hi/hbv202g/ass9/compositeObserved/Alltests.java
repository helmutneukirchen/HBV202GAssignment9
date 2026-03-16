package is.hi.hbv202g.ass9.compositeObserved;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        MixedCompositeObserverTest.class,
        MultiplyCompositeObserverTest.class,
        MultiplyCompositeTest.class,
        NumberLeafObservedTest.class,
        NumberLeafTest.class,
        PlusCompositeObserverTest.class,
        PlusCompositeTest.class
})
public class Alltests {
}