public class Displej {
    public Displej() {
        for (int y = 0; y < 20; y++) {
            for (int x = 0; x < 10; x++) {
                Stvorec pixel = new Stvorec();
                pixel.posunZvisle(-50 + y * 15);
                pixel.posunVodorovne(-60 + x * 15);
                pixel.zmenStranu(14);
                pixel.zmenFarbu("black");
                pixel.zobraz();
            }
        }
    }
    
    public void nastav(int x, int y, boolean svieti) {
        
    }
}
