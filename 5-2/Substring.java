public class Substring {

    public static void main(String args[]) {

        // substring(first char we WANT, first char we DON'T want)

        "unhappy".substring(2)       //returns "happy"
        "cold".substring(4)          //returns "" (empty string)
        "cold".substring(5)          //StringIndexOutOfBoundsException
        "strawberry".substring(5,7)  //returns "be"
        "crayfish".substring(4,8)    //returns "fish"
        "crayfish".substring(4,9)    //StringIndexOutOfBoundsException
        "crayfish".substring(5,4)    //StringIndexOutOfBoundsException

        String s = "funnyfarm";
        int x = s.indexOf("farm");   //x has value 5
        x = s.indexOf("farmer");     //x has value -1
        int y = s.length();          //y has value 9


        // English to Pig Latin conversion:
        // "dog" -> "ogday"
        // "crisp" -> "rispcay"

        String s = // English word that starts with a consonant

        String pigString = s.substring(1) + s.substring(0,1) + "ay";
    }
}
