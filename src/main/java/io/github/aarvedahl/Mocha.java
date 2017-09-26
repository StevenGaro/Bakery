package io.github.aarvedahl;

public class Mocha extends Decorator {

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public Double ingredientsPrice() {
        return beverage.ingredientsPrice() + 1.99;
    }

    @Override
    public Double cost() {
        return beverage.cost() + 5;
    }

    @Override
    public String getDescription() {
        return beverage.description + ", mocha";
    }
}
