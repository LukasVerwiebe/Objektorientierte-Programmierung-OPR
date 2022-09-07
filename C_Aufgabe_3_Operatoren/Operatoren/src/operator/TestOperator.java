
package operator;

/**
 * Test Klasse zur Ausgabe der Beispieltexte.
 * @author Lukas
 */
public class TestOperator {
    
    public static void main(String[] args) {
        
        Operator test1 = new Addierer(5.0);
        System.out.println(test1.gibInfo());
        
        Operator test2 = new Dividierer(5.0);
        System.out.println(test2.gibInfo());
        
        Operator test3 = new Fakultaet();
        System.out.println(test3.gibInfo());
        
        //Operator test = new Operator();
        
    }
    
}
