
package zahlenfolge;

import java.util.NoSuchElementException;

/**
 *
 * @author Lukas
 */
public class FibonacciFolge implements Zahlenfolge {
    
    private int zahl0, zahl1;
    private int starteAlgorithmus;
    
    public FibonacciFolge() {
        this.zahl0 = 0;
        this.zahl1 = 1;
        this.starteAlgorithmus = 2;
    }

    @Override
    public boolean hatNaechstes() {
        return true;
    }

    @Override
    public int gibNaechstes() throws NoSuchElementException {
        int zahl2 = 2;
        if(starteAlgorithmus != 0) {
            zahl2 = zahl2 - this.starteAlgorithmus;
            this.starteAlgorithmus--;
        } else {
            zahl2 = this.zahl1 + this.zahl0;
            this.zahl0 = this.zahl1;
            this.zahl1 = zahl2;
        }
        return zahl2;
    }
    
    
    
}
