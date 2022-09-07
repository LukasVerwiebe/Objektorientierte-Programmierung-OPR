
package parser;

/**
 * Enthält abstrakte Instanzmethode int gibWert(Variablenbelegung), die den Wert
 * dieses Ausdrucks basierend auf der Variablenbelegung liefert.
 * @author Lukas
 */
public abstract class Ausdruck {
    
    public abstract int gibWert(Variablenbelegung belegung);

    @Override
    public String toString() {
        return "Ausdruck{" + '}';
    }    
    
}
