public class Kamen {
    private Kruh kamen;
    
    public Kamen(Sachovnica sachovnica) {
        this.kamen = new Kruh();
        this.kamen.zmenPriemer(13);
        this.kamen.posunZvisle(-59);
        this.kamen.posunVodorovne(-19 + (sachovnica.getSirka() - 1) * 15);
    }
    
    public void zobraz() {
        this.kamen.zobraz();
    }
    
    public void skry() {
        this.kamen.skry();
    }
    
    public void posunKamen(int x, int y) {
        
    }
}
