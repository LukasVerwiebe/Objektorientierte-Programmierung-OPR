
package woerterstream;

import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Klasse Woerterstream
 * @author Lukas
 */
public class Woerterstream {
    
    /**
     * Eingabe und Ausgabe von Testwerten
     * @param args 
     */
    public static void main(String[] args) {        
        Woerterstream stream = new Woerterstream();        
        stream.gibStream().limit(100).forEach(System.out::println);
        System.out.println("ST " + stream.gibWerte());
        
    }
    
    // Initialisierung Variablen:
    private Stream<String> woerter;
    private ArrayList<String> worterNeu;    
    private static final String text = " abcdefghijklmnopqrstuvwxyz";
    
    /**
     * Konstruktor Woerterstream
     */
    public Woerterstream() {
        this.worterNeu = new ArrayList();
        
        // Die Buchstaben in die ArrayList einlesen.
        if(worterNeu.size() <= text.length()) {
            for(int i = 0; i <= text.length(); i++) {
                if(i == 0) {
                    worterNeu.add(text.substring(0, i));
                } else {                    
                    worterNeu.add(text.substring(i -1, i));
                }                        
            }
        }
        System.out.println(worterNeu.get(27));
    }
    
    public Stream<String> gibStream() {
        
        this.woerter = Stream.generate(new Supplier<String>() {
            
            private int start = 1;
            private int ende = 2;
            private int pointer = 2;
            
            @Override
            public String get() {
                String teilwort = "";
                if(start >= worterNeu.size()) {
                    start = 1;
                    ende = 2;
                    pointer = 2;
                } else {
                    
                    teilwort = worterNeu.get(pointer) + text.substring(start, ende);
                    
                    if(pointer == worterNeu.size() -1) {
                        //if(ende < text.length()) {
                            start = start + 1;
                            ende = ende + 1;
                        //}                        
                        pointer = 2;
                    } else {
                       worterNeu.set(pointer, teilwort);                      
                       pointer = pointer + 1;
                       //System.out.println(pointer);
                    }                   
                }               
                //System.out.println("1" +teilwort);
                return teilwort;
            }        
        });
        
        return this.woerter;
    }
    
    /**
     * Rückgabe von Wert an Position 3
     * @return 
     */
    public String gibWerte() {
        return this.worterNeu.get(3);
    }
    
}
