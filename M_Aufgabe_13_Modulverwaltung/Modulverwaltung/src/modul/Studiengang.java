package modul;

/**
 * Klasse Studiengang
 * @author Lukas
 */
public enum Studiengang {
    IN_BA(true),
    MI_BA(true),
    WI_BA(true),
    IN_MA(false),
    MI_MA(false),
    WI_MA(false),
    IS_MA(false);
    
    private Studiengang(boolean bachelor) {
        this.istBachelorstudiengang = bachelor;
    }
    
    private final boolean istBachelorstudiengang;
    
    public boolean istBachelorstudiengang() {
        return istBachelorstudiengang;
    }
}