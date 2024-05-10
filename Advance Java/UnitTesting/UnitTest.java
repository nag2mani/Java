import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UnitTest {

    public static class Sq {
        public int sq(int a) {
            return a * a;
        }
    }

    @Test
    public void testSq() {
        Sq s = new Sq();
        int result = s.sq(5);
        assertEquals(25, result);
    }
}
