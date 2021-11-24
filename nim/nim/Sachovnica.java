public class Sachovnica {
    public Sachovnica(int sirka, int vyska) {
        for (int riadok = 0; riadok < vyska; riadok++) {
            for (int stlpec = 0; stlpec < sirka; stlpec++) {
                Stvorec policko = new Stvorec();
                policko.zmenStranu(15);
                policko.posunVodorovne(15 * stlpec - 60);
                policko.posunZvisle(15 * riadok - 50);
                
                // ak ma riadok + stlpec paritu roznu ako je parita vysky,
                // policko je cierne, tym sme zafixovali farbu policka A1
                if ((riadok + stlpec) % 2 != vyska % 2) {
                    policko.zobraz();
                }
            }
        }
    }
}
