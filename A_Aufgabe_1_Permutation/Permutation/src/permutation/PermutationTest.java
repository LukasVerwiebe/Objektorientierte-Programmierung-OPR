package permutation;

/**
 * In dieser Klasse wurden die Testfälle für die Klasse Permutation realisiert.
 * @author Lukas
 */
public class PermutationTest {

    /**
     * Testfälle für Permutation.
     * @param args wird nicht verwendet
     */
    public static void main(String[] args) {
        
        Permutation testobjekt = new Permutation(10);
        
        System.out.println(testobjekt.gibAlsText());
        System.out.println(testobjekt.naechstePermutation());
        System.out.println(testobjekt.gibAlsText());
        
        for (int i = 362878; i > 0; i--) {
            testobjekt.naechstePermutation();
        }
        
        System.out.println(testobjekt.gibAlsText());
        System.out.println(testobjekt.naechstePermutation());
        System.out.println(testobjekt.gibAlsText());
        
        for (int i = 3265918; i > 0; i--) {
            testobjekt.naechstePermutation();
        }
        
        System.out.println(testobjekt.gibAlsText());
        System.out.println(testobjekt.naechstePermutation());
        System.out.println(testobjekt.gibAlsText());
        System.out.println(testobjekt.naechstePermutation());
        System.out.println(testobjekt.gibAlsText());
    }
}
