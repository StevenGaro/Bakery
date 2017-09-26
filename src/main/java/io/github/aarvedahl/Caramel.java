package io.github.aarvedahl;

public class Caramel extends Decorator {
    public Caramel(Beverage beverage) {
        super(beverage);
    }

    @Override
    public Double cost() {
        return beverage.cost() + 7;
    }

    @Override
    public String getDescription() {
        return beverage.description + ", caramel";
    }
}
