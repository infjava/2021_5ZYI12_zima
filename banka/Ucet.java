public class Ucet {
    private String vlastnik;
    private long sumaVCentoch;
    private String cisloUctu;
    
    public Ucet(String vlastnik, String cisloUctu) {
        this.sumaVCentoch = 0;
        this.vlastnik = vlastnik;
        this.cisloUctu = cisloUctu;
    }
}
