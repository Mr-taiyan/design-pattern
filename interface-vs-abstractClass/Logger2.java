public class Logger2 {
    private String name;
    private boolean enabled;
    private Level minPermittedLevel;

    public Logger2(String name, boolean enabled, Level minPermittedLevel) {
        this.name = name;
        this.enabled = enabled;
        this.minPermittedLevel = minPermittedLevel;
    }

    protected boolean isLoggable() {
        boolean loggable = enabled && (minPermittedLevel.intValue() <= level.intValue());
        return loggable;
    }

}
