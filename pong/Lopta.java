import java.util.Random;

public class Lopta {
    private Kruh zobrazenie;
    private int poziciaY;
    private int smerX;
    private int smerY;
    
    public Lopta() {
        Random nahodneCisla = new Random();
        this.poziciaY = nahodneCisla.nextInt(281) + 10;
        
        this.zobrazenie = new Kruh();
        this.zobrazenie.zmenPriemer(10);
        this.zobrazenie.posunVodorovne(125);
        this.zobrazenie.posunZvisle(this.poziciaY - 65);
        this.zobrazenie.zobraz();
        this.smerX = (nahodneCisla.nextInt(2) * 2 - 1) * 5;
        this.smerY = (nahodneCisla.nextInt(2) * 2 - 1) * 5;
    }
    
    public void posun() {
        this.zobrazenie.skry();
        this.zobrazenie.posunVodorovne(this.smerX);
        this.zobrazenie.posunZvisle(this.smerY);
        this.zobrazenie.zobraz();
        //this.poziciaY = this.poziciaY - 5;
        this.poziciaY += this.smerY;
        
        if (this.poziciaY <= 5 || this.poziciaY >= 295) {
            this.smerY = -this.smerY;
        }
    }
}
