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
}
