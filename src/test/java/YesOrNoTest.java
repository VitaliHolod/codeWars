import kyu8.YesOrNo;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class YesOrNoTest {
    @Test
    public void testBoolToWord() {
        assertEquals(YesOrNo.boolToWord(true),"Yes");
        assertEquals(YesOrNo.boolToWord(false),"No");
    }

}