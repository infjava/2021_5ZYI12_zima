public class Nim {
    private Sachovnica sachovnica;
    private Kamen kamen;
    private String[] menaHracov;
    private int indexHracaNaTahu;
    private String menoVyhercu;
    
    public Nim(int sirka, int vyska, String menoPrveho, String menoDruheho) {
        this.sachovnica = new Sachovnica(sirka, vyska);
        this.kamen = this.sachovnica.polozKamen();
        this.sachovnica.zobraz();
        
        this.menaHracov = new String[] {menoPrveho, menoDruheho};
        this.indexHracaNaTahu = 0;
        
        this.menoVyhercu = null;
    }
    
    public String getHracNaTahu() {
        return this.menaHracov[this.indexHracaNaTahu];
    }
    
    public String getVyherca() {
        return this.menoVyhercu;
    }
    
    public void posunDole(int oKolko) {
        int novaX = this.kamen.getPoziciaX();
        int novaY = this.kamen.getPoziciaY() - oKolko;
        
        if (novaY < 1 || oKolko <= 0) {
            System.out.println("Nespravny pocet policok");
            return;
        }
        
        this.kamen.posunKamen(novaX, novaY);
        
        if (novaX == 1 && novaY == 1) {
            this.menoVyhercu = this.getHracNaTahu();
        }
        
        this.indexHracaNaTahu = (this.indexHracaNaTahu + 1) % this.menaHracov.length;
    }
    
    public void posunVlavo(int oKolko) {
        int novaX = this.kamen.getPoziciaX() - oKolko;
        int novaY = this.kamen.getPoziciaY();
        
        if (novaX < 1 || oKolko <= 0) {
            System.out.println("Nespravny pocet policok");
            return;
        }
        
        this.kamen.posunKamen(novaX, novaY);
        
        if (novaX == 1 && novaY == 1) {
            this.menoVyhercu = this.getHracNaTahu();
        }

        this.indexHracaNaTahu = (this.indexHracaNaTahu + 1) % this.menaHracov.length;
    }
}
