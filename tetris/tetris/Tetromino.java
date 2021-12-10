public class Tetromino {
    public Tetromino(boolean[][] tvar) {
        for (int y = 0; y < tvar.length; y++) {
            for (int x = 0; x < tvar[y].length; x++) {
                Displej.getInstancia().nastav(x, y, tvar[y][x]);
            }
        }
    }
}
