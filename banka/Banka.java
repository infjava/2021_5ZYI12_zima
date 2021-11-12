import java.util.ArrayList;
import java.util.Random;
import java.math.BigInteger;
    
public class Banka {
    private String kodBanky;
    private ArrayList<Ucet> ucty;
    
    public Banka(String kodBanky) {
        this.kodBanky = kodBanky;
        this.ucty = new ArrayList<Ucet>();
    }
    
    public Ucet zalozUcet(String vlastnik) {
        Random nahodneCisla = new Random();
        //long stareCisloUctu = nahodneCisla.nextLong() % 10000000000L;
        int cisloUctu1 = nahodneCisla.nextInt(100000);
        int cisloUctu2 = nahodneCisla.nextInt(100000);
        
        BigInteger ibanPreVypocetKontrolnehoCisla =
            new BigInteger(String.format("%s000000%05d%05d282000",
                this.kodBanky, cisloUctu1, cisloUctu2));
        
        int kontrolneCislo = ibanPreVypocetKontrolnehoCisla
            .mod(new BigInteger("97"))
            .intValue();
        
        String cisloUctu = String.format("SK%02d%s000000%05d%05d",
            kontrolneCislo, this.kodBanky, cisloUctu1, cisloUctu2);
        Ucet ucet = new Ucet(vlastnik, cisloUctu);
        this.ucty.add(ucet);
        return ucet;
    }
    
    public Ucet getUcet(String iban) {
        for (Ucet kontrolovany : this.ucty) {
            if (kontrolovany.getIban().equals(iban)) {
                return kontrolovany;
            }
        }
        
        return null;
    }
}
