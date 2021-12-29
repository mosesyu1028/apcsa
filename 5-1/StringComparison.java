public class StringComparison {
    public static void main(String args[]) {

        String s1 = "hello";
        String s2 = "hello";

        if (s1.equals(s2)) {
            System.out.println("The strings match");
        }
        /*
        if s1.compareTo(s2)
            <0 -> s1 is before s2 in the dictionary
            0 -> s1 is equal ot s2
            >0 s1 is after s2 in the dictionary
        */
        s1 = "cat";
        s2 = "Cat";
        int comparison = s1.compareTo(s2); // = >0

        String s1 = "HOT", s2 = "HOTEL", s3 = "dog";
        if (s1.compareTo(s2) < 0))   //true, s1 terminates first
            ...
        if (s1.compareTo(s3) > 0))   //false, "H" comes before "d"

        String s = "oh no!";
        String t = new String("oh no!");
        if (s.equals(t)) {
            System.out.println("oh no!!!!");
        }
        // The moral of this fable is to always use .equals() for strings, and never ==

    }
}
