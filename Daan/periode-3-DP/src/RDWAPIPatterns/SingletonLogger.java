package RDWAPIPatterns;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;

// A single instance of a logger available to all clients
public final class SingletonLogger {

    private static SingletonLogger logger = null;
    private final String logFile = "demo_singleton_log-" + new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date()) + ".txt";
    private PrintWriter writer;

    private SingletonLogger() {
        try {
            FileWriter fw = new FileWriter(logFile);
            writer = new PrintWriter(fw, true);
        } catch (IOException e) {}
    }

    public static synchronized SingletonLogger getInstance(){
        if(logger == null)
            logger = new SingletonLogger();
        return logger;
    }

    public void logLicense (String license) {
        writer.println("LICENSE (" + license + "): " + new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date()));
    }

    // Can be expanded with more loggers
}