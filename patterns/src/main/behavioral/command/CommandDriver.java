package main.behavioral.command;


// Client
public class CommandDriver {
    public static void main(String[] args) {
        Editor editor = new TextEditor();
        Invoker invoker = new Invoker();

        // Typing text
        Command typeCommand = new TypeCommand(editor, "Hello, World!");
        invoker.executeCommand(typeCommand);

        // Copying text
        Command copyCommand = new CopyCommand(editor);
        invoker.executeCommand(copyCommand);

        // Cutting text
        Command cutCommand = new CutCommand(editor);
        invoker.executeCommand(cutCommand);

        // Pasting text
        Command pasteCommand = new PasteCommand(editor);
        invoker.executeCommand(pasteCommand);

        // Undoing last command
        invoker.undoLastCommand();
    }
}
