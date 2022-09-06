
package personal;

/**
 *
 * @author Lukas
 */
public class Vorgesetzter extends Mitarbeiter {   
    
    public Vorgesetzter(String name) {
        super(name);
        this.titel = "Vorgesetzter";
        this.bestLimit = -1;
    }
    
    public void setzeBestelllimit(int wert) {
        this.bestLimit = wert;
    }
    
    @Override
    public boolean darfBestellen(int wert) {
        return wert <= ((bestLimit == -1) 
                ? super.bestLimit 
		: this.bestLimit);
    }
    
    @Override
    public String gibHierarchie() {
        String hierarchie = null;
        if(this.vorgesetzter != null) {
            hierarchie = this.vorgesetzter.gibHierarchie() + "\n" + this.titel + " " + this.name; 
        } else {
            hierarchie = this.titel + " " +  this.name;
        }
        return hierarchie;
    }
    
}
