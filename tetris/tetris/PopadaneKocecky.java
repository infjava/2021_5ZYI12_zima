public class PopadaneKocecky {
    private boolean[][] kocecky;
    
    public PopadaneKocecky() {
        this.kocecky = new boolean[Displej.VYSKA][Displej.SIRKA];
    }
    
    public void pridajTetromino(Tetromino tetromino) {
        for (int y = 0; y < Displej.VYSKA; y++) {
            for (int x = 0; x < Displej.SIRKA; x++) {
                if (tetromino.maKocecku(x, y)) {
                    this.kocecky[y][x] = true;
                }
            }
        }
    }
    
    public boolean koliduje(Tetromino tetromino) {
        for (int y = 0; y < Displej.VYSKA; y++) {
            for (int x = 0; x < Displej.SIRKA; x++) {
                if (tetromino.maKocecku(x, y) && this.kocecky[y][x]) {
                    return true;
                }
            }
        }
        return false;
    }
}
