
package streamverarbeitung;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * Testklasse für die Aufgabe
 * @author Lukas
 */
public class Testklasse {
    
    /**
     * Einagbe und Ausgabe von Testwerte
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {        
        InputStreamVergleicher2 vergleicher = new InputStreamVergleicher2();
        String test1 = "Test 1234";
        String test2 = "Test 1234";
        String test3 = "Test abcd";
        String test4 = "Testas";
        
        ByteArrayInputStream text1 = new ByteArrayInputStream(test1.getBytes());
        ByteArrayInputStream text2 = new ByteArrayInputStream(test3.getBytes());        
        
        System.out.println(vergleicher.sindGleich(text1, text2, 7));        
    }
    
}
