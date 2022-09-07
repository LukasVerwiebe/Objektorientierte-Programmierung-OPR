
package operator;

/**
 * Diese Klasse wird als Zwischenstück zwischen Operator und den beiden 
 * Binären Operatoren Addierer und Dividierer verwendet wird, diese vererbt
 * ihre Methoden an die beiden Klassen weiter.
 * @author Lukas
 */
public class BinaererOperator extends Operator {
    
    /**
    * Standard Operator.
    */
    public BinaererOperator() {        
    }
    
    /**
     * Überschriebene Methode wendeAn, diese führt hier keine Berechnung durch.
     * @param argument Wert welcher der Methode zur Berechnung übergeben wird.
     * @return Rückgabe 0, da in dieser Klasse keine Berechnung stattfindet.
     */
    @Override
    public double wendeAn(double argument) {
        return 0;
    }
    
    /**
     * Überschriebene Methode beispielAufruf, diese führt hier keine 
     * Berechnung durch.
     * @return Rückgabe 0, da in dieser Klasse keine Berechnung stattfindet.
     */
    @Override
    public double beispielAufruf() {
        return 0;
    }
    
    /**
     * Überschriebene Methode beispielText, diese führt hier keine 
     * Berechnung durch.
     * @return Rückgabe null, da in dieser Klasse kein Beispiel verwendet wird.
     */
    @Override
    public String beispielText() {
        return null;
    }
    
    /**
     * Überschriebene Methode gibNamen, diese führt hier keine 
     * Aktion aus.
     * @return Rückgabe null, da in dieser Klasse kein Beispiel verwendet wird.
     */
    @Override
    public String gibNamen() {
        return null;
    }
    
}
