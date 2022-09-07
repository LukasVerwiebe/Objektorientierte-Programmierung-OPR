
package string;

import java.util.StringTokenizer;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import org.junit.Test;
import org.junit.Before;

/**
 *
 * @author Lukas
 *
 */
public class StringTokenizerTest {
    
    private StringTokenizer test1;
    private StringTokenizer test2;
    private StringTokenizer test7;
    private String test3;
    private String test4;
    private String test5;
    private String test6;
    private String test8;
    
    @Before
    public void setUp() {
        test3 = "--abc +-xyz";
        test4 = "+-";        
        test5 = "##test++*#-";
        test6 = "*#-";        
        test8 = "";
        
        test1 = new StringTokenizer(test3, test4);
        test2 = new StringTokenizer(test5, test6);
        test7 = new StringTokenizer(test8, test4);
    }

    @Test
    public void nextToken1() {
        assertEquals("abc ", test1.nextToken());
        assertEquals("xyz", test1.nextToken());
    }

    @Test
    public void nextToken2() {
        assertEquals("test++", test2.nextToken());
    }

    @Test
    public void hasMoreTokens3() {
        assertEquals(true, test1.hasMoreTokens());
    }
    
    @Test
    public void hasMoreTokens4() {
        assertEquals(false, test7.hasMoreTokens());
    }
    
}