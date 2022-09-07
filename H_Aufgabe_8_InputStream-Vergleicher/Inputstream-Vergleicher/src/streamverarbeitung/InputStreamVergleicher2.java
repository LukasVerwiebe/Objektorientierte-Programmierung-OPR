
package streamverarbeitung;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Version 2 der Klasse InputStreamVergleicher
 * @author Lukas
 */
public class InputStreamVergleicher2 {
    
    /**
     * Methode für die Eingabe und Ausgabe von Testwerten
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
    
    /**
     * Vergleichen der InputStream Objekte miteinander
     * @param is1
     * @param is2
     * @param leange
     * @return
     * @throws IOException 
     */
    public boolean sindGleich(InputStream is1, InputStream is2, long leange) 
            throws IOException {
        
        boolean ergebnis = false;
        String anfang1 = "";
        String anfang2 = "";
        int symbol1 = is1.read();
        int symbol2 = is2.read();
        
        StringBuilder text1 = new StringBuilder();
        StringBuilder text2 = new StringBuilder();
        
        while(symbol1 != -1) {
            text1.append((char) symbol1);
            symbol1 = is1.read();
        }
        while(symbol2 != -1) {
            text2.append((char) symbol2);
            symbol2 = is2.read();
        }
        
        anfang1 = text1.substring(0, 3);
        anfang2 = text2.substring(0, 3);
        
        if(text1.length() >= leange && text2.length() >= leange && anfang1.equals(anfang2)) {
            
            ergebnis = true;            
        } else if(text1.length() == text2.length() 
                && text1.equals(text2) 
                && text1.length() < leange 
                && text2.length() < leange) {
            
            ergebnis = true;
        }
        
        is1.close();
        is2.close();
        return ergebnis;
    }    
}
