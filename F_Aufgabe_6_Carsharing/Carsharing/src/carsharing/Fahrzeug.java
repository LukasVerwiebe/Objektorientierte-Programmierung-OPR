
package carsharing;

/**
 * Klasse Fahrzeug erbt von Fahrzeugmanager
 * @author Lukas
 */
public class Fahrzeug extends Fahrzeugmanager{
    // Initialisierung Variablen
    private String fahrzeugName;
    private String standort;
    
    /**
     * Konstruktor Fahrzeug
     * @param name
     * @param standort 
     */
    public Fahrzeug(String name, String standort) {
        this.fahrzeugName = name;
        this.standort = standort;
    }
    
    /**
     * Getter: Namen
     * @return 
     */
    public String gibNamen() {
        return this.fahrzeugName;
    }
    
    /**
     * Getter: Standort
     * @return 
     */
    public String gibStandort() {
        return this.standort;
    }
    
}
