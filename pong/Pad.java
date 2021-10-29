public class Pad {
    private Obdlznik zobrazenie;
    
    public Pad(boolean jePravy) {
        this.zobrazenie = new Obdlznik();
        this.zobrazenie.zmenStrany(10, 50);
        
        if (jePravy) {
            this.zobrazenie.posunVodorovne(230);
        } else {
            this.zobrazenie.posunVodorovne(-60);
        }
        
        this.zobrazenie.posunZvisle(75);
        this.zobrazenie.zobraz();
    }
}
