package main.creational.factory.solution;

public class NonVegBurger implements Burger {
    @Override
    public void prepare() {
        System.out.print("Preparing NonVeg Burger");
    }
}
