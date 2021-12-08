public class KlikaciNim {
    private Nim nim;
    private Manazer manazer;
    private int vyska;
    private int sirka;
    
    public KlikaciNim(int sirka, int vyska, String menoPrveho, String menoDruheho) {
        this.nim = new Nim(sirka, vyska, menoPrveho, menoDruheho);
        this.manazer = new Manazer();
        this.manazer.spravujObjekt(this);
        
        this.vyska = vyska;
        this.sirka = sirka;
        
        this.vypisStavHry();
    }
    
    public void vyberSuradnice(int x, int y) {
        int nimX = x / 15 + 1;
        int nimY = this.vyska - y / 15;
        if (nimX >= 1 && nimX <= this.sirka && nimY >= 1 && nimX <= this.vyska) {
            int oKolkoX = this.nim.getKamenX() - nimX;
            int oKolkoY = this.nim.getKamenY() - nimY;
            if (nimX == this.nim.getKamenX()) {
                this.nim.posunDole(oKolkoY);
            } else if (nimY == this.nim.getKamenY()) {
                this.nim.posunVlavo(oKolkoX);
            } else if (oKolkoX == oKolkoY) {
                this.nim.posunSikmo(oKolkoX);
            } else {
                System.out.println("Nespravny tah");
            }
        }
        this.vypisStavHry();
    }
    private void vypisStavHry() {
        if (this.nim.getHracNaTahu() != null) {
            System.out.format("Na tahu je: %s%n", this.nim.getHracNaTahu());
        }
        if (this.nim.getVyherca() != null) {
            System.out.format("Vyhral: %s%n", this.nim.getVyherca());
        }
    }
}
