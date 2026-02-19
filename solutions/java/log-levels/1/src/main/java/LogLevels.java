public class LogLevels {
    
    public static String message(String logLine) {
        return logLine.replaceAll("\\[[a-zA-Z]+\\]:s*", "").strip();
    }

    public static String logLevel(String logLine) {
        return logLine.replaceAll("^\\[([a-zA-Z]+)\\]:.*", "$1").strip().toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine)
        .concat(" (")
        .concat(logLevel(logLine))
        .concat(")");
    }
}
