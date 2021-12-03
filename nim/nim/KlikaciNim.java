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
    }
    
    public void vyberSuradnice(int x, int y) {
        int nimX = x / 15 + 1;
        int nimY = this.vyska - y / 15;
        if (nimX >= 1 && nimX <= this.sirka && nimY >= 1 && nimX <= this.vyska) {
            if (nimX == this.nim.getKamenX()) {
                int oKolko = this.nim.getKamenY() - nimY;
                this.nim.posunDole(oKolko);
            } else if (nimY == this.nim.getKamenY()) {
                int oKolko = this.nim.getKamenX() - nimX;
                this.nim.posunVlavo(oKolko);
            } else {
                System.out.println("Nespravny tah");
            }
        }
    }
}
