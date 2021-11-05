import java.util.Random;

public class Lopta {
    private Kruh zobrazenie;
    private int poziciaX;
    private int poziciaY;
    private int smerX;
    private int smerY;
    private int rychlost;
    
    public Lopta() {
        Random nahodneCisla = new Random();
        this.poziciaY = nahodneCisla.nextInt(281) + 10;
        this.poziciaX = 150;
        
        this.zobrazenie = new Kruh();
        this.zobrazenie.zmenPriemer(10);
        this.zobrazenie.posunVodorovne(125);
        this.zobrazenie.posunZvisle(this.poziciaY - 65);
        this.zobrazenie.zobraz();
        
        this.rychlost = 5;
        
        if (nahodneCisla.nextBoolean()) {
            this.smerX = 1;
        } else {
            this.smerX = -1;
        }
        
        if (nahodneCisla.nextBoolean()) {
            this.smerY = 1;
        } else {
            this.smerY = -1;
        }
    }
    
    public void zrus() {
        this.zobrazenie.skry();
    }
    
    public void posun() {
        this.zobrazenie.skry();
        this.zobrazenie.posunVodorovne(this.smerX * this.rychlost);
        this.zobrazenie.posunZvisle(this.smerY * this.rychlost);
        this.zobrazenie.zobraz();
        //this.poziciaY = this.poziciaY - 5;
        this.poziciaX += this.smerX * this.rychlost;
        this.poziciaY += this.smerY * this.rychlost;
        
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
    
    public int getPoziciaX() {
        return this.poziciaX;
    }
    
    public int getPoziciaY() {
        return this.poziciaY;
    }
    
    public void odrazOdPadu() {
        this.smerX = -this.smerX;
        
        this.rychlost *= 1.5;
    }
}
