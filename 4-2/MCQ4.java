public class MCQ4 {
    public static void main(String args[]) {
        // 1
        double base = 10
        double exp = 3

        double power = Math.pow(10, 3);


        // 3
        double d = -4.67;

        // int rounded = Math.abs(d);
        // int rounded = (int) (Math.random() * d);
        int rounded = (int) (d - 0.5);
        // int rounded = (int) (d + 0.5);
        // int rounded = Math.abs((int) (d - 0.5));

        double ex = 4.6
        (int) (ex + 0.5) -> 4

        // 5
        // Get random integer in range [1-50]
        // [0-49] + 1
        int winner = (int) (Math.random * 50) + 1;
        // int winner = (int) (Math.random * 50);
        // int winner = (int) (Math.random * 51);
        // int winner = (int) (Math.random * 51) + 1;
        // int winner = (int) (1 + Math.random * 49);

        // 6 - Which will change i to 25?
        Integer i = new Integer(20); // Integer i = 20;

        i = new Integer(25);

        //i.intValue() = 25;

        Integer j = new Integer(25);
        i = j;

        // 7 - Which will produce a compile-time error?
        Integer k = new Integer(8);
        Integer m = new Integer(4);

        // if (k == m) // Logic error, not syntax

        // if (k.equals(m))

        // if (k.intValue() == m.intValue())

        if (k.intValue().equals(m.intValue())) // Can't use .equals() on primitives

        // 9 - Which if statement will return true?
        String s1 = "crab";
        String s2 = new String("crab");
        String s3 = s1;

        // if (s1 == s2)
        if (s1.equals(s2))
        if (s3.equals(s1))

        // 10 - Given that "A" comes before "a" in ASCII order, which is true?
        strA = "TOMATO";
        strB = "tomato";
        strC = "tom";
        // if (strA.compareTo(strB) < 0 && strB.compareTo(strC) < 0)
        // if (strB.compareTo(strA) < 0 || strC.compareTo(strA) < 0)
        // if (strC.compareTo(strA) < 0 && strA.compareTo(strB) < 0)
        if (!(strA.equals(strB)) && strC.compareTo(strB) < 0)
        // if (!(strA.equals(strB)) && strC.compareTo(strA) < 0)
        
    }

    // 2
    public Double squareRoot(Double d) {
        // a
        double x = d;
        x = Math.sqrt(x);
        return x;

        // b
        return new Double(Math.sqrt(d.doubleValue()));

        //c
        return Double(Math.sqrt(d.doubleValue()));

        // answers: a, b
        }

    }
}
