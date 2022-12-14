
package carsharing;

/**
 * Klasse Zeitraum
 * @author Lukas
 */
public class Zeitraum {    
    // Initialisierung Variablen
    private String datum;
    private long jahr, monat, tag, stunde, minute;
    
    /**
     * Konstruktor Zeitraum
     * @param datumZeit 
     */
    public Zeitraum(String datumZeit) {
        this.datum = datumZeit;          
        this.jahr = new Long(datumZeit.substring(0, 4));
        this.monat = new Long(datumZeit.substring(5, 7));
        this.tag = new Long(datumZeit.substring(8, 10));
        this.stunde = new Long(datumZeit.substring(11, 13));
        this.minute = new Long(datumZeit.substring(14, 16));           
    }
    
//    @Override
//    public boolean equals(Object obj) {
//        boolean sindGleich = false;
//        if(obj instanceof Zeitraum) {
//            Zeitraum z = (Zeitraum) obj;
//            sindGleich = (this.stunde - z.stunde) 
//                    + (this.minute - z.minute) 
//                    + (this.jahr - z.jahr) 
//                    + (this.monat - z.monat) 
//                    + (this.tag - z.tag) == 0;
//        }
//        return sindGleich;
//    }
    
    /**
     * Getter: Datum
     * @return 
     */
    public String gibDatum() {
        return this.datum;
    }
    
    /**
     * Getter: Jahr
     * @return 
     */
    public long gibJahr() {
        return this.jahr;
    }
    
    /**
     * Getter: Monat
     * @return 
     */
    public long gibMonat() {
        return this.monat;
    }
    
    /**
     * Getter: Tag
     * @return 
     */
    public long gibTag() {
        return this.tag;
    }
    
    /**
     * Getter: Stunden
     * @return 
     */
    public long gibStunden() {
        return this.stunde;
    }
    
    /**
     * Getter: Minuten
     * @return 
     */
    public long gibMinuten() {
        return this.minute;
    }   
}
