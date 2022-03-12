// (a)
public class RandomStringChooser {

    private ArrayList<String> words;

    public RandomStringChooser(String[] wordArray) {
        words = new ArrayList<String>;
        for (String str : wordArray) {
            words.add(str);
        }
    }

    public String getNext() {
        // 1. Check if we have any words to print
        if (words.size() == 0) {
            return "NONE"; // equivilant to return new String("NONE")
        }
        // 2. choose a string at random
        int randIdx = (int) (Math.random() * words.size());
        String randString = words.get(randIdx);

        // 3. delete the string from words
        words.remove(randIdx);
        // 4. return the string
        return randString;
    }
}


public class RandomLetterChooser extends RandomStringChooser {

    // (b)
    public RandomLetterChooser(String str) {
        String[] letters = getSingleLetters(str); // "hello" -> ["h", "e", "l", ...]
        super(letters);
    }

    public static String[] getSingleLetters(String str) {/* implementation not shown */}

}
