package main.creational.factory.problemv2;

public class VeggieBurger implements Burger {
    @Override
    public void prepare() {
        System.out.print("Preparing Veggie Burger");
    }
}
