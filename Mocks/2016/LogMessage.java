public class LogMessage
{
    private String machineId;
    private String description;

    // (a)
    //Precondition: message is a valid log message
    public LogMessage(String message) //part a
    {
        int indexSeparator = message.indexOf(":");
        String machineId = message.substring(0, indexSeparator);
        String description = message.substring(indexSeparator + 1);
    }

    // (b)
    //true if description of log message "properly contains" keyword, false if it does not
    public boolean containsWord(String keyword)
    {
        int keyIdx = description.indexOf(keyword);
        if (keyIdx == -1) {
            return false;
        }
        if (keyIdx != 0 && !description.substring(keyIdx - 1, keyIdx).equals(" ")) {
            return false;
        }
        if (keyIdx + keyword.length() != description.length() && !description.substring(keyIdx + keyword.length() + 1, keyIdx + keyword.length() + 2).equals(" ")) {
            return false;
        }
        return true;


        // alternate 1:
        if (keyIdx == 0 || description.substring(keyIdx - 1, keyIdx).equals(" ")) {
            if (keyIdx + keyword.length() == description.length() || description.substring(keyIdx + keyword.length() + 1, keyIdx + keyword.length() + 2).equals(" ")) {
                if (keyIdx == 1) {
                    return true;
                }
            }
        }
        return false;


        // alternate 2:
        String paddedDesc = " " + description + " ";
        int keyIdx = paddedDesc.indexOf(keyword);
        if (keyIdx == -1) {
            return false;
        }
        if (!paddedDesc.substring(keyIdx - 1, keyIdx).equals(" ")) {
            return false;
        }
        if (!paddedDesc.substring(keyIdx + keyword.length() + 1, keyIdx + keyword.length() + 2).equals(" ")) {
            return false;
        }
        return true;

    }

    public String getMachineId()
    {return machineId;}

    public String getDescription()
    {return description;}

    // (c)
    public List<LogMessage> removeMessages (String keyword) {

        ArrayList<LogMessage> removeList = new ArrayList<LogMessage>();

        for (int i = 0; i < messageList.size(); i++) {
            if (messageList.get(i).containsWord(keyword)) {

                removeList.add(messageList.get(i));
                messageList.remove(i);

                // removeList.add(messageList.remove(i));
                i--; // to realign the index
            }
        }
        return removeList;
    }
    
}
