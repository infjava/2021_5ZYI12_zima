public class Displej {
    public static final int VYSKA = 20;
    public static final int SIRKA = 10;
    
    private static final int VELKOST_PIXELU = 10;
    
    private static final Displej INSTANCIA = new Displej();
    
    private final Stvorec[][] pixely;
    
    private Displej() {
        this.pixely = new Stvorec[Displej.VYSKA][Displej.SIRKA];
        
        for (int y = 0; y < Displej.VYSKA; y++) {
            for (int x = 0; x < Displej.SIRKA; x++) {
                Stvorec pixel = new Stvorec();
                pixel.posunZvisle(-50 + y * Displej.VELKOST_PIXELU);
                pixel.posunVodorovne(-60 + x * Displej.VELKOST_PIXELU);
                pixel.zmenStranu(Displej.VELKOST_PIXELU - 1);
                pixel.zmenFarbu("black");
                pixel.zobraz();
                
                this.pixely[y][x] = pixel;
            }
        }
    }
    
    public static Displej getInstancia() {
        return Displej.INSTANCIA;
    }
    
    public void nastav(int x, int y, boolean svieti) {
        if (svieti) {
            this.pixely[y][x].zmenFarbu("yellow");
        } else {
            this.pixely[y][x].zmenFarbu("black");
        }
    }
}
