package modul;

import java.util.HashMap;

/**
 * Klasse Modulverwaltung
 * @author Lukas
 */
public class Modulverwaltung {
    private final HashMap<String, Modul> module;
    
    public Modulverwaltung() {
        module = new HashMap<>();
    }
    
    public void fuegeHinzu(Modul m) throws IllegalArgumentException {
        try {
            if (module.isEmpty()) {
                module.put(m.getKuerzel(), m);
            }
            if (module.containsKey(m.getKuerzel())) {
                throw new IllegalArgumentException();
            } else {
                module.put(m.getKuerzel(), m);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Das Modul ist bereits vorhanden.");
        }
    }
    
}