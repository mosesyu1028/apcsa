public class StringFormatter {


    // (a)
    public static int totalLetters(List<String> wordList) {
        int letters = 0;

        // for (int i = 0; i < wordList.size(); i++) {
        // letters += wordList.get(i).length();
        // }
        for (String word : wordList) {
            letters += word.length();
        }
        return letters;
    }

    // (b)
    public static int basicGapWidth(List<String> wordList, int formattedLen) {
        // amount of letters: totalLetters(wordList)
        // amount of words: wordList.size()
        // amount of characters total: formattedLen

        // total = letters + spaces
        int spaces = formattedLen - totalLetters(wordList);

        // total spaces / amount of gaps = gap width
        return spaces / (wordList.size() - 1);
    }


    public static int leftoverSpaces(List<String> wordList, int formattedLen) {
        /*implementation not shown*/
    }

    // (c)
    public static String format(List<String> wordList, int formattedLen) {

    }
}
