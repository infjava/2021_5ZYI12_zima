public enum TvarTetromina {
    I,
    O,
    T,
    J,
    L,
    S,
    Z;
    
    public boolean[][] getMaticaTvaru() {
        switch (this) {
            case I:
                return new boolean[][] {{true, true, true, true}};
            case O:
                return new boolean[][] {{true, true}, {true, true}};
            case T:
                return new boolean[][] {{true, true, true}, {false, true, false}};
            case J:
                return new boolean[][] {{false, true}, {false, true}, {true, true}};
            case L:
                return new boolean[][] {{true, false}, {true, false}, {true, true}};
            case S:
                return new boolean[][] {{false, true, true}, {true, true, false}};
            case Z:
                return new boolean[][] {{true, true, false}, {false, true, true}};
        }
        
        return null;
    }
}
