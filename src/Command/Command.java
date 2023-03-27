package Command;

import java.util.HashMap;

public interface Command {
    HashMap<String, String> execute(String input) throws Exception;
}