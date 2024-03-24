package main.behavioral.command;

// Concrete Command for copying text
class CopyCommand implements Command {
    private final Editor editor;

    public CopyCommand(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.copy();
    }
}
