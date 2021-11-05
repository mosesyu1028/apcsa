public class Main {
    public static void main(String[] args) {
        
        int firstNum = 10;
        int secondNum = 3;
        double firstDouble = 10.0;
        
        
        System.out.println(firstNum + secondNum); // = 13
        System.out.println(firstNum - secondNum); // = 7
        System.out.println(firstNum * secondNum); // = 30
        System.out.println(firstNum % secondNum); // = 1
        
        
        System.out.println(firstNum / secondNum); // = 3
        // double firstNumDouble = firstNum;
        
        System.out.println( (double) firstNum / secondNum); // = 3.33
        System.out.println( (double) (firstNum / secondNum)); // = 3
        

        // Precedence
        // () from inside to outside
        // type casting
        // * / %
        // + -
        // =
        System.out.println("Calculation is equal to: " + (19 % 5 * 3 + 14 / 5)); // (19 % 5 * 3) + (14 / 5) = 14 

        
        // Relational Operators
        // ==
        // !=
        // < <= > >= 
        
        boolean checker = (firstNum >= secondNum); // true
        boolean equalChecker = (firstNum == secondNum); //false

        boolean intDoubleChecker = (firstNum == firstDouble);
        System.out.println(intDoubleChecker); // true!




        // if (boolean_is_true) {
            // then run this
        // }

        // Logical Operators
        // ! NOT
        // && AND
        // || OR

        if (!equalChecker) { // same as (equalChecker == false)
            System.out.println("Numbers are equal");
        }

        if (checker || equalChecker) {
            System.out.println("Both are true");
        }

        // Short-circuiting
        // &&: RHS will not be evaluated if LHS is false
        // ||: RHS will not be evaluated is LHS is true


        // double illegal = 0/0;
        if (checker || (0/0 == 5)) {
            System.out.println("still runs");
        }
        
        // if ((0/0 == 5) || checker) {
        //     System.out.println("doesn't run");
        // }

        
        // Assignment Operators
        // =
        // += -= *= /= %=

        firstNum = firstNum + 1; // = 10 + 1 = 11
        firstNum += 1; // = 11 + 1 = 12
        firstNum *= 3; // = 12 * 3 = 36
        firstNum %= 10; // = 36 % 10 = 6

        System.out.println(firstNum);
    }
}