public class Hrac {
    private Pad pad;
    private Score score;
    
    public Hrac(boolean jePravy) {
        this.pad = new Pad(jePravy);
        this.score = new Score(jePravy);
    }
}
