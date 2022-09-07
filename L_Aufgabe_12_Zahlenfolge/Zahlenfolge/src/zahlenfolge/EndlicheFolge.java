
package zahlenfolge;

import java.util.NoSuchElementException;

/**
 *
 * @author Lukas
 */
public class EndlicheFolge implements Zahlenfolge {
    
    private int[] folge;
    private int position;
    
    public EndlicheFolge(int[] folge) {
        this.folge = folge;
        this.position = 0;
    }

    @Override
    public boolean hatNaechstes() {
        boolean ergebnis = false;
        
        if(position <= (this.folge.length -1)) {
            ergebnis = true;             
        }        
        return ergebnis;
    }

    @Override
    public int gibNaechstes() throws NoSuchElementException {
        int ergebnis;
        
        try {
             ergebnis = this.folge[position];
             position++;   
             
        } catch(Exception e) {            
            throw new NoSuchElementException();            
        }        
        return ergebnis;
    }   
    
}
