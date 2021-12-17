public class Wrapper {

    public static void main() {
        // Wrapper Class
        Integer sample_Integer = new Integer(3);
        int sample_int = sample_Integer.intValue();

        Double sample_Double = new Double(3.14);
        double sample_double = sample_Double.doubleValue();

        // Autoboxing
        Integer intOb = 5; // equivalent to Integer intOb = Integer(5);


        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(4); // equivalent to list.add(Integer(4));

        double primitiveDouble = 10.5;
        String str = stringMethod(primitiveDouble); // stringMethod(Double(primitiveDouble))

        // Auto-unboxing
        Integer intOb1 = 9;
        Integer intOb2 = 8;

        int sums = sum(intOb1, intOb2); // sum(intOb1.intValue(), intOb2.intValue())

        int unboxed = intOb1; // int unboxed = intOb1.intValue();

        Integer intOb3 = 4;
        Integer intOb4 = new Integer(4);
        if (intOb3 == intOb4) {
            /* This will not run */
        }
        if (intOb3.intValue() == intOb4.intValue()) {
            /* This will run */
        }

        int n = 4;
        if (intOb3 == n) { // intOb1.intValue() == n
            /* This will run */
        }

        if (intOb1 > intOb3) { // intOb1.intValue() > intOb3.intValue()
            /* This will run */
        }

        if (intOb1 > n) { // intOb1.intValue() > n
            /* This will run */
        }
    }

    public String stringMethod(Double d) {
        /* returns some string with d inside */
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }
}

// Possible implementation of Integer class
public class Integer {

    private int wrappedValue;

    public Integer(int storeValue) {
        wrappedValue = storeValue;
    }

    public int intValue() {
        return wrappedValue;
    }

    public boolean equals(Integer other) {
        if (wrappedValue == other.intValue()) { // .intValue() is optional in this case
            return true;
        }
        else {
            return false;
        }
    }

}
