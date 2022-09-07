
package textvergleicher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 * Klasse Textvergleicher
 * @author Lukas
 */
public class Textvergleicher {
    
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
    
    /**
     * Vergleich der Texte miteinander
     * @param reader1
     * @param reader2
     * @return
     * @throws IOException 
     */
    public boolean sindGleich(Reader reader1, Reader reader2) throws IOException {
        boolean ergebnis = false;
        ArrayList<String> liste1 = new ArrayList();
        ArrayList<String> liste2 = new ArrayList();
        BufferedReader readerNeu1 = new BufferedReader(reader1);
        BufferedReader readerNeu2 = new BufferedReader(reader2);
        
        String zeile1 = readerNeu1.readLine();
        String zeile2 = readerNeu2.readLine();
        String satzzeichen = "., ";
        String textNeu1 = "";
        String textNeu2 = "";        
        
        while(zeile1 != null) {
            textNeu1 = textNeu1 + zeile1;
            zeile1 = readerNeu1.readLine();
        }
        while(zeile2 != null) {
            textNeu2 = textNeu2 + zeile2;
            zeile2 = readerNeu2.readLine();
        }
        
        StringTokenizer text1 = new StringTokenizer(textNeu1, satzzeichen);
        StringTokenizer text2 = new StringTokenizer(textNeu2, satzzeichen);
        
        while(text1.hasMoreElements()) {
            liste1.add(text1.nextToken());
        }
        while(text2.hasMoreElements()) {
            liste2.add(text2.nextToken());
        }        
        Collections.sort(liste1);
        Collections.sort(liste2);
        
        if(liste1.size() == liste2.size()) {
            for(int i = 0; i < liste1.size(); i++) {
                if(liste2.contains(liste1.get(i))) {                    
                    ergebnis = true;
                    for(int j = 0; j < liste2.size(); j++) {
                        if(liste1.contains(liste2.get(i))) {
                            ergebnis = true;
                        } else {
                            ergebnis = false;
                            i = liste1.size();
                            j = liste2.size();
                        }
                    }
                } else {
                    ergebnis = false;
                    i = liste1.size();
                }
            }
        } else {
            ergebnis = false;
        }     
        
        readerNeu1.close();
        readerNeu2.close();
        return ergebnis;
    }
    
}
