
package operator;

/**
 * Diese Klasse berechnet die Fakultät einer Zahl.
 * @author Lukas
 */
public class Fakultaet extends Operator {
    
    /**
     * Beispielwert für den Beispiel Aufruf.
     */
    private final double beispielWert = 10.0;
    
    /**
     * Name der Klasse.
     */
    private final String name = "Fakultät";
    
    /**
     * Konstruktor der Klasse Fakultaet.
     */
    public Fakultaet() {        
    }
    
    /**
     * Überschriebene Methode wendeAn, diese berechnet die Fakultät des 
     * übergebenen Wertes.
     * @param argument Wert welcher der Methode zur Berechnung übergeben wird.
     * @return Rückgabe Fakultät vom übergebenen argument.
     */
    @Override
    public double wendeAn(double argument) {
        double ergebnis = 1.0;
        for(int i = 1; i <= argument; i++) {
            ergebnis = ergebnis * i;
        }
        return ergebnis;
    }
    
    /**
     * Überschriebene Methode beispielAufruf.
     * @return Rückgabe der Rechnung.
     */
    @Override
    public double beispielAufruf() {
        double ergebnis = 1.0;
        for(int i = 1;i <= this.beispielWert;i++) {			
            ergebnis = ergebnis * i;
        }
        return ergebnis;
    }
    
    /**
     * Überschriebene Methode beispielText.
     * @return Rückgabe Beispieltext.
     */
    @Override
    public String beispielText() {
        return "new Fakultaet().wendeAn(" 
                + this.beispielWert + ")" + " = " + this.beispielAufruf();
    }
    
    /**
     * Überschriebene Methode gibNamen, diese gibt den Namen der Klasse zurück.
     * @return Rückgabe Fakultät.
     */
    @Override
    public String gibNamen() {
        return this.name;
    }
    
}
