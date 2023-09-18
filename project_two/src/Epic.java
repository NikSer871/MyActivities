import java.util.ArrayList;
import java.util.Arrays;

public class Epic extends Task {
    ArrayList<Subtask> subtasks;

    Epic(String name, String description, String action, int hours, int minutes) {
        super(name, description, action, hours, minutes);
        subtasks = new ArrayList<>();
    }
}
