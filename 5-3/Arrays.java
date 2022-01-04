public class Arrays {
    public static void main(String args[]) {
        // store test scores: 95 92 93 94 96
        // arrays have immutable length

        int[] testScores = new int[5];

        // int testScores[] = new int[5];

        // int[] testScores;
        // testScores = new int[5];

        testScores[0] = 95;
        testScores[1] = 92;
        testScores[2] = 93;
        testScores[3] = 94;
        testScores[4] = 96;

        int[] simplerTestScores = {95, 92, 93, 94, 96}; // alternative, simpler method

        // length is NOT a method - it is a property
        int testAmount = testScores.length; // testAmount = 5

        // contrast this with Strings
        String s = "hello!";
        int strlen = s.length(); // strlen = 6

        // for loop
        for (int i = 0; i < testScores.length; i++) { // i <= testScores.length - 1
            System.out.println("Score number " + i + " is: " + testScores[i]);
        }

        // enhanced for loop
        for (int score : testScores) { // for (i = 0; i < testScores.length; i++); sets score to be testScores[i]
            System.out.println(score);
        }

        int[] list = {1, 2, 3, 4};
        addThree(list); // list is now {4, 5, 6, 7}

        int[] wrong = {1, 3, 2, 4}; // swap index 1 and 2
        swap(wrong, 1, 2); // list is now {1, 2, 3, 4}


    }
    // Java objects are always pass by reference
    // Java primitives are always pass by value
    public static void addThree (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 3;
        }
    }

    public static void swap (int[] arr, int i, int j) {

        // int water = arr[i];
        // int milk = arr[j];
        // int newCup;
        //
        // newCup = water; // there is now water in the new cup
        // water = milk; // there is now milk in the water cup
        // milk = newCup; // water (contents of newCup) in the milk cup

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
