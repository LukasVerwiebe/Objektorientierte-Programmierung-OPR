
package string;

import java.util.StringTokenizer;

/**
 * Diese Klasse erstellt die Tokens
 * @author Lukas
 */
public class Tokens {
    
    /**
     * Methode zum erstellen eines StringTokenizer Objektes
     * Die einzelnen Tokens werden in ein Array geschrieben und am Ende
     * zurückgegeben
     * @param text1
     * @param text2
     * @return 
     */
    public String[] tokens(String text1, String text2) {
        
        String[] ergebnis = new String[text1.length()];        
        StringTokenizer test = new StringTokenizer(text1, text2);
        
        for(int i = 0; i < text1.length(); i++) {
            if(test.hasMoreTokens()) {
                ergebnis[i] = test.nextToken();
            } else {
                i = i + text1.length();
            }            
        }        
        return ergebnis;
    }
    
}
