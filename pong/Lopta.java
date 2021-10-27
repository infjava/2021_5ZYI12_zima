public class Lopta {
    private Kruh zobrazenie;
    
    public Lopta() {
        this.zobrazenie = new Kruh();
        this.zobrazenie.zmenPriemer(10);
        this.zobrazenie.posunVodorovne(125);
        this.zobrazenie.posunZvisle(85);
        this.zobrazenie.zobraz();
    }
    
    public void posun() {
        this.zobrazenie.skry();
        this.zobrazenie.posunVodorovne(5);
        this.zobrazenie.posunZvisle(-5);
        this.zobrazenie.zobraz();
    }
}
