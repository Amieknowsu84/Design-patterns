package main.creational.factory.problemv2;

public class NonVegBurger implements Burger {
    @Override
    public void prepare() {
        System.out.print("Preparing NonVeg Burger");
    }
}
