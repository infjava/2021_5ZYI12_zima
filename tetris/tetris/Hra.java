public class Hra {
    private Tetromino padajuce;
    
    public Hra() {
        this.padajuce = new Tetromino(TvarTetromina.getNahodny());
        new Manazer().spravujObjekt(this);
    }
    
    public void zrus() {
        System.exit(0);
    }
    
    public void tik() {
        this.padajuce.posunDole();
    }
    
    public void posunVlavo() {
        this.padajuce.posunVlavo();
    }
    
    public void posunVpravo() {
        this.padajuce.posunVpravo();
    }
}
