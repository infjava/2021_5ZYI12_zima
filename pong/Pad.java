public class Pad {
    private Obdlznik zobrazenie;
    private int poziciaY;
    private int poziciaX;
    
    public Pad(boolean jePravy) {
        this.zobrazenie = new Obdlznik();
        this.zobrazenie.zmenStrany(10, 50);
        
        if (jePravy) {
            this.zobrazenie.posunVodorovne(230);
            this.poziciaX = 295;
        } else {
            this.zobrazenie.posunVodorovne(-60);
            this.poziciaX = 5;
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
    
    public boolean kolidujeS(Lopta lopta) {
        // pad je zvacseny pre potreby kontroly kolizii o polomer lopty
        int padX1 = this.poziciaX - 10;
        int padX2 = this.poziciaX + 10;
        int padY1 = this.poziciaY - 30;
        int padY2 = this.poziciaY + 30;
        int loptaX = lopta.getPoziciaX();
        int loptaY = lopta.getPoziciaY();
        
        return padX1 <= loptaX && loptaX <= padX2
                && padY1 <= loptaY && loptaY <= padY2;
    }
}
