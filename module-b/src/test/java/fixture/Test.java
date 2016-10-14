package fixture;

import builders.BuilderC;
import domain.C;

/**
 * Created by mmonti on 10/13/16.
 */
public class Test {

//    @org.junit.Test
//    public void testA() throws Exception {
//        A b = BuilderA.build();
//    }

    @org.junit.Test
    public void testC() throws Exception {
        C c = BuilderC.build();
    }
}
