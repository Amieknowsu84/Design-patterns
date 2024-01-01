package main.behavioral.strategy;

public class Italic implements FormattingStrategy {
    @Override
    public void write(String text) {
        System.out.println("{Italic}: " + text);
    }
}
