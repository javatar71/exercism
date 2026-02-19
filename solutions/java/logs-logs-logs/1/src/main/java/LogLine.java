public class LogLine {

    private String logLine;

    private String logLevel;

    private String logMessage;


    public LogLine(String logLine) {
        String[] temp_line = logLine.split(":");
        this.logLevel = temp_line[0].substring(1,4);
        this.logMessage = temp_line[1].strip();
    }

    public LogLevel getLogLevel() {
            return LogLevel.getObject(logLevel);
        }

    public String getOutputForShortLog() {
        return getLogLevel().getCode() + ":" + logMessage;
    }
}

