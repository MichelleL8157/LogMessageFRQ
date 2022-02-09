import java.util.ArrayList;

public class SystemLog {
    private ArrayList<LogMessage> messageList;

    public SystemLog() {
        messageList = new ArrayList<LogMessage>();
    }

    public void addMessage(LogMessage message) {
        messageList.add(message);
    }

    public ArrayList<LogMessage> removeMessages(String keyword) {
        for (int i = 0; i != messageList.size(); i++) {
            LogMessage message = messageList.get(i);
            if (message.containsWord(keyword)) {
                messageList.remove(i);
                i--;
            }
        }
        return messageList;
    }
}
