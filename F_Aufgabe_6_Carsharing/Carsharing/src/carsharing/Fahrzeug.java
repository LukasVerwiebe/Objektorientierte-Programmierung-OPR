
package carsharing;

/**
 *
 * @author Lukas
 */
public class Fahrzeug extends Fahrzeugmanager{
    
    private String fahrzeugName;
    private String standort;
    
    public Fahrzeug(String name, String standort) {
        this.fahrzeugName = name;
        this.standort = standort;
    }
    
    public String gibNamen() {
        return this.fahrzeugName;
    }
    
    public String gibStandort() {
        return this.standort;
    }
    
}
