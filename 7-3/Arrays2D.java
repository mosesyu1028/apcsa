public class Arrays2D {
    public static void main(String args[]) {

        // Store this grid in a variable:
        // 2 6 8 7
        // 1 5 4 0
        // 9 3 2 8


        int[][] mat = {
        {2, 6, 8, 7},
        {1, 5, 4, 0},
        {9, 3, 2, 8}
        }


        // mat[0]  contains  {2, 6, 8, 7}
        // mat[1]  contains  {1, 5, 4, 0}
        // mat[2]  contains  {9, 3, 2, 8}

        // mat.length = 3
        // mat[0].length = 4

        // mat[2][3] = 8;
        // mat[r][c] = row r, column c of mat (start from 0)


        // Ranges:
        // rows: 0 to mat.length - 1
        // columns: 0 to mat[0].length - 1
        // be careful of ArrayIndexOutOFBoundsException

        // common ways to traverse 2d arrays:
        // 1. row-column (rw-)
        int sum = 0;
        for (int r = 0; r < mat.length; r++) {
            for (int c = 0; c < mat[r].length; c++) {
                sum += mat[r][c];
            }
        }

        // 2. enhanced for loop (r--)
        int sum = 0;
        for (int[] row : mat) { // {2, 6, 8, 7}, {1, 5, 4, 0}, {9, 3, 2, 8}
            for (int num : row) {
                sum += num;
            }
        }

        // 3. row-by-row processing (rwx)
        int sum = 0;
        for (int r = 0; r < mat.length; r++) {
            sum += sumArray(mat[r]);
        }




    }

    public static int sumArray(int[] arr) {
        /* implementation not shown */
    }

    public static void matrixScaler(int[][] mat, int scaler) {
        for (int r = 0; r < mat.length; r++) {
            for (int c = 0; c < mat[r].length; c++) {
                // mat[r][c] = mat[r][c] * 2;
                mat[r][c] *= 2;
            }
        }
    }

    public static int countNegs(int[][] mat) {
        int amount = 0;

        for (int[] row : mat) {
            for (int num : row) {
                if (num < 0) {
                    amount++;
                }
            }
        }

        // for (int r = 0; r < mat.length; r++) {
        //     for (int c = 0; c < mat[r].length; c++) { // we can assume: mat[0].length == mat[1].length == mat[2].length
        //         if (mat[r][c] < 0) {
        //             amount++;
        //         }
        // }

        return amount;
    }

    public static int[][] makeIdentityMatrix(int r, int c) {
        // initialize matrix
        int[][] mat = new int[r][c];

        // fill slots with 0 (replacing values)
        for (int r = 0; r < mat.length; r++) {
            for (int c = 0; c < mat[r].length; c++) {

                mat[r][c] = 0;

                // add in the 1s
                if (r == c) {
                    mat[r][c] = 1;
                }

            }
        }
    }

}
