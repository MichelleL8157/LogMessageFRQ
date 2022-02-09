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
        if (description.equals(keyword)) {
            return true;
        }
        if (description.substring(keyword.length()).equals(" ")) {
            return true;
        }
        if (description.substring(description.length() - keyword.length()).equals(" ")) {
            return true;
        }
        return false;
    }

    public String getMachineId() {
        return machineId;
    }

    public String getDescription() {
        return description;
    }
}
