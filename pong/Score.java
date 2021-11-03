public class Score {
    private SegmentovyDisplej cislicaJednotky;
    private SegmentovyDisplej cislicaDesiatky;
    private int score;
    
    public Score(boolean jePravy) {
        if (jePravy) {
            this.cislicaDesiatky = new SegmentovyDisplej(183, 0);
            this.cislicaJednotky = new SegmentovyDisplej(228, 0);
        } else {
            this.cislicaDesiatky = new SegmentovyDisplej(33, 0);
            this.cislicaJednotky = new SegmentovyDisplej(78, 0);
        }
        
        this.cislicaJednotky.zobrazCislicu(0);
        this.cislicaDesiatky.zobrazCislicu(0);
        
        this.score = 0;
    }
    
    public void zvys() {
        this.score++;
        this.cislicaJednotky.zobrazCislicu(this.score % 10);
        this.cislicaDesiatky.zobrazCislicu(this.score / 10);
    }
}
