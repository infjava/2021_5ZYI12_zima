import java.util.Random;

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
        this.vykonajTahPCAkTreba();
    }
    
    public String getHracNaTahu() {
        if (this.menoVyhercu == null) {
            return this.menaHracov[this.indexHracaNaTahu];
        } else {
            return null;
        }
    }
    
    public String getVyherca() {
        return this.menoVyhercu;
    }
    
    public void posunDole(int oKolko) {
        this.vykonajPosun(0, oKolko);
    }
    
    public void posunVlavo(int oKolko) {
        this.vykonajPosun(oKolko, 0);
    }
    
    public void posunSikmo(int oKolko) {
        this.vykonajPosun(oKolko, oKolko);
    }
    
    private void vykonajPosun(int oKolkoX, int oKolkoY) {
        int novaX = this.kamen.getPoziciaX() - oKolkoX;
        int novaY = this.kamen.getPoziciaY() - oKolkoY;
        
        if (novaX < 1 || novaY < 1 || (oKolkoX <= 0 && oKolkoY <= 0)) {
            System.out.println("Nespravny pocet policok");
            return;
        }
        
        this.kamen.posunKamen(novaX, novaY);
        
        if (novaX == 1 && novaY == 1) {
            this.menoVyhercu = this.getHracNaTahu();
        }

        this.indexHracaNaTahu = (this.indexHracaNaTahu + 1) % this.menaHracov.length;
        this.vykonajTahPCAkTreba();
    }
    
    private void vykonajTahPCAkTreba() {
        if (this.getHracNaTahu() != null && this.getHracNaTahu().equals("PC")) {
            int novaX = this.kamen.getPoziciaX();
            int novaY = this.kamen.getPoziciaY();
            
            // Y < X	vlavo	X - Y
            if (novaY < novaX) {
                this.posunVlavo(novaX - novaY);
            // X < Y	dole	Y - X
            } else if (novaX < novaY) {
                this.posunDole(novaY - novaX);
            // else	nahodne	nahodne <1, X)
            } else {
                Random nahodneCisla = new Random();
                if (nahodneCisla.nextBoolean()) {
                    this.posunVlavo(nahodneCisla.nextInt(novaX - 1) + 1);
                } else {
                    this.posunDole(nahodneCisla.nextInt(novaY - 1) + 1);
                }
            }
        }
    }
    
    public int getKamenX() {
        return this.kamen.getPoziciaX();
    }
    
    public int getKamenY() {
        return this.kamen.getPoziciaY();
    }
}
