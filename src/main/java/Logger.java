import java.util.Date;

public class Logger {
    private final Date date = new Date();
    private static final Logger instance = new Logger();
    protected int num = 1;


    public static Logger getInstance() {
        return instance;
    }

    public void log(String msg) {
        System.out.println("[" + date + num++ + "] " + msg);
    }
}
