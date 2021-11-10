public class Banka {
    public Ucet zalozUcet(String vlastnik) {
        String cisloUctu = "SK1212345678";
        return new Ucet(vlastnik, cisloUctu);
    }
}
