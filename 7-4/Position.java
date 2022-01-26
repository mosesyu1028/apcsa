public class Position {

    // private int row;
    // private int col;

    public Position(int r, int c) {
        /* implementation not shown */
    }

    // (a)
    // intArr is a matrix that contains consecutive integers in any position
    public static Position findPosition(int num, int[][] intArr) {

        for (int r = 0; r < intArr.length; r++) {
            for (int c = 0; c < intArr[r].length; c++) {

                if (intArr[r][c] == num) {
                    return new Position(r, c);
                }

            }
        }
        return null;
    }

    // (b)
    public static Position[][] getSuccessorArray(int[][] intArr) {

    }
}
