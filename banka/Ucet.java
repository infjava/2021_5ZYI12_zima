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
        if (suma <= 0) {
            System.out.println("Chybna suma");
            return;
        }
        
        this.sumaVCentoch += suma * 100;
    }
    
    public void vyberPeniaze(double suma) {
        if (suma <= 0) {
            System.out.println("Chybna suma");
            return;
        }
        
        double vkladanaSumaVCentoch = suma * 100;
        
        if (vkladanaSumaVCentoch > this.sumaVCentoch) {
            System.out.println("Na to nemas dost prostriedkov");
            return;
        }
        
        this.sumaVCentoch -= vkladanaSumaVCentoch;
    }
    
    public String getIban() {
        return this.cisloUctu;
    }
    
    public void prevedPeniaze(String ibanCiel, double suma) {
        
    }
}
