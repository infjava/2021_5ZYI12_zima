public class Pad {
    private Obdlznik zobrazenie;
    private int poziciaY;
    
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
        
        this.poziciaY = 150;
    }
    
    public void posunHore() {
        if (this.poziciaY >= 30) {
            this.zobrazenie.posunZvisle(-5);
            this.poziciaY -= 5;
        }
    }
    
    public void posunDole() {
        if (this.poziciaY <= 270) {
            this.zobrazenie.posunZvisle(5);
            this.poziciaY += 5;
        }
    }
}
