
package string;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import org.junit.Test;
import org.junit.Before;

/**
 * Test Klasse Für die Tokens
 * @author Lukas
 */
public class StringTest {
    
    private String test;
    private String test2;
    
    @Before
    public void setUp() {
        test = "Dies ist ein Test. Der Test ist beendet";
        test2 = "Dies ist ein Test. Der Test ist beendet";
    }

    @Test
    public void testSubString1() {
        assertEquals("Dies", test.substring(0, 4));
    }

    @Test
    public void testSubString2() {
        assertEquals("ein Test. Der Test ist beendet", test.substring(9));
    }

    @Test
    public void testSubString3() {
        assertEquals("Test", test.substring(13, 17));
    }
    
    @Test
    public void testSubString4() {
        assertSame(test, test2);
    }
    
}