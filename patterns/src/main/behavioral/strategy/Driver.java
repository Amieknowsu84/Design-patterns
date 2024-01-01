package main.behavioral.strategy;

public class Driver {
    /*
    Let's consider a scenario: You are building a text editor application,
     and you want to implement different text formatting strategies.
     Users should be able to choose formatting styles such as bold, italic, and underline.
      Implement the Strategy Design Pattern to encapsulate each formatting strategy
       and allow users to switch between them dynamically.
     */
    public static void main(String[] args){
         TextEditor textEditor = new TextEditor();
         textEditor.addText("Hello This is me.");
         FormattingStrategy ItalicFormattingStrategy = new Italic();
         textEditor.setFormattingStrategy(ItalicFormattingStrategy);
         textEditor.addText("Changed the formatting.");
    }
}
