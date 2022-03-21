public class Square
{
    public Square(boolean isBlack, int num) {
        /* implementation not shown */
    }
}

public class Crossword
{
    private Square[][] puzzle;


    // (b)
    public Crossword(boolean[][] blackSquares) {
        puzzle = new Square[blackSquares.length][blackSquares[0].length];
        int label = 1;

        for (int r = 0; r < puzzle.length; r++) {
            for (int c = 0; c < puzzle[0].length; c++) {
                // Scenario 1: square is black
                if (blackSquares[r][c]) {
                    puzzle[r][c] = new Square(true, 0);
                }
                else {
                    // Scenario 2: square is white and should be labeled
                    if (toBeLabeled(r, c, blackSquares)) {
                        puzzle[r][c] = new Square(false, label);
                        label++;
                    }
                    // Scenario 3: square is white and should not be labeled
                    else {
                        puzzle[r][c] = new Square(false, 0);
                    }
                }


            }
        }

    }

    // (a)
    public boolean toBeLabeled(int r, int c, boolean[][] blackSquares) {
        // IF square is white, THEN:
            // IF r is 0 OR c is 0 OR square does not have white sqaure above OR square does not have white square to the left, THEN:
                // RETURN true
        // RETURN false

        if (!blackSquares[r][c]) {
            if (r == 0 || c == 0 || blackSquares[r - 1][c] || blackSquares[r][c - 1]) {
                return true;
            }
        }
        return false;

        // return (!(blackSquares[r][c]) && (r == 0 || c == 0 || blackSquares[r - 1][c] || blackSquares[r][c - 1]));
    }
}
