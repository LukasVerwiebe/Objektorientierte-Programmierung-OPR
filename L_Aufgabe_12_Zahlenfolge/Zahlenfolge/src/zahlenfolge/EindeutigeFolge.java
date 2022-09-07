
package zahlenfolge;

import java.util.NoSuchElementException;

/**
 *
 * @author Lukas
 */
public class EindeutigeFolge implements Zahlenfolge {
    
    private PushBackFolge folge;
    
    public EindeutigeFolge(Zahlenfolge folge) {
        this.folge = (PushBackFolge) (folge instanceof PushBackFolge 
                ? folge 
                : new PushBackFolge(folge));
    }

    @Override
    public boolean hatNaechstes() {
        return this.folge.hatNaechstes();
    }

    @Override
    public int gibNaechstes() throws NoSuchElementException {
        int rueckgabeWert;
        int naechstesElement;
        
        if(this.folge.hatNaechstes()) {
            rueckgabeWert = this.folge.gibNaechstes();
            naechstesElement = rueckgabeWert;
            while(this.folge.hatNaechstes() 
                    && (naechstesElement == rueckgabeWert)) {
                naechstesElement = this.folge.gibNaechstes();
            }
            if(naechstesElement != rueckgabeWert) {
                this.folge.schreibeZurueck(naechstesElement);
            }
        } else {
            throw new NoSuchElementException();
        }
        return rueckgabeWert;
    }
    
    
}
