
package personal;

/**
 *
 * @author Lukas
 */
public class Mitarbeiter {
    
    protected String name;    
    protected int bestLimit = 20;    
    protected Vorgesetzter vorgesetzter;    
    protected String titel;
    
    public Mitarbeiter(String name) {
        this.name = name;
        this.titel = "Mitarbeiter";
    }
    
    public void setzeAllgemeinesLimit(int limit) {
        this.bestLimit = limit;
    }
    
    public void setzeVorgesetzten(Vorgesetzter vorgesetzter) {
        this.vorgesetzter = vorgesetzter;
    }
    
    public boolean darfBestellen(int wert) {
        return (wert <= this.bestLimit);
    }
    
    public String gibInfo() {
        String info = null;        
        if(this.titel == "Vorgesetzter" && this.vorgesetzter != null) {
            info = "Ich bin " + this.titel + ", Name " + this.name 
                    + ". Mein Vorgesetzter ist " + this.vorgesetzter.name 
                    + ". Mein Bestelllimit ist " + this.bestLimit + " EUR.";
        } else if(this.titel == "Vorgesetzter" && this.vorgesetzter == null) {
            info = "Ich bin " + this.titel + ", Name " + this.name 
                    + ". Mein Bestelllimit ist " + this.bestLimit + " EUR.";
        } else if(this.titel == "Mitarbeiter" && this.vorgesetzter == null) {
            info = "Ich bin freier " + this.titel + ", Name " + this.name 
                    + ". Mein Bestelllimit ist " + this.bestLimit + " EUR.";
        } else if(this.titel == "Mitarbeiter" && this.vorgesetzter != null) {
            info = "Ich bin " + this.titel + ", Name " + this.name 
                    + ". Mein Vorgesetzter ist " + this.vorgesetzter.name 
                    + ". Mein Bestelllimit ist " + this.bestLimit + " EUR.";
        }        
        return info;
    }
    
    public String gibHierarchie() {
        String hierarchie = null;
        if(vorgesetzter != null) {
            hierarchie = this.vorgesetzter.gibHierarchie() + "\n" + this.titel + " " + this.name; 
        } else {
            hierarchie = "freier Mitarbeiter " + this.name;
        }
        return hierarchie;
    }
    
}
