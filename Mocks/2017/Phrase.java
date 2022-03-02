public class Phrase {
    private String currentPhrase;

    public Phrase(String p) {
        currentPhrase = p;
    }

    public int findNthOccurence(String str, int n) {
        /* implementation not shown */
    }

    // (a)
    public void replaceNthOccurrence(String str, int n, String repl) {
        int idx = findNthOccurence(str, n);

        // "A cat ate late."
        // "[A c][at][ ate late.]"
        // "at", 1, "rane" (replaceNthOccurrence -> idx = 3)
        //
        // [A c][rane][ ate late].

        currentPhrase = currentPhrase.substring(0, idx) + repl + currentPhrase.substring(idx + str.length());

    }

    // (b)
    public int findLastOccurrence(String str) {
        
    }
}
