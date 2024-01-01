package main.behavioral.strategy;

public class TextEditor {
    private FormattingStrategy formattingStrategy;
    private String text;

    TextEditor(){
        this.text = "";
        this.formattingStrategy = new Bold();
    }

    void addText(String text){
        formattingStrategy.write(text);
    }

    public FormattingStrategy getFormattingStrategy() {
        return formattingStrategy;
    }

    public void setFormattingStrategy(FormattingStrategy formattingStrategy) {
        this.formattingStrategy = formattingStrategy;
    }


}
