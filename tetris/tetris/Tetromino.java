public class Tetromino {
    private int poziciaX;
    private int poziciaY;
    private boolean[][] tvar;
    
    public Tetromino(TvarTetromina tvar) {
        this.poziciaX = (Displej.SIRKA - tvar.getMaticaTvaru()[0].length) / 2;
        this.poziciaY = 0;
        this.tvar = tvar.getMaticaTvaru();
        
        this.zobraz();
    }
    
    public Tetromino(boolean[][] tvar) {
        this.poziciaX = (Displej.SIRKA - tvar[0].length) / 2;
        this.poziciaY = 0;
        this.tvar = tvar;
        
        this.zobraz();
    }
    
    public void posunDole() {
        if (this.poziciaY + this.tvar.length >= Displej.VYSKA) {
            return;
        }
        
        this.skry();
        this.poziciaY++;
        this.zobraz();
    }
    
    public void posunVlavo() {
        if (this.poziciaX <= 0) {
            return;
        }
        
        this.skry();
        this.poziciaX--;
        this.zobraz();
    }
    
    public void posunVpravo() {
        if (this.poziciaX + this.tvar[0].length >= Displej.SIRKA) {
            return;
        }
        
        this.skry();
        this.poziciaX++;
        this.zobraz();
    }
    
    public void otoc() {
        if (this.poziciaX + this.tvar.length > Displej.SIRKA) {
            return;
        }
        
        if (this.poziciaY + this.tvar[0].length > Displej.VYSKA) {
            return;
        }
        
        this.skry();
        
        int staraSirka = this.tvar[0].length;
        int staraVyska = this.tvar.length;
        
        boolean[][] novyTvar = new boolean[staraSirka][staraVyska];
        
        for (int staraY = 0; staraY < staraVyska; staraY++) {
            for (int staraX = 0; staraX < staraSirka; staraX++) {
                int novaY = staraX;
                int novaX = staraVyska - 1 - staraY;
                
                novyTvar[novaY][novaX] = this.tvar[staraY][staraX];
            }
        }
        
        this.tvar = novyTvar;
        
        this.zobraz();
    }
    
    private void skry() {
        for (int y = 0; y < this.tvar.length; y++) {
            for (int x = 0; x < this.tvar[y].length; x++) {
                Displej.getInstancia().nastav(x + this.poziciaX, y + this.poziciaY, false);
            }
        }
    }
    
    private void zobraz() {
        for (int y = 0; y < this.tvar.length; y++) {
            for (int x = 0; x < this.tvar[y].length; x++) {
                Displej.getInstancia().nastav(x + this.poziciaX, y + this.poziciaY, this.tvar[y][x]);
            }
        }
    }
}
