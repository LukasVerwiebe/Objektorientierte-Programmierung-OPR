
package folge;

import java.util.NoSuchElementException;
import java.util.function.IntBinaryOperator;

/**
 *
 * @author Lukas
 */
public class UnendlicheFolge {
    
    private int wert1;
    private int wert2;
    
    private boolean start;
    private boolean start2;
    
    private IntBinaryOperator operator;
    
    public UnendlicheFolge(int wert1, int wert2, IntBinaryOperator operator) {
        this.wert1 = wert1;
        this.wert2 = wert2;
        this.operator = operator;
        
        this.start = false;
        this.start2 = false;
    }
    
    public int gibWert() throws NoSuchElementException {
        int folgenWert = 0;
        
        if(!this.start) {
            folgenWert = this.wert1;
            this.start = true;
        } else if(!this.start2) {
            folgenWert = this.wert2;
            this.start2 = true;
        } else if(this.start && this.start2) {
            folgenWert = this.operator.applyAsInt(this.wert1, this.wert2);
            this.wert1 = this.wert2;
            this.wert2 = folgenWert;
        }
        return folgenWert;
    }
    
}
