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
        if (suma > 0) {
            this.sumaVCentoch += suma * 100;
        } else {
            System.out.println("Chybna suma");
        }
    }
    
    public void vyberPeniaze(double suma) {
        if (suma > 0) {
            double vkladanaSumaVCentoch = suma * 100;
            if (vkladanaSumaVCentoch <= this.sumaVCentoch) {
                this.sumaVCentoch -= vkladanaSumaVCentoch;
            } else {
                System.out.println("Na to nemas dost prostriedkov");
            }
        } else {
            System.out.println("Chybna suma");
        }
    }
}
