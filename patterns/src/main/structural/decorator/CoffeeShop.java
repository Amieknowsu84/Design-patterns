package main.structural.decorator;

public class CoffeeShop {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println("Cost of simple coffee: $" + coffee.cost());

        Coffee milkCoffee = new MilkDecorator(coffee);
        System.out.println("Cost of milk coffee: $" + milkCoffee.cost());

        Coffee sugarMilkCoffee = new SugarDecorator(milkCoffee);
        System.out.println("Cost of sugar milk coffee: $" + sugarMilkCoffee.cost());
    }
}
