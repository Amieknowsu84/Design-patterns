package main.creational.factory.problemv2;

public class SimpleBurgerFactory {

    public Burger createBurger(String request) {
        Burger burger = null;
        if ("NonVeg".equals(request)) {
            burger = new NonVegBurger();
        } else if ("Veggie".equals(request)) {
            burger = new VeggieBurger();
        } else {
            throw new RuntimeException("Burger Not Found");
        }
        return burger;
    }
}
