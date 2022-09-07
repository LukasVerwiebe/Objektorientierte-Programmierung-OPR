
package operator;

/**
 * Zweck dieser Aufgabe ist es, die wichtigen Konzepte der folgenden Themen zu 
 * erlernen -Hierachie von Klassen, Überschreiben von Methoden, abstrakte 
 * Klassen und Methoden.
 * @author Lukas
 */
public abstract class Operator {
    
    /**
    * Eine abstrakte Methode, umd den Operator auf das übergebene Argument 
    * anzuwenden.
    * @param argument Wert für die Berechnung
    * @return Wert der durchgeführten Berechnung
    */
    public abstract double wendeAn(double argument);
    
    /**
     * Diese Methode soll einen Beispielaufruf durchführen.
     * @return Rückgabe eines Berechneten Wertes.
     */
    public abstract double beispielAufruf();
    
    /**
     * Diese Methode soll einen BeispielText liefern.
     * @return Rückgabe eines Beispieltextes.
     */
    public abstract String beispielText();
    
    /**
     * Diese Methode gibt den Namen des Objekts an.
     * @return gibt den Namen des Objekts zurück.
     */
    public abstract String gibNamen();
    
    /**
    * Eine (Template-)Methode, durch die der Operator eine textuelle Information
    * über sich gibt.
    * @return textuelle Information über den Operator
    */
    public String gibInfo() {
        return "<p>" + this.gibNamen() + "</p><p>Beispielaufruf: " 
                + this.beispielText() + "</p>";
    } 
    
}
