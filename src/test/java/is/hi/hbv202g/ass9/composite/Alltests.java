package is.hi.hbv202g.ass9.composite;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        MixedCompositeTest.class,
        MultiplyCompositeTest.class,
        NumberLeafTest.class,
        PlusCompositeTest.class
})
public class Alltests {
}