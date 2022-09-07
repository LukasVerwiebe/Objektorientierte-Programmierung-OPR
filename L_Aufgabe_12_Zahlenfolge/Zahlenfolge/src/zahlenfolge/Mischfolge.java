
package zahlenfolge;

import java.util.NoSuchElementException;

/**
 *
 * @author Lukas
 */
public class Mischfolge implements Zahlenfolge {
    
    private PushBackFolge folge0, folge1;
    
    public Mischfolge(Zahlenfolge folge0, Zahlenfolge folge1) {
        this.folge0 = (PushBackFolge) (folge0 instanceof PushBackFolge
                ? folge0
                : new PushBackFolge(folge0));
        this.folge1 = (PushBackFolge) (folge1 instanceof PushBackFolge
                ? folge1
                : new PushBackFolge(folge1));
    }

    @Override
    public boolean hatNaechstes() {
        return this.folge0.hatNaechstes() || this.folge1.hatNaechstes();
    }

    @Override
    public int gibNaechstes() throws NoSuchElementException {
        int zahl0, zahl1, rueckgabeWert;
        if(this.folge0.hatNaechstes() && !this.folge1.hatNaechstes()) {
            rueckgabeWert = this.folge0.gibNaechstes();
        } else if(!this.folge0.hatNaechstes() && this.folge1.hatNaechstes()) {
            rueckgabeWert = this.folge1.gibNaechstes();
        } else if(!this.folge0.hatNaechstes() && !this.folge1.hatNaechstes()) {
            throw new NoSuchElementException();
        } else {
            zahl0 = this.folge0.gibNaechstes();
            zahl1 = this.folge1.gibNaechstes();
            if(zahl0 < zahl1) {
                rueckgabeWert = zahl0;
                this.folge1.schreibeZurueck(zahl1);
            } else {
                rueckgabeWert = zahl1;
                this.folge0.schreibeZurueck(zahl0);
            }
        }
        return rueckgabeWert;
    }
    
}
