public class Recursion {


    public void recursiveMethod(int i) {
        if (/* base case */) {
            // perform action
            // return
        }
        else {
            // perform other action
            recusiveMethod(/* new i */);
        }
    }

    public static void drawLine(int n)
    {
        if (n == 0) {
            System.out.println("That’s all, folks!");
        }
        else {
            // print n stars
            for (int i = 1; i <= n; i++) {
                System.out.print("*");
            }

            System.out.println();
            drawLine(n - 1);
        }
    }


    // Illustrates infinite recursion.
    public void catastrophe(int n)
    {
        System.out.println(n);
        catastrophe(n + 1);
    } // generates StackOverflowError



    // Precondition: n is non-negative
    // 5! = 5 * 4 * 3 * 2 * 1 = 120
    // (hint: 0! = 1)
    public static int factorialRec(int n) {
        if (n == 0) {
            return 1;
        }
        else {
            return n * factorialRec(n - 1);
        }
    }

    // Iterative approach
    public factorialIter(int n) {
        int factorial = 1;
        for (int i = n; i > 0; i--) { // if n = 0, i: 4 3 2 1
            factorial *= i;
        }
        return factorial;
    }

    // returns n + n-1 + n-2 + n-3 + ... + 0

    // Driver method
    public static int findSummation(int n) {
        // we check for negative n here so we don't need to check it n times
        if (n < 0) {
            return 0;
            // throw new IllegalArgumentExecption("Error: n must be positive")
        }
        else {
            summation(n);
        }
    }

    // Helper method
    private static int summation(int n) {
        if (n == 0) {
            return 0;
        }
        else {
            return n + summation(n - 1);
        }
    }

    /** Recursively search array a for key.
     *  Returns true if a[k] equals key for 0 <= k < a.length;
     *  false otherwise.
     */
    public static boolean search(String[] a, String key)
    {
        if (a.length == 0) //base case. key not found
            return false;
        else if (a[0].compareTo(key) == 0) //base case
            return true; //key found
        else
        {
            String[] shorter = new String[a.length-1];

            for (int i = 0; i < shorter.length; i++)
                shorter[i] = a[i+1];

            return search(shorter, key);
        }
    }
    // a = {"Mary", "Joe", "Lee", "Jake"}
    // key = "Lee"

    // shorter = {"Joe", "Lee", "Jake"}
    // shorter = {"Lee", "Jake"}
    // returns true;



    /** Driver method. Searches array a for key.
     *  Return trues if a[k] equals key for 0 <= k < a.length;
     *  false otherwise.
     *  Precondition: a contains at least one element.
     */
    public static boolean search(String[] a, String key)
    {
        return recurSearch(a, 0, key);
    }

    /** Recursively searches array a for key, starting at startIndex.
     *  Returns true if a[k] equals key for 0 <= k < a.length;
     *  false otherwise.
     *  Precondition:
     *   - a contains at least one element.
     *   - 0 <= startIndex <= a.length.
     */
    private static boolean recurSearch(String[] a, int startIndex, String key)
    {
        if (startIndex == a.length) //base case: key not found
            return false;
        else if (a[startIndex].equals(key)) //base case: key found
            return true;
        else
            return recurSearch(a, startIndex + 1, key);
    }

    public static boolean iterSearch(String[] a, String key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals(key)) {
                return true;
            }
        }
        return false;
    }



    public static void main(String args[]) {
        drawLine(3);
        // prints:
        // ***
        // **
        // *
        // That’s all, folks!

        factorialRec(4);
        // 4 * factorialRec(3)
        // factorialRec(3) = 3 * factorialRec(2)
        // factorialRec(2) = 2 * factorialRec(1)
        // factorialRec(1) = 1 * factorialRec (0)
        // factorialRec(0) = 1
        // Therefore:
        // factorialRec(4) = 4 * 3 * 2 * 1 * 1 = 24


        // General Points for Recursion:
        // 1. Avoid recursion for big arrays (uses too much memory)
        // 2. Use recursion when it simplies code significantly
        // 3. Avoid recursion for simple iterative methods (ex. factorial, fibonacci, linear search)
        // 4. Use recursion for
        //      a. branching processes (trees, directories)
        //      b. divide-and-conquer algorithms (merge sort, binary search) (CHAPTER 9)

}
