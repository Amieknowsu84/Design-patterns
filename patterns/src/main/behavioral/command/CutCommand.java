package main.behavioral.command;

// Concrete Command for cutting text
class CutCommand implements Command {
    private final Editor editor;

    public CutCommand(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.cut();
    }
}
