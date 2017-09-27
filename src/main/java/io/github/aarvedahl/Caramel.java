package io.github.aarvedahl;

public class Caramel extends Decorator {
    public Caramel(Beverage beverage) {
        super(beverage);
    }

    @Override
    public Double ingredientsPrice() {
        return beverage.ingredientsPrice() + 1.75;
    }

    @Override
    public Double cost() {
        return beverage.cost() + 7;
    }

    @Override
    public String getDescription() {
        return beverage.description + ", caramel";
    }

    @Override
    public int getMinutesToMake() {
        return beverage.getMinutesToMake() + 1;
    }
}
