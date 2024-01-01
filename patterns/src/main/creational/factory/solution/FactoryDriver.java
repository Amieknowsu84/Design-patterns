package main.creational.factory.solution;

public class FactoryDriver {

    public static void main(String[] args){
        VeggieBurgerRestaurant veggieBurgerRestaurant=new VeggieBurgerRestaurant();
        Burger vegBurger=veggieBurgerRestaurant.orderBurger();
        System.out.println(vegBurger);
        NonVeggieBurgerRestaurant nonVeggieBurgerRestaurant=new NonVeggieBurgerRestaurant();
        Burger nonVegBurger=nonVeggieBurgerRestaurant.orderBurger();
        System.out.println(nonVegBurger);

    }
}
