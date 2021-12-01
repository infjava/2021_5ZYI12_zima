public class Nim {
    private Sachovnica sachovnica;
    private Kamen kamen;
    
    public Nim(int sirka, int vyska) {
        this.sachovnica = new Sachovnica(sirka, vyska);
        this.kamen = this.sachovnica.polozKamen();
        this.sachovnica.zobraz();
    }
}
