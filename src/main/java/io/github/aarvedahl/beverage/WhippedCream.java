package io.github.aarvedahl.beverage;

public class WhippedCream extends Decorator {

    public WhippedCream(Beverage beverage) {
        super(beverage);
    }

    @Override
    public Double ingredientsPrice() {
        return beverage.ingredientsPrice() + 2.5;
    }

    @Override
    public Double cost() {
        return beverage.cost() + 9.50;
    }

    @Override
    public int getMinutesToMake() {
        return beverage.getMinutesToMake() + 3;
    }
}
