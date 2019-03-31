import kyu8.FakeBinary;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FakeBinaryTest {

    @Test
    public void testSomething() {
         assertEquals("01011110001100111", FakeBinary.fakeBin("45385593107843568"));
    }

}