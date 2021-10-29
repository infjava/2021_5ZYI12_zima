public class Stena {
    private Obdlznik zobrazenie;
    
    public Stena(boolean jeDolna) {
        this.zobrazenie = new Obdlznik();
        this.zobrazenie.zmenStrany(300, 3);
        this.zobrazenie.posunVodorovne(-60);
        if (jeDolna) {
            this.zobrazenie.posunZvisle(247);
        } else {
            this.zobrazenie.posunZvisle(-50);
        }
        this.zobrazenie.zmenFarbu("black");
        this.zobrazenie.zobraz();
    }
}
