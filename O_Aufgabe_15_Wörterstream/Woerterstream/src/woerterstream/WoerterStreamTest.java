
package woerterstream;

/**
 *
 * @author Lukas
 */
public class WoerterStreamTest {
    
     public static void main(String[] args) {
        
        Woerterstream stream = new Woerterstream();
        
        stream.gibStream().limit(100).forEach(System.out::println);
        System.out.println("ST " + stream.gibWerte());        
    }    
}
