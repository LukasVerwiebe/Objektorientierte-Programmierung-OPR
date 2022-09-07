
package personal;

/**
 * In dieser Klasse wurden die Funktionen für die Vorgesetzten erstellt
 * Die Klasse Erbt die Funktionalitäten von Mitarbeiter
 * @author Lukas
 *
 */
public class Vorgesetzter extends Mitarbeiter {   
    
    /**
     * Konstruktor für die Klasse Vorgesetzter
     * @param name 
     */
    public Vorgesetzter(String name) {
        super(name);
        this.titel = "Vorgesetzter";
        this.bestLimit = -1;
    }
    
    /**
     * Setter: Bestelllimit
     * @param wert 
     */
    public void setzeBestelllimit(int wert) {
        this.bestLimit = wert;
    }
    
    /**
     * Überschreiben der Mitarbeiter Methode darfBestellen
     * Die Methode prüft ob ein Mitarbeiter eine Bestellung auslösen darf
     * @param wert
     * @return 
     */
    @Override
    public boolean darfBestellen(int wert) {
        return wert <= ((bestLimit == -1) 
                ? super.bestLimit 
		: this.bestLimit);
    }
    
    /**
     * Überschreiben der Mitarbeiter Methode gibHierarchie
     * In der Mehtode muss geprüft werden ob der Vorgesetzte ebenfalls
     * einen Vorgesetzten hat oder nicht.
     * @return 
     */
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
