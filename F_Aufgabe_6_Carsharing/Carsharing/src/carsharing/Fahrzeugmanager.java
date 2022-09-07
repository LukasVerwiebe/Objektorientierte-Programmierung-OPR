
package carsharing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * Klasse Fahrzeugmanager
 * @author Lukas
 */
public class Fahrzeugmanager {
    // Initialisierung Variablen
    private HashMap<String, Fahrzeug> zuordnung = new HashMap();
    private ArrayList<Buchung> buchungen = new ArrayList();
    
    /**
     * Leerer Konstruktor
     */
    public Fahrzeugmanager() {
        
    }
    
    /**
     * Methode zum hinzufügen eines neues Fahrzeugs
     * @param name
     * @param standort 
     */
    public void fuegeFahrzeugHinzu(String name, String standort) {
        Fahrzeug fahrzeug = new Fahrzeug(name, standort);
        if(zuordnung.containsKey(name)) {
            System.out.println("Das Fahrzeug ist bereits vorhanden!");
        } else {
            zuordnung.put(name, fahrzeug);
        }       
    }
    
    /**
     * Methode für die Zurückgabe aller Fahrzeugnamen
     * @return 
     */
    public ArrayList<String> gibFahrzeugnamen() {
        ArrayList<String> fahrzeugnamen = new ArrayList();        
        fahrzeugnamen.addAll(zuordnung.keySet());
        Collections.sort(fahrzeugnamen);
        
        for(int i = 0; i < fahrzeugnamen.size(); i++) {
            System.out.println(fahrzeugnamen.get(i));
        }
        return fahrzeugnamen;
    }
    
    /**
     * Zurückgabe aller Fahrzeuge eines Standorts
     * @param standort
     * @return 
     */
    public ArrayList<String> gibFahrzeugnamen(String standort) {
        // Liste mit den Namen, die am ende zurückgegeben wird.
        ArrayList<String> ausgabeNamen = new ArrayList();
        /*
        * Liste für die Namen der Fahrzeuge um mit diesen die Fahrzeug 
        * Objekte erhalten zu können.
        */
        ArrayList<String> fahrzeugnamen = new ArrayList();        
        fahrzeugnamen.addAll(zuordnung.keySet());
        Collections.sort(fahrzeugnamen);
        /*
        * Mittels der Namen werden die Fhrzeug Objekte in eine weitere Liste 
        * Übertragen.
        */
        ArrayList<Fahrzeug> standorteUndNamen = new ArrayList();
        if(zuordnung.size() > 0) {
            for(int i = 0; i < fahrzeugnamen.size(); i++) {
                standorteUndNamen.add(zuordnung.get(fahrzeugnamen.get(i)));
            }
        }
        /*
        * Wenn der Standort Name in dem Fahrzeug Objekt vorhanden ist, wird der 
        * Name des Fahrzeug in die Ausgabe Liste Übertragen.
        */
        if(zuordnung.size() > 0) {
            for(int i = 0; i < standorteUndNamen.size(); i++) {
                if(standorteUndNamen.get(i).gibStandort().equals(standort)) {
                    System.out.println(standorteUndNamen.get(i).gibNamen());
                    ausgabeNamen.add(standorteUndNamen.get(i).gibNamen());
                }
            }    
        } else {
            System.out.println("Die Liste ist leer!");
        }            
        return ausgabeNamen;
    }
    
    /**
     * Methode zum Buchen eines Fahrzeugs
     * @param name
     * @param start
     * @param ende
     * @return 
     */
    public boolean bucheFahrzeug(String name, String start, String ende) {        
        boolean ergebnis = false;
        boolean vorhanden = true;
        Fahrzeug fahrzeug = zuordnung.get(name);
        Zeitraum startZeit = new Zeitraum(start);
        Zeitraum endZeit = new Zeitraum(ende);
        
        Buchung buchung = new Buchung(fahrzeug, startZeit, endZeit);
        
        if(buchungen.size() > 0) {
            for(int i = 0; i < buchungen.size(); i++) {
                if(buchung.gibStartZeit().gibDatum().equals(buchungen.get(i).gibStartZeit().gibDatum())) {
                    vorhanden = false;
                    i = buchungen.size() + 1;
                }
            }
        }        
        if(vorhanden == true || buchungen.size() == 0) {
            buchungen.add(buchung);
            ergebnis = true;
        }        
        return ergebnis;
    }
    
    /**
     * Rückgabe einer Liste aller Verfügbaren Fahrzeuge
     * @param standort
     * @param start
     * @param ende
     * @return 
     */
    public ArrayList<String> gibVerfuegbareFahrzeuge(String standort, String start, String ende) {
        String text = "";
        ArrayList<String> buchungListe = new ArrayList();
        Zeitraum zeitStart = new Zeitraum(start);
        Zeitraum zeitEnde = new Zeitraum(ende);
        Buchung buchung = new Buchung(zeitStart, zeitEnde);
        
        for(int i = 0; i < buchungen.size(); i++) {
            if(buchungen.get(i).gibFahrzeug().gibStandort().equals(standort)
                    && (buchung.istVerfuegbar(zeitStart, zeitEnde, 
                            buchungen.get(i).gibStartZeit(), buchungen.get(i).gibEndZeit()))) {
                
                text = buchungen.get(i).gibFahrzeug().gibNamen();
                buchungListe.add(text);
            }
            
        }       
        for(int i = 0; i < buchungListe.size(); i++) {
            System.out.println(buchungListe.get(i));
        }
        return buchungListe;
    }
    
}
