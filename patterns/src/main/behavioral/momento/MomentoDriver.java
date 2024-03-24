package main.behavioral.momento;

public class MomentoDriver {
    public static void main(String[] args) {

        Editor editor = new Editor();
        editor.write("Do Stuff.");
        editor.printText();
        editor.write("Do More Stuff.");
        editor.printText();
        editor.write("Do Something different.");
        editor.printText();
        editor.undo();
        editor.printText();
        editor.undo();
        editor.printText();
        editor.undo();
        editor.printText();

    }
}
