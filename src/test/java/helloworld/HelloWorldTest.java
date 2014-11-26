package helloworld;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * @author Thomas Aagaard Jensen (z3thj), KMD A/S
 * @author Morten Furbo Skødt Nielsen <mtn@kmd.dk>, KMD A/S
 * Date: 26-11-14
 */
public class HelloWorldTest {
    @Test
    public void testToString() {
        HelloWorld hw = new HelloWorld();
        assertEquals("HelloWorld", hw.toString());
    }
}
