public class Sachovnica {
    public Sachovnica(int sirka, int vyska) {
        boolean posledneCierne = true;
        for (int riadok = 0; riadok < vyska; riadok++) {
            for (int stlpec = 0; stlpec < sirka; stlpec++) {
                Stvorec policko = new Stvorec();
                policko.zmenStranu(15);
                policko.posunVodorovne(15 * stlpec - 60);
                policko.posunZvisle(15 * riadok - 50);
                if (!posledneCierne) {
                    policko.zobraz();
                }
                posledneCierne = !posledneCierne;
            }
            if (sirka % 2 == 0) {
                posledneCierne = !posledneCierne;
            }
        }
    }
}
