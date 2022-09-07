
package personal;

/**
 * In dieser Klasse wurden die Testfälle für die Klassen Mitarbeiter und 
 * Vorgesetzter realisiert.
 * @author Lukas
 */
public class PersonalTest {
    
    /**
     * Erstellung von Testwerten und Test der Klassenfunktionen
     * @param args 
     */
    public static void main(String[] args) {
        
        Mitarbeiter test = new Mitarbeiter("Hermann");      
        Vorgesetzter test2 = new Vorgesetzter("Martin");
        Mitarbeiter test3 = new Mitarbeiter("Max Mustermann");
        Vorgesetzter test4 = new Vorgesetzter("Marvin");
        
        test.setzeVorgesetzten(test2);
        test2.setzeBestelllimit(2000);
        //test.setzeAllgemeinesLimit(5);
        test2.setzeVorgesetzten(test4);
        
        System.out.println(test.darfBestellen(19));
        System.out.println(test.darfBestellen(21));
        System.out.println(test2.darfBestellen(2100));
        System.out.println(test2.darfBestellen(1500));
        System.out.println();
        
        System.out.println(test.gibInfo());
        System.out.println(test2.gibInfo());
        System.out.println(test3.gibInfo());
        System.out.println();
        
        System.out.println(test.gibHierarchie());
        System.out.println();
        System.out.println(test2.gibHierarchie());
        System.out.println();
        System.out.println(test3.gibHierarchie());
        System.out.println();
        System.out.println(test4.gibHierarchie());
        System.out.println();
    }
}
