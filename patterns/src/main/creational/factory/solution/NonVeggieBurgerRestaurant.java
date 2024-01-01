package main.creational.factory.solution;


public class NonVeggieBurgerRestaurant extends Restaurant{
    @Override
    public Burger createBurger() {
        return new NonVegBurger();
    }
}
