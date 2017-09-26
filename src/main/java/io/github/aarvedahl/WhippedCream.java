package io.github.aarvedahl;

public class WhippedCream extends Decorator {
    public WhippedCream(Beverage beverage) {
        super(beverage);
    }

    @Override
    public Double cost() {
        return beverage.cost() + 9.50;
    }

    @Override
    public String getDescription() {
        return beverage.description + ", whipped cream";
    }
}
