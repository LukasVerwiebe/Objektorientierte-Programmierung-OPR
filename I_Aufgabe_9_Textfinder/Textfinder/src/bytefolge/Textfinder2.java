
package bytefolge;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Lukas
 */
public class Textfinder2 {
    
    public static void main(String[] args) throws IOException {
        String s = "Hallo@Test,-dies-------ist ein Test. Der Test ist  beendet.";        
        String s2 = "Dies ist ein Test Text. Der Text testet die Methoden.";
        String s3 = "Der Die das Test 12345*Welt der die das Test Hallo Welt-Welt";
        
        Textfinder2 test = new Textfinder2(new ByteArrayInputStream(s.getBytes()), 4);
        Textfinder2 test2 = new Textfinder2(new ByteArrayInputStream(s2.getBytes()), 4);
        Textfinder2 test3 = new Textfinder2(new ByteArrayInputStream(s3.getBytes()), 4);
        
        System.out.println(test.gibHaeufigkeit("Test"));
        test.gibWoerter();
        System.out.println(test2.gibHaeufigkeit("Text"));
        test2.gibWoerter();
        System.out.println(test3.gibHaeufigkeit("Welt"));
        test3.gibWoerter();
    }
    
    private InputStream stream;
    private int wert;
    private ArrayList<String> liste = new ArrayList();
    
    public Textfinder2(InputStream stream, int wert) throws IOException {
        this.liste = new ArrayList();       
        int symbol = stream.read(); 
        
        while(symbol != -1) {
           
            StringBuilder wort = new StringBuilder();
            
            while((symbol >= 'a' && symbol <= 'z') 
                || (symbol >= 'A' && symbol <= 'Z')) {
               
                wort.append((char) symbol);
                symbol = stream.read();
            }
           
            if(wort.length() >= wert) {
                liste.add(wort.toString());
            }           
            symbol = stream.read();
        }       
        stream.close();
       
//        for(int i = 0; i < liste.size(); i++) {
//            System.out.println(liste.get(i));
//        }
    }
    
    public Set<String> gibWoerter() throws IOException {
        int laenge = liste.size();
        Set<String> woerter = new HashSet<>();
        
        if(laenge > 0) {
            for(int i = 0; i < laenge; i++) {
                woerter.add(liste.get(i));
            }
        }
        
        System.out.println(woerter.toString());
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
    
}
