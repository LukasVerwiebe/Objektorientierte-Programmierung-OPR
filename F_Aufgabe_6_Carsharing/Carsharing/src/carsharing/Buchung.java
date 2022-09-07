
package carsharing;

/**
 * Klasse Buchung
 * @author Lukas
 */
public class Buchung {
    // Initialisierung Variablen
    private Fahrzeug fahrzeug;
    private Zeitraum startZeit;
    private Zeitraum endZeit;
    
    /**
     * Konstruktor mit Fahrzeug Objekt
     * @param fahrzeug
     * @param startZeit
     * @param endZeit 
     */
    public Buchung(Fahrzeug fahrzeug, Zeitraum startZeit, Zeitraum endZeit) {
        this.fahrzeug = fahrzeug;
        this.startZeit = startZeit;
        this.endZeit = endZeit;
    }
    
    /**
     * Konstruktor ohne Fahrzeug Objekt
     * @param startZeit
     * @param endZeit 
     */
    public Buchung(Zeitraum startZeit, Zeitraum endZeit) {
        this.startZeit = startZeit;
        this.endZeit = endZeit;
    }
    
    /**
     * Getter: Start Zeit
     * @return 
     */
    public Zeitraum gibStartZeit() {
        return this.startZeit;
    }
    
    /**
     * Getter: End Zeit
     * @return 
     */
    public Zeitraum gibEndZeit() {
        return this.endZeit;
    }
    
    /**
     * Getter: Fahrzeug Objekt
     * @return 
     */
    public Fahrzeug gibFahrzeug() {
        return this.fahrzeug;
    }
    
    /**
     * Prüfung ob ein Fahrzeug zur Verfügung steht
     * @param startNeu
     * @param endeNeu
     * @param startAlt
     * @param endeAlt
     * @return 
     */
    public boolean istVerfuegbar(Zeitraum startNeu, Zeitraum endeNeu, Zeitraum startAlt, Zeitraum endeAlt) {
        boolean ergebnis = false;
        if(!(startNeu.gibDatum().equals(startAlt.gibDatum())) 
                && !(endeNeu.gibDatum().equals(endeAlt.gibDatum()))) {
            ergebnis = true;
        } else if(startNeu.gibDatum().equals(startAlt.gibDatum()) 
                && endeNeu.gibDatum().equals(endeAlt)
                && startNeu.gibStunden() > endeAlt.gibStunden()) {
            ergebnis = true;
        } else if(startNeu.gibDatum().equals(startAlt) 
                && endeNeu.gibDatum().equals(endeAlt)
                && startNeu.gibStunden() < startAlt.gibStunden()
                && endeNeu.gibStunden() < startAlt.gibStunden()) {
            ergebnis = true;
        } else if(startNeu.gibDatum().equals(startAlt.gibDatum()) 
                && endeNeu.gibDatum().equals(endeAlt)
                && startNeu.gibStunden() == endeAlt.gibStunden() 
                && startNeu.gibMinuten() > endeAlt.gibMinuten()) {
            ergebnis = true;
        }        
        return ergebnis;
    }
    
}
