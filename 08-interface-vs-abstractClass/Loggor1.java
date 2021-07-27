import java.lang.System.Logger.Level;
import java.util.logging.Logger;

/**
 * AbstractClassSample
 */
public abstract class Loggor1 {

    private String name;
    private boolean enabled;
    private Level minPermittedLevel;

    public Loggor1(String name, boolean enabled, Level minPermittedLevel) {
        this.name = name;
        this.enabled = enabled;
        this.minPermittedLevel = minPermittedLevel;
    }

    public void log(Level level, String message) {
        boolean loggable = enabled && (minPermittedLevel.intValue() <= level.intValue());
        if (!loggable) return;
        doLog(level, message);
    }

    protected abstract void doLog(Level level, String message);

}
