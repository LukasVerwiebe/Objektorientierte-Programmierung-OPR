
package carsharing;

/**
 *
 * @author Lukas
 */
public class Buchung {
    
    private Fahrzeug fahrzeug;
    private Zeitraum startZeit;
    private Zeitraum endZeit;
    
    public Buchung(Fahrzeug fahrzeug, Zeitraum startZeit, Zeitraum endZeit) {
        this.fahrzeug = fahrzeug;
        this.startZeit = startZeit;
        this.endZeit = endZeit;
    }
    
    public Buchung(Zeitraum startZeit, Zeitraum endZeit) {
        this.startZeit = startZeit;
        this.endZeit = endZeit;
    }
    
    public Zeitraum gibStartZeit() {
        return this.startZeit;
    }
    
    public Zeitraum gibEndZeit() {
        return this.endZeit;
    }
    
    public Fahrzeug gibFahrzeug() {
        return this.fahrzeug;
    }
    
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
