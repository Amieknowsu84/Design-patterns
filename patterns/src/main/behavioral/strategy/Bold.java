package main.behavioral.strategy;

public class Bold implements FormattingStrategy{
    @Override
    public void write(String text) {
        System.out.println("{Bold} "+text);
    }
}
