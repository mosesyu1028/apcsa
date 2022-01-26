public class ArrayTester {

    // (a)
    public static int[] getColumn(int[][] arr2D, int c) {
        int[] result = new int[arr2D.length];

        for (int r = 0; r < arr2D.length; r++) {
            result[r] = arr2D[r][c];
        }
        return result;
    }

    // helper functions
    public static boolean hasAllValues(int[] arr1, int[] arr2) {
        /* implementation not shown */
    }

    public static boolean containsDuplicates(int[] arr) {
        /* implementation not shown */
    }

    // (b)
    public static boolean isLatin(int[][] square) {

        // Check for duplicate values in row 0
        if (containsDuplicates(square[0])) {
            return false;
        }

        // All row 0 values appear in each row
        for (int r = 1; r < square.length; r++) { // r = 1 because we don't need to check square[0] with itself
            if (!hasAllValues(square[0], square[r])) {
                return false;
            }
        }

        // All row 0 values appear in each col
        for (int c = 0; c < square[0].length; c++) {
            if (!hasAllValues(square[0], getColumn(square, c))) {
                return false;
            }
        }

        return true;

    }
