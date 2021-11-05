public class Hrac {
    private Pad pad;
    private Score score;
    
    public Hrac(boolean jePravy) {
        this.pad = new Pad(jePravy);
        this.score = new Score(jePravy);
    }
    
    public void posunPadHore() {
        this.pad.posunHore();
    }
    
    public void posunPadDole() {
        this.pad.posunDole();
    }
    
    public boolean padKolidujeS(Lopta lopta) {
        return this.pad.kolidujeS(lopta);
    }
    
    public void zvysScore() {
        this.score.zvys();
    }
}
