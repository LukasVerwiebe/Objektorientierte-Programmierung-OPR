package carsharing;

/**
 * Klasse für den Test der Aufgabe
 * @author Lukas
 */
public class Test {
    // Ausgabe und Eingabe von Testwerten
    public static void main(String[] args) {
        
        Fahrzeug fahrzeug1 = new Fahrzeug("Test 1", "Standort 1");
        Fahrzeug fahrzeug2 = new Fahrzeug("Test 2", "Standort 2");
        Fahrzeug fahrzeug3 = new Fahrzeug("Test 1", "Standort 3");
        
        Fahrzeugmanager fahrzeuge = new Fahrzeugmanager();
        
        fahrzeuge.fuegeFahrzeugHinzu("Test 1", "Standort 1");
        fahrzeuge.fuegeFahrzeugHinzu("Test 2", "Standort 2");
        fahrzeuge.fuegeFahrzeugHinzu("Test 3", "Standort 3");
        fahrzeuge.fuegeFahrzeugHinzu("Test 4", "Standort 1");
        
        fahrzeuge.gibFahrzeugnamen();
        System.out.println();
        fahrzeuge.gibFahrzeugnamen("Standort 1");
        System.out.println();
        
        System.out.println(fahrzeuge.bucheFahrzeug("Test 1", "2005/04/22 09:35", "2005/04/23 10:30"));
        System.out.println(fahrzeuge.bucheFahrzeug("Test 2", "2005/05/22 09:35", "2005/06/23 10:30"));
        System.out.println(fahrzeuge.bucheFahrzeug("Test 3", "2005/07/22 09:35", "2005/08/23 10:30"));        
        System.out.println(fahrzeuge.bucheFahrzeug("Test 4", "2005/11/22 09:35", "2005/12/23 10:30"));
        System.out.println(fahrzeuge.bucheFahrzeug("Test 4", "2005/11/22 09:35", "2005/12/23 10:30"));
        System.out.println();
        
        fahrzeuge.gibVerfuegbareFahrzeuge("Standort 1", "2005/04/22 09:35", "2005/04/23 10:30");
        System.out.println();
        fahrzeuge.gibVerfuegbareFahrzeuge("Standort 1", "2006/04/22 09:35", "2006/04/23 10:30");
        System.out.println();
        fahrzeuge.gibVerfuegbareFahrzeuge("Standort 1", "2005/04/23 13:35", "2005/04/24 10:30");
    }
    
}
