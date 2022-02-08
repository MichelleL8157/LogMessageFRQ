public class LogMessage {
    private String machineId;
    private String description;

    public LogMessage(String message) {
        int indexColon = message.indexOf(":");
        machineId = message.substring(0, indexColon);
        description = message.substring(indexColon + 1);
    }

    public boolean containsWord(String keyword) {
        if (description.indexOf(keyword) == -1) {
            return false;
        }
        boolean pass = false;
        if (description.equals(keyword)) {
            pass = true;
        }
        

        if (description.indexOf(keyword) == 0) {
            pass = true;
        }
        else if (keyword.equals(description.substring(description.length() - keyword.length()))) {
            pass = true;
        }
        else if ()
    }
}
