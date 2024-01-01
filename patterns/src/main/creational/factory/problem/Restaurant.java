package main.creational.factory.problem;

public class Restaurant {
    public Burger orderBurger(String request) {
        Burger burger = null;
        if ("NonVeg".equals(request)) {
            burger = new NonVegBurger();
        } else if ("Veggie".equals(request)) {
            burger = new VeggieBurger();
        }
        if (burger != null) {
            burger.prepare();
        }
        return burger;
    }
}
