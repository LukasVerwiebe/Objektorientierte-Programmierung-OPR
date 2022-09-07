
package textverarbeitung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.StringTokenizer;

/**
 *
 * @author Lukas
 */
public class Textverarbeiter {
    
    private static final String TRENNZEICHEN = " .,:;!?-()";
    private Wortverarbeiter verarbeiter;
    
    public Textverarbeiter(Wortverarbeiter wort) {
        this.verarbeiter = wort;
    }
    
    public void verarbeite(Reader reader) throws IOException {
        BufferedReader zeileLesen = new BufferedReader(reader);
        String zeile = zeileLesen.readLine();
        StringTokenizer tokenizer;
        
        while(zeile != null) {
            tokenizer = new StringTokenizer(zeile, Textverarbeiter.TRENNZEICHEN);
            while(tokenizer.hasMoreElements()) {
                this.verarbeiter.verarbeite(tokenizer.nextToken());
            }
            zeile = zeileLesen.readLine();
            this.verarbeiter.verarbeiteZeilenende();
        }        
    }
    
}
