
package textverarbeitung;

import java.util.ArrayList;
import java.util.Collection;
import static java.util.Collections.sort;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Lukas
 */
public class Indexierer implements Wortverarbeiter {
    
    private HashMap<String, HashSet<Integer>> gefundeneWoerter;
    private HashSet<String> ausschlussWoerter;
    private int zeilenIndex;
    
    public Indexierer(Collection<String> index) {
        this.gefundeneWoerter = new HashMap<String, HashSet<Integer>>();
        this.ausschlussWoerter = new HashSet<String>();
        this.zeilenIndex = 1;
        
        Iterator<String> iterator = ausschlussWoerter.iterator();
        while(iterator.hasNext()) {
            this.ausschlussWoerter.add(iterator.next());
        }
    }
    
    public List<String> gibWoerter() {
        ArrayList<String> rueckgabeListe = new ArrayList<String>(this.gefundeneWoerter.keySet());
        sort(rueckgabeListe);
        return rueckgabeListe;
    }
    
    public String gibZeilennummern(String wort) {
        String rueckgabeZeichenkette = "";
        
        if(this.gefundeneWoerter.containsKey(wort)) {
            HashSet<Integer> zeilenListe = this.gefundeneWoerter.get(wort);
            Iterator<Integer> iterator = zeilenListe.iterator();
            while(iterator.hasNext()) {
                rueckgabeZeichenkette = rueckgabeZeichenkette + "" + iterator.next();
                if(iterator.hasNext()) {                    
                    rueckgabeZeichenkette = rueckgabeZeichenkette + ", ";
                }
            }
        }        
        return rueckgabeZeichenkette;
    }

    @Override
    public void verarbeite(String wort) {
        if(!this.ausschlussWoerter.contains(wort)) {
            if(this.gefundeneWoerter.containsKey(wort)) {
                this.gefundeneWoerter.get(wort).add(this.zeilenIndex);
            } else {
                HashSet zeilenListe = new HashSet<Integer>();
                zeilenListe.add(this.zeilenIndex);
                this.gefundeneWoerter.put(wort, zeilenListe);
            }
        }
    }

    @Override
    public void verarbeiteZeilenende() {
        this.zeilenIndex++;
    }
    
}
