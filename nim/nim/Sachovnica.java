import java.util.ArrayList;

public class Sachovnica {
    private ArrayList<Stvorec> policka;
    private Kamen kamen;
    private int sirka;
    private boolean jeZobrazena;
    
    public Sachovnica(int sirka, int vyska) {
        this.sirka = sirka;
        
        this.policka = new ArrayList<Stvorec>();
        
        for (int riadok = 0; riadok < vyska; riadok++) {
            for (int stlpec = 0; stlpec < sirka; stlpec++) {
                Stvorec policko = new Stvorec();
                policko.zmenStranu(15);
                policko.posunVodorovne(15 * stlpec - 60);
                policko.posunZvisle(15 * riadok - 50);
                
                // ak ma riadok + stlpec paritu roznu ako je parita vysky,
                // policko je cierne, tym sme zafixovali farbu policka A1
                if ((riadok + stlpec) % 2 != vyska % 2) {
                    this.policka.add(policko);
                }
            }
        }
        
        this.kamen = null;
        
        this.jeZobrazena = false;
    }
    
    public void zobraz() {
        for (Stvorec policko : this.policka) {
            policko.zobraz();
        }
        if (this.kamen != null) {
            this.kamen.zobraz();
        }
        this.jeZobrazena = true;
    }
    
    public void skry() {
        if (this.kamen != null) {
            this.kamen.skry();
        }
        for (Stvorec policko : this.policka) {
            policko.skry();
        }
        this.jeZobrazena = false;
    }
    
    public int getSirka() {
        return this.sirka;
    }
    
    public Kamen polozKamen() {
        if (this.kamen != null) {
            return null;
        }
        
        this.kamen = new Kamen(this);
        if (this.jeZobrazena) {
            this.kamen.zobraz();
        }
        return this.kamen;
    }
}
