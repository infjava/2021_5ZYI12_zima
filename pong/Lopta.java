public class Lopta {
    private Kruh zobrazenie;
    private int poziciaY;
    private int smerX;
    private int smerY;
    
    public Lopta() {
        this.zobrazenie = new Kruh();
        this.zobrazenie.zmenPriemer(10);
        this.zobrazenie.posunVodorovne(125);
        this.zobrazenie.posunZvisle(85);
        this.zobrazenie.zobraz();
        this.poziciaY = 150;
        this.smerX = 5;
        this.smerY = -5;
    }
    
    public void posun() {
        this.zobrazenie.skry();
        this.zobrazenie.posunVodorovne(this.smerX);
        this.zobrazenie.posunZvisle(this.smerY);
        this.zobrazenie.zobraz();
        //this.poziciaY = this.poziciaY - 5;
        this.poziciaY += this.smerY;
        
        if (this.poziciaY == 5 || this.poziciaY == 295) {
            this.smerY = -this.smerY;
        }
    }
}
