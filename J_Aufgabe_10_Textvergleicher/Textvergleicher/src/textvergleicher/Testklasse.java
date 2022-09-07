
package textvergleicher;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/**
 * Testklasse für die Aufgabe
 * @author Lukas
 */
public class Testklasse {
    
    /**
     * Methode für die Eingabe und Ausgabe von Testwerten
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {        
        Textvergleicher vergleicher = new Textvergleicher();
        String text1 = "Test, Text, Hallo. Dies, alle ist ein Test. \n"
                + ". Erst";
        String text2 = "Text, Hallo. Dies ist ein eins. Test \n"
                + ". Erst, alle";        
        Reader reader1;
        Reader reader2;        
        reader1 = new StringReader(text1);
        reader2 = new StringReader(text2);        
        
        System.out.println(vergleicher.sindGleich(reader1, reader2));        
    }
}
