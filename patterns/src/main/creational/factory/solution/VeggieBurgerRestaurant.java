package main.creational.factory.solution;

public class VeggieBurgerRestaurant extends Restaurant{
    @Override
    public Burger createBurger() {
       return new VeggieBurger();
    }
}
