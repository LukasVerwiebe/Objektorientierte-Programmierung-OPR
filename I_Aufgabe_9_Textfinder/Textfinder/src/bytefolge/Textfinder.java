
package bytefolge;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Lukas
 */
public class Textfinder {
    
    //private HashMap<String, Integer> listee = new HashMap();
    private ArrayList<String> liste = new ArrayList();    
    
    public Textfinder(InputStream is, int laenge) throws IOException {       
        this.liste = new ArrayList();       
        int symbol = is.read();      
       
        while(symbol != -1) {
           
            StringBuilder wort = new StringBuilder();
            
            while((symbol >= 'a' && symbol <= 'z') 
                || (symbol >= 'A' && symbol <= 'Z')) {
               
                wort.append((char) symbol);
                symbol = is.read();
            }
           
            if(wort.length() >= laenge) {
                liste.add(wort.toString());
            }           
            symbol = is.read();
        }       
        is.close();
       
        for(int i = 0; i < liste.size(); i++) {
            System.out.println(liste.get(i));
        }
    }    
    
    public Set<String> gibWoerter() {
        int laenge = liste.size();
        Set<String> woerter = new HashSet<>();
        
        if(laenge > 0) {
            for(int i = 0; i < laenge; i++) {
                woerter.add(liste.get(i));
            }
        }
        System.out.println(woerter.size());        
        return woerter;
    }
    
    public int gibHaeufigkeit(String wort) {
        int ergebnis = 0;
        for(int i = 0; i < liste.size(); i++) {
            if(liste.get(i).equals(wort)) {
                ergebnis = ergebnis + 1;
            }
        }        
        return ergebnis;
    }
    
    public static void main(String[] args) throws IOException {
        
        String s = "Hallo@Test,-dies-------ist ein Test. Der Test ist  beendet.";        
        String s2 = "Dies ist ein Test Text. Der Text testet die Methoden.";
        String s3 = "Der Die das Test 12345*Welt der die das Test Hallo Welt-Welt";
        
        Textfinder test = new Textfinder(new ByteArrayInputStream(s.getBytes()), 4);
        Textfinder test2 = new Textfinder(new ByteArrayInputStream(s2.getBytes()), 4);
        Textfinder test3 = new Textfinder(new ByteArrayInputStream(s3.getBytes()), 4);
        
        System.out.println(test.gibHaeufigkeit("Test"));
        test.gibWoerter();
        System.out.println(test2.gibHaeufigkeit("Text"));
        test2.gibWoerter();
        System.out.println(test3.gibHaeufigkeit("Welt"));
        test3.gibWoerter();
    }
    
}
