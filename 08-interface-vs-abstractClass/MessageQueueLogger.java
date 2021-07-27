import java.lang.System.Logger.Level;

public class MessageQueueLogger extends Logger2 {
    private MessageQueueClient msgQueueClient;

    public MessageQueueLogger(String name, boolean enabled, Level minPermitLevel, MessageQueueClient msgQueueClient) {
        super(name, enabled, minPermitLevel);
        this.msgQueueClient = msgQueueClient;
    }

    public void log(Level level, String message) {
        if (!isLoggable()) return;

        msgQueueClient.send(...)
    }

}
