// APCSA 2018 Q2

public class WordPairList {
    private ArrayList<WordPair> allPairs;

    public WordPairList (String[] words) {

        ArrayList<WordPair> allPairs = new ArrayList<WordPair>();
        // {a b c d e}

        // ab ac ad ae
        // bc bd be
        // cd ce
        // de

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                WordPair newPair = new WordPair(words[i], words[j]);
                allPairs.add(newPair);
            }
        }

    }
}
