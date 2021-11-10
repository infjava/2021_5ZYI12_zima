public class Ucet {
    private String vlastnik;
    private long sumaVCentoch;
    private String cisloUctu;
    
    public Ucet(String vlastnik, String cisloUctu) {
        this.sumaVCentoch = 0;
        this.vlastnik = vlastnik;
        this.cisloUctu = cisloUctu;
    }
    
    public double getSuma() {
        return this.sumaVCentoch / 100.0;
    }
    
    public void vlozPeniaze(double suma) {
        this.sumaVCentoch += suma * 100;
    }
    
    public void vyberPeniaze(double suma) {
        this.sumaVCentoch -= suma * 100;
    }
}
