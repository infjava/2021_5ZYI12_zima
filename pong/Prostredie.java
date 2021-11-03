public class Prostredie {
    private Lopta lopta;
    private Hrac hracLavy;
    private Hrac hracPravy;
    
    public Prostredie() {
        new Stena(false);
        new Stena(true);
        
        this.lopta = new Lopta();
        this.hracLavy = new Hrac(false);
        this.hracPravy = new Hrac(true);
        
        Manazer manazer = new Manazer();
        manazer.spravujObjekt(this);
    }
    
    public void tik() {
        this.lopta.posun();
        
        if (this.lopta.jeMimoNaLavo()) {
            this.hracPravy.zvysScore();
            this.lopta.zrus();
            this.lopta = new Lopta();
        }
        
        if (this.lopta.jeMimoNaPravo()) {
            this.hracLavy.zvysScore();
            this.lopta.zrus();
            this.lopta = new Lopta();
        }
    }
    
    public void posunHore() {
        this.hracPravy.posunPadHore();
    }
    
    public void posunVpravo() {
        this.hracPravy.posunPadDole();
    }
    
    public void posunVlavo() {
        this.hracLavy.posunPadHore();
    }
    
    public void posunDole() {
        this.hracLavy.posunPadDole();
    }
    
    public void zrus() {
        System.exit(0);
    }
}
