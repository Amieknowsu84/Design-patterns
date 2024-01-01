package main.creational.factory.problemv2;

public class Restaurant {
    public Burger orderBurger(String request) {
        SimpleBurgerFactory burgerFactory = new SimpleBurgerFactory();
        Burger burger = burgerFactory.createBurger(request);
        burger.prepare();
        return burger;
    }
}
