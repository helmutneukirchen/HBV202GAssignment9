package is.hi.hbv202g.ass9;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        is.hi.hbv202g.ass9.composite.Alltests.class,
        is.hi.hbv202g.ass9.compositeObserved.Alltests.class,
        is.hi.hbv202g.ass9.compositeObservedTemplateMethod.Alltests.class
})
public class Alltests {
}