package fixture;

import builders.BuilderB;
import builders.BuilderC;
import domain.B;
import domain.C;

/**
 * Created by mmonti on 10/13/16.
 */
public class Test {

    @org.junit.Test
    public void testB() throws Exception {
        B b = BuilderB.build();
    }

    @org.junit.Test
    public void testC() throws Exception {
        C c = BuilderC.build();
    }
}
