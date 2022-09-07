
package operator;

/**
 * Klasse für die Duchführung einer Addition.
 * @author Lukas
 */
public class Addierer extends BinaererOperator {
    
    /**
     * Initialisierungswert für den Konstruktor.
     */
    private final double wert;
    
    /**
     * Beispielwert für den Beispiel Aufruf.
     */
    private final double beispielWert = 10.0;
    
    /**
     * Name der Klasse.
     */
    private final String name = "Addierer";
    
    /**
     * Konstruktor der Klasse Addierer.
     * @param wert this.wert
     */
    public Addierer(double wert) {
        this.wert = wert;
    }
    
    /**
     * Überschriebene Methode wendeAn, diese führt eine Addition mit this.wert
     * und dem in der Methode übergebenen Argument durch.
     * @param argument Wert welcher der Methode zur Berechnung übergeben wird.
     * @return Rückgabe Addition von this.wert und dem argument.
     */
    @Override
    public double wendeAn(double argument) {
        double wert1 = this.wert;
        return wert1 + argument;
    }
    
    /**
     * Überschriebene Methode beispielAufruf.
     * @return Rückgabe der Rechnung.
     */
    @Override
    public double beispielAufruf() {
        double wert1 = this.wert;
        double wert2 = this.beispielWert;
        return wert1 + wert2;
    }
    
    /**
     * Überschriebene Methode beispielText.
     * @return Rückgabe Beispieltext.
     */
    @Override
    public String beispielText() {
        return "new Addierer(" + this.wert + ").wendeAn(" 
                + this.beispielWert + ")" + " = " + this.beispielAufruf();
    }
    
    /**
     * Überschriebene Methode gibNamen, diese gibt den Namen der Klasse zurück.
     * @return Rückgabe Addition.
     */
    @Override
    public String gibNamen() {
        return this.name;
    }
    
}
