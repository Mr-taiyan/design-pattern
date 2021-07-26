import java.io.FileWriter;
import java.io.Writer;
import java.lang.System.Logger.Level;

public class FileLogger extends Loggor1 {
    private Writer fileWriter;

    public FileLogger(String name, boolean enabled, Level minPermitLevel, String filepath) {
        super(name, enabled, minPermitLevel);
        this.fileWriter = new FileWriter(filepath);
    }

    public void doLog(Level level, String message) {
        fileWriter.write("");
    }
}
