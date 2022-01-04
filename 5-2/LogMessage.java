public class LogMessage
{
    private String machineId;
    private String description;


    //Precondition: message is a valid log message
    public LogMessage(String message) //part a
    {
        int indexSeparator = message.indexOf(":");
        String machineId = message.substring(0, indexSeparator);
        String description = message.substring(indexSeparator + 1);
    }

    //true if description of log message contains keyword, false if it does not
    public boolean containsWord(String keyword) //part b
    {
        if (description.indexOf(keyword) > -1) {
            return true;
        }
        return false;

    }

    public String getMachineId()
    {return machineId;}

    public String getDescription()
    {return description;}














}
