
package zahlenfolge;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 *
 * @author Lukas
 */
public class PushBackFolge implements Zahlenfolge {
    
    private Zahlenfolge folge;
    private List<Integer> list;
    
    public PushBackFolge(Zahlenfolge folge) {
        this.folge = folge;
        this.list = new LinkedList();
    }
    
    public void schreibeZurueck(int wert) {
        this.list.add(wert);
    }

    @Override
    public boolean hatNaechstes() {
        return !this.list.isEmpty() || this.folge.hatNaechstes();
    }

    @Override
    public int gibNaechstes() throws NoSuchElementException {
        int rueckgabeWert;
        if(!this.list.isEmpty()) {
            rueckgabeWert = this.list.remove(0);
        } else {
            rueckgabeWert = this.folge.gibNaechstes();
        }
        return rueckgabeWert;
    }
    
    
    
}
