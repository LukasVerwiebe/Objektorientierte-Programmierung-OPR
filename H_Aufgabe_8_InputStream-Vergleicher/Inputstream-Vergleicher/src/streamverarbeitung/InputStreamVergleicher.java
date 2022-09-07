
package streamverarbeitung;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author Lukas
 */
public class InputStreamVergleicher {
    
    public InputStreamVergleicher() {        
    }
    
    public static boolean sindGleich(InputStream is1, InputStream is2, long leange) 
            throws IOException {
        
        boolean ergebnis = false;
        int symbol1 = is1.read();
        int symbol2 = is2.read();
        String anfang1 = "";
        String anfang2 = "";
        
        StringBuilder wort1 = new StringBuilder();
        StringBuilder wort2 = new StringBuilder();
        
        while(symbol1 != -1) {            
            wort1.append((char) symbol1);
            symbol1 = is1.read();
        }
        while(symbol2 != -1) {
            wort2.append((char) symbol2);
            symbol2 = is2.read();
        }
        
        anfang1 = wort1.substring(0, (int)leange + 1);
        anfang2 = wort2.substring(0, (int)leange + 1);
        
        if(wort1.length() >= leange 
                && wort2.length() >= leange 
                && anfang1.equals(anfang2)) {
            
            ergebnis = true;
        } else if(wort1.length() < leange 
                && wort2.length() < leange 
                && wort1.length() == wort2.length()
                && wort1.equals(wort2)) {
            
            ergebnis = true;            
        }
        is1.close();
        is2.close();
        return ergebnis;
    }
    
    
    public static void main(String[] args) throws IOException {
        
        String test1 = "Dies ist ein Test.";
        String test2 = "Dies ist ein Test.";
        String test3 = "Dies ist kein Test.";
        
        InputStream test4 = new ByteArrayInputStream(test1.getBytes());
        InputStream test5 = new ByteArrayInputStream(test2.getBytes()); 
        
        
        InputStreamVergleicher vergelicher = new InputStreamVergleicher();        
        
        System.out.println(vergelicher.sindGleich(test4, test5, 12));
        
    }
    
}
