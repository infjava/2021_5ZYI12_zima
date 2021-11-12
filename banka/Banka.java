import java.util.Random;
import java.math.BigInteger;
    
public class Banka {
    private String kodBanky;
    
    public Banka(String kodBanky) {
        this.kodBanky = kodBanky;
    }
    
    public Ucet zalozUcet(String vlastnik) {
        Random nahodneCisla = new Random();
        //long stareCisloUctu = nahodneCisla.nextLong() % 10000000000L;
        int cisloUctu1 = nahodneCisla.nextInt(100000);
        int cisloUctu2 = nahodneCisla.nextInt(100000);
        
        BigInteger ibanPreVypocetKontrolnehoCisla =
            new BigInteger(String.format("%s000000%5d%5d282000",
                this.kodBanky, cisloUctu1, cisloUctu2));
        
        int kontrolneCislo = ibanPreVypocetKontrolnehoCisla
            .mod(new BigInteger("97"))
            .intValue();
        
        String cisloUctu = String.format("SK%2d%s000000%5d%5d",
            kontrolneCislo, this.kodBanky, cisloUctu1, cisloUctu2);
        return new Ucet(vlastnik, cisloUctu);
    }
}
