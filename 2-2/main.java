public class Main {
    public static void main(String[] args) {
        
        System.out.println("Calculation is equal to: " + (19 % 5 * 3 + 14 / 5)); // 4 * 3 + 2 = 14





        // Increment and Decrement
        int integer = 0;

        integer = integer + 1;
        integer += 1;

        integer++;
        integer--;




        // All Operator Precedence
        // ()
        // ! ++ --
        // * / %
        // + -
        // < > <= >=
        // == !=
        // &&
        // ||
        // = += -= *= /= %=

        System.out.println(false == 8 < 10); // true

        System.out.println(5 + 3 < 6 - 1); //8 < 5 false

        // INPUT: Scannar class
        // double x = ...; // read user input

        //OUTPUT: printing
        var exampleString = "test";
        System.out.print(exampleString);
        System.out.println(exampleString); // = System.out.print(exampleString + "\n");

        // Escape characters
        System.out.println("this is a \n new line");
        System.out.println("This is a quote: \"hello\" ");
        
        // Control structures
        // if (condition) {
        //     run this
        // }
        // else {
        //     run this instead
        // }
        
        int grade = 80; 
        if (grade >= 90) {
            System.out.println("Good job");
        }
        else if (grade >= 80) {
            System.out.println("Nice try");
        } // if chain breaks here
        else if (grade >= 70) {
            System.out.println("OK");
        }
        else {
            System.out.println("Fail");
        }

        // Nested if statements
        int testInt = 12;
        if (testInt > 10) {
            if (testInt % 2 == 0) {
                System.out.println("Divisible by two, greater than 10");
            }
        }
        if (testInt > 10 && testInt % 2 == 0) {
            System.out.println("Also divisible by two, greater than 10");
        }

        // Loop


        // for (initialization variable; !termination condition; update statement) {
        //    // run this
        // }

        for (int i = 0; i < 5; i++) {
            // NEVER EDIT i HERE
            System.out.println(i);

        }

        for (int i = 20; i > 10; i -= 2) {
            System.out.println(i);
        }

        for (int i = 1; i <= 0; i++) {
            System.out.println("this won't run");
        }

        // For loops for arrays
        // for (type element : collection) {

        // }

        int[] exampleIntArray = {2, 6, 8, 9, 11};
        for (int number : exampleIntArray) {
            System.out.println(number);
        }

        // initialization variable
        // while (boolean test) {
        //     //run this

        //     update statement
        // }

        int adder = 1;
        int mult3 = 3;
        while (mult3 < 20) {
            System.out.println(mult3); 
            adder++;
            mult3 *= adder;
        } // 3 6 18

        // int power2 = 1; // 2
        // while (power2 != 20) {
        //     System.out.println(power2);
        //     power2 *= 2;
        // } // 2 4 8 16 32 64 128... 2^30 2^31 INTEGER OVERFLOW due to infinite while loop

        for (int i = 1; i <= 3; i++) { // 1 2 3
            for (int j = 1; j <= 4; j++) { // 1 2 3 4
                System.out.print("*"); 
            }
            // System.out.print("****");
            System.out.println();
        }
        // ****
        // ****
        // ****

        for (int i = 1; i <= 6; i++) { // 1 2 3 4 5 6
            for (int j = 1; j <= i; j++) { // 1 2 3 4 5
                System.out.print("+");
            }
            for (int j = 1; j <= 6 - i; j++) { // 1   
                System.out.print("*");
            }
            System.out.println();
        }
        // +*****
        // ++****
        // +++***
        // ++++**
        // +++++*
        // ++++++

        System.out.println(13 - 3 * 6 / 4 % 3); // 12


        // 2^31 = 2147483648
        double x = 10000000; // x^(1/2) = sqrt(x)
        System.out.println(Math.pow(x, 0.5) == Math.sqrt(x)); // x^(0.5) == sqrt(x)
        double leniency = 0.001;
        System.out.println(Math.abs(Math.pow(x, 0.5) - Math.sqrt(x)) < leninency);

        !(a <= b) && (a * b > 0)
        // A B Output
        // 0 0 False
        // 0 1 False
        // 1 0 False
        // 1 1 False
       
        int x = 10;
        int y = 0;
        while (x > 5)
        {
            y = 3;
            while (y < x) 
            {
                y *= 2; // 7 6
                if (y % x == 1) {
                    y += x;
                }
            }
            x -= 3;
        } 
        System.out.println(x + " " + y); // 4 6
        
        
   
   
    }
}