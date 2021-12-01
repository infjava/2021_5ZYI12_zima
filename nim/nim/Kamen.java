public class Kamen {
    private Kruh kamen;
    private int poziciaX;
    private int poziciaY;
    
    public Kamen(Sachovnica sachovnica) {
        this.kamen = new Kruh();
        this.kamen.zmenPriemer(13);
        this.kamen.posunZvisle(-59);
        this.kamen.posunVodorovne(-19 + (sachovnica.getSirka() - 1) * 15);
        this.poziciaX = sachovnica.getSirka();
        this.poziciaY = sachovnica.getVyska();
    }
    
    public void zobraz() {
        this.kamen.zobraz();
    }
    
    public void skry() {
        this.kamen.skry();
    }
    
    public void posunKamen(int x, int y) {
        this.kamen.posunVodorovne((x - this.poziciaX) * 15);
        this.kamen.posunZvisle(-(y - this.poziciaY) * 15);
        this.poziciaX = x;
        this.poziciaY = y;
    }
}
