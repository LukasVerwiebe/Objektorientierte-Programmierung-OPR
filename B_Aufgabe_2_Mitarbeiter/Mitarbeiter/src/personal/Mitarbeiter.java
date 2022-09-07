
package personal;

/**
 * In dieser Klasse wurden die Funktionen für die Mitarbeiter erstellt
 * @author Lukas
 */
public class Mitarbeiter {
    // Initialisierung Variablen:
    protected String name;    
    protected int bestLimit = 20;    
    protected Vorgesetzter vorgesetzter;    
    protected String titel;
    /**
     * Konstruktor für Mitarbeiter
     * @param name 
     */
    public Mitarbeiter(String name) {
        this.name = name;
        this.titel = "Mitarbeiter";
    }
    
    /**
     * Setter: Bestelllimit
     * @param limit 
     */
    public void setzeAllgemeinesLimit(int limit) {
        this.bestLimit = limit;
    }
    
    /**
     * Setter: Vorgesetzter
     * @param vorgesetzter 
     */
    public void setzeVorgesetzten(Vorgesetzter vorgesetzter) {
        this.vorgesetzter = vorgesetzter;
    }
    
    /**
     * Überprüfung ob das Bestelllimit eingehalten wird
     * @param wert
     * @return 
     */
    public boolean darfBestellen(int wert) {
        return (wert <= this.bestLimit);
    }
    
    /**
     * Ausgabe der Mitarbeiterstruktur
     * @return 
     */
    public String gibInfo() {
        String info = null;        
        if(this.titel == "Vorgesetzter" && this.vorgesetzter != null) {
            info = "Ich bin " + this.titel + ", Name " + this.name 
                    + ". Mein Vorgesetzter ist " + this.vorgesetzter.name 
                    + ". Mein Bestelllimit ist " + this.bestLimit + " EUR.";
        } else if(this.titel == "Vorgesetzter" && this.vorgesetzter == null) {
            info = "Ich bin " + this.titel + ", Name " + this.name 
                    + ". Mein Bestelllimit ist " + this.bestLimit + " EUR.";
        } else if(this.titel == "Mitarbeiter" && this.vorgesetzter == null) {
            info = "Ich bin freier " + this.titel + ", Name " + this.name 
                    + ". Mein Bestelllimit ist " + this.bestLimit + " EUR.";
        } else if(this.titel == "Mitarbeiter" && this.vorgesetzter != null) {
            info = "Ich bin " + this.titel + ", Name " + this.name 
                    + ". Mein Vorgesetzter ist " + this.vorgesetzter.name 
                    + ". Mein Bestelllimit ist " + this.bestLimit + " EUR.";
        }        
        return info;
    }
    
    /**
     * Audgabe der Mitarbeiter Hierarchie
     * @return 
     */
    public String gibHierarchie() {
        String hierarchie = null;
        if(vorgesetzter != null) {
            hierarchie = this.vorgesetzter.gibHierarchie() + "\n" + this.titel + " " + this.name; 
        } else {
            hierarchie = "freier Mitarbeiter " + this.name;
        }
        return hierarchie;
    }
    
}
