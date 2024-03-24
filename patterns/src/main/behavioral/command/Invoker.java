package main.behavioral.command;

import java.util.ArrayList;
import java.util.List;

// Invoker
class Invoker {
    private final List<Command> history = new ArrayList<>();

    public void executeCommand(Command command) {
        command.execute();
        history.add(command);
    }

    public void undoLastCommand() {
        if (!history.isEmpty()) {
            Command lastCommand = history.remove(history.size() - 1);
            // Undo the last command
            System.out.println("Undoing last command");
        } else {
            System.out.println("No command to undo");
        }
    }
}
