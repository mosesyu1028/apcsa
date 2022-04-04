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
        String formatted = "";

        int leftoverSpaces = leftoverSpaces(wordList, formattedLen);
        int gapWidth = basicGapWidth(wordList, formattedLen);

        for (int w = 0; w < wordList.size() - 1; w++) {
            formatted += wordList.get(w);

            for (int g = 0; g < gapWidth; g++) {
                formatted += " ";
            }
            if (leftoverSpaces > 0) {
                formatted += " ";
                leftoverSpaces--;
            }

        }
        formatted += wordList.get(wordList.size() - 1);

        return formatted;
    }
}
