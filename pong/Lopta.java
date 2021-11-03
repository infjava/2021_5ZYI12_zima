import java.util.Random;

public class Lopta {
    private Kruh zobrazenie;
    private int poziciaX;
    private int poziciaY;
    private int smerX;
    private int smerY;
    
    public Lopta() {
        Random nahodneCisla = new Random();
        this.poziciaY = nahodneCisla.nextInt(281) + 10;
        this.poziciaX = 150;
        
        this.zobrazenie = new Kruh();
        this.zobrazenie.zmenPriemer(10);
        this.zobrazenie.posunVodorovne(125);
        this.zobrazenie.posunZvisle(this.poziciaY - 65);
        this.zobrazenie.zobraz();
        
        if (nahodneCisla.nextBoolean()) {
            this.smerX = 5;
        } else {
            this.smerX = -5;
        }
        
        if (nahodneCisla.nextBoolean()) {
            this.smerY = 5;
        } else {
            this.smerY = -5;
        }
    }
    
    public void zrus() {
        this.zobrazenie.skry();
    }
    
    public void posun() {
        this.zobrazenie.skry();
        this.zobrazenie.posunVodorovne(this.smerX);
        this.zobrazenie.posunZvisle(this.smerY);
        this.zobrazenie.zobraz();
        //this.poziciaY = this.poziciaY - 5;
        this.poziciaX += this.smerX;
        this.poziciaY += this.smerY;
        
        if (this.poziciaY <= 5 || this.poziciaY >= 295) {
            this.smerY = -this.smerY;
        }
    }
    
    public boolean jeMimoNaPravo() {
        return this.poziciaX > 295;
    }
    
    public boolean jeMimoNaLavo() {
        return this.poziciaX < 5;
    }
}
