
package folge;

import java.util.function.IntBinaryOperator;

/**
 *
 * @author Lukas
 */
public class TestUnendlicheFolge {
    
    public static void main(String[] args) {        
        
        IntBinaryOperator io = (x, y) -> x + y;        
        
        UnendlicheFolge folge = new UnendlicheFolge(0, 1, io);
        
        System.out.println(folge.gibWert());
        System.out.println(folge.gibWert());
        System.out.println(folge.gibWert());
        System.out.println(folge.gibWert());
        System.out.println(folge.gibWert());
        System.out.println(folge.gibWert());
        System.out.println(folge.gibWert());
        System.out.println(folge.gibWert());
        System.out.println(folge.gibWert());
        System.out.println(folge.gibWert());
        System.out.println(folge.gibWert());
        System.out.println(folge.gibWert());
        
        Object v = "java".substring(2);
        System.out.println(v);
        
    }   
    
}
