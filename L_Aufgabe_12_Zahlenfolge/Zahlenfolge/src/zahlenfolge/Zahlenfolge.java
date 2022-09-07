
package zahlenfolge;

import java.util.NoSuchElementException;

/**
 *
 * @author Lukas
 */
public interface Zahlenfolge {
    
    boolean hatNaechstes();
    
    int gibNaechstes() throws NoSuchElementException;
    
}
