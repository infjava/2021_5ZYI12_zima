public class Nim {
    private Sachovnica sachovnica;
    private Kamen kamen;
    
    public Nim(int sirka, int vyska) {
        this.sachovnica = new Sachovnica(sirka, vyska);
        this.kamen = this.sachovnica.polozKamen();
        this.sachovnica.zobraz();
    }
    
    public void posunDole(int oKolko) {
        int novaX = this.kamen.getPoziciaX();
        int novaY = this.kamen.getPoziciaY() - oKolko;
        
        if (novaY < 1 || oKolko <= 0) {
            System.out.println("Nespravny pocet policok");
            return;
        }
        
        this.kamen.posunKamen(novaX, novaY);
    }
    
    public void posunVlavo(int oKolko) {
        int novaX = this.kamen.getPoziciaX() - oKolko;
        int novaY = this.kamen.getPoziciaY();
        
        if (novaX < 1 || oKolko <= 0) {
            System.out.println("Nespravny pocet policok");
            return;
        }
        
        this.kamen.posunKamen(novaX, novaY);
    }
}
