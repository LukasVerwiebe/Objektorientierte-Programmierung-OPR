
package string;

import java.util.StringTokenizer;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import org.junit.Test;
import org.junit.Before;

/**
 *
 * @author Lukas
 */
public class TokensTest {
    
    private String test1;
    private String test2;
    private String test3;
    private String test4;
    private Tokens test5;
    
    @Before
    public void setUp() {
        test1 = "--abc +-xyz";
        test2 = "+-";
    }

    @Test
    public void testTokens1() {
        assertEquals("abc ,xyz", test5.tokens(test1, test2));
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