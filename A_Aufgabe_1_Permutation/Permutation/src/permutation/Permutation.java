package permutation;

/**
 * Verwaltet lexigrafisch geordnete Permutationen.
 * @author Hugo
 */
public class Permutation {
    
    /**
     * Speichert die Permutation.
     */
    private int[] feld;
    
    
    /**
     * Erstellt eine geordnete Anordnung von Zahlen mit der Anzahl n
     * von 0 bis n - 1. 
     * @param n Anzahl der Zahlen
     */
    public Permutation(int n) {
        this.feld = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            this.feld[i] = i;
        }
    }
    
    /**
     * Gibt die Permutation als Text aus.
     * @return Permutation als String
     */
    public String gibAlsText() {
        String text = "";
        text = text + this.feld[0];
        for (int i = 1; i < this.feld.length; i++) {
            text = text + "-" + this.feld[i];
        }
        return text;
    }
    
    /**
     * Berechnet die lexikografisch nächste Permutation.
     * @return true wenn die Permutation nicht bereits die letzte war
     */
    public boolean naechstePermutation() {
        
        boolean nichtLetzte = false;
        int zaehler = this.feld.length - 1;
        
        /* Prueft ob letzte Permution schon erreicht ist und  setzt
        Zaehler auf Stelle auf Array,
        die durch nächst-höhere Zahl erstetzt wird. */
        while (zaehler > 0 && !nichtLetzte) {
            if (this.feld[zaehler] > this.feld[zaehler - 1]) {
                nichtLetzte = true;
            }
            zaehler--;
        }
        
        
        int zwischenspeicher;
        int stelleNachVorne = this.feld.length - 1;
        if (nichtLetzte) {
            /* Findet nächsthöhere Zahl */
            while (this.feld[zaehler] > this.feld[stelleNachVorne]) {
                stelleNachVorne--;
            }
            /*Tauscht beide Zahlen */
            zwischenspeicher = this.feld[stelleNachVorne];
            this.feld[stelleNachVorne] = this.feld[zaehler];
            this.feld[zaehler] = zwischenspeicher;
            /* spiegelt Reihenfolge aller Zahlen nach Zähler */
            for (int j = (this.feld.length - zaehler - 1) / 2;
                    j > 0; j--) {
                zwischenspeicher = this.feld[this.feld.length - j];
                this.feld[this.feld.length - j] =  this.feld[zaehler + j];
                this.feld[zaehler + j] = zwischenspeicher;
            } 
        }
        return nichtLetzte;
    }
}
