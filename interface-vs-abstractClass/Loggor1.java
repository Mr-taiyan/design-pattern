import java.lang.System.Logger.Level;

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


}