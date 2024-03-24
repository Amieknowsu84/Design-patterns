package main.behavioral.command;

// Concrete Command for typing text
class TypeCommand implements Command {
    private final Editor editor;
    private final String text;

    public TypeCommand(Editor editor, String text) {
        this.editor = editor;
        this.text = text;
    }

    @Override
    public void execute() {
        editor.type(text);
    }
}
