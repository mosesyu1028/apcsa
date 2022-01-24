public class Delimiters
{
    private String openDel;
    private String closeDel;

    public Delimiters(String open, String close)
    {
        openDel = open;
        closeDel = close;
    }

    public ArrayList<String> getLimitersList(String[] tokens)
    {
        ArrayList<String> limiterList = new ArrayList<String>();

        // int j = 0;

        for (int i = 0; i < tokens.length; i++){

            if (tokens[i].equals(openDel) || tokens[i].equals(closeDel) {
                    limiterList.add(tokens[i]);

                    // limiterList.add(limiterList.size(), tokens[i]);
                    // limiterList.add(j, tokens[i]); // note: j = limiterList.size(), no need to store extra var

                    // j++;
            }
        }

        return limiterList;
    }
}
