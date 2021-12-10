public class Tetromino {
    private int poziciaX;
    private int poziciaY;
    private boolean[][] tvar;
    
    public Tetromino(boolean[][] tvar) {
        this.poziciaX = (Displej.SIRKA - tvar[0].length) / 2;
        this.poziciaY = 0;
        this.tvar = tvar;
        
        this.zobraz();
    }
    
    public void posunDole() {
        this.skry();
        this.poziciaY++;
        this.zobraz();
    }
    
    public void posunVlavo() {
        this.skry();
        this.poziciaX--;
        this.zobraz();
    }
    
    public void posunVpravo() {
        this.skry();
        this.poziciaX++;
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
