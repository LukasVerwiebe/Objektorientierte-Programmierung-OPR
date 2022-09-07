
package operator;

/**
 * Klasse für die Duchführung einer Division.
 * @author Lukas
 */
public class Dividierer extends BinaererOperator {
    
    /**
     * Initialisierungswert für den Konstruktor.
     */
    private final double wert;
    
    /**
     * Beispielwert für den Beispiel Aufruf.
     */
    private final double beispielWert = 3.0;
    
    /**
     * Name der Klasse.
     */
    private final String name = "Dividierer";
    
    /**
     * Konstruktor der Klasse Addierer.
     * @param wert this.wert
     */
    public Dividierer(double wert) {
        this.wert = wert;
    }
    
    /**
     * Überschriebene Methode wendeAn, diese führt eine Division mit this.wert
     * und dem in der Methode übergebenen Argument durch.
     * @param argument Wert welcher der Methode zur Berechnung übergeben wird.
     * @return Rückgabe Division von this.wert und dem argument.
     */
    @Override
    public double wendeAn(double argument) {
        double wert1 = this.wert;
        return argument / wert1;
    }
    
    /**
     * Überschriebene Methode beispielAufruf.
     * @return Rückgabe der Rechnung.
     */
    @Override
    public double beispielAufruf() {
        double wert1 = this.wert;
        double wert2 = this.beispielWert;
        return wert2 / wert1;
    }
    
    /**
     * Überschriebene Methode beispielText.
     * @return Rückgabe Beispieltext.
     */
    @Override
    public String beispielText() {
        return "new Dividierer(" + this.wert + ").wendeAn(" 
                + this.beispielWert + ")" + " = " + this.beispielAufruf();
    }
    
    /**
     * Überschriebene Methode gibNamen, diese gibt den Namen der Klasse zurück.
     * @return Rückgabe Dividierer.
     */
    @Override
    public String gibNamen() {
        return this.name;
    }
    
}
