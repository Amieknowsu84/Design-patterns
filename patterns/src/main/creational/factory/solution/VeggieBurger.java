package main.creational.factory.solution;

public class VeggieBurger implements Burger {
    @Override
    public void prepare() {
        System.out.print("Preparing Veggie Burger");
    }
}
