package io.github.aarvedahl.beverage;

public abstract class Decorator extends Beverage {
    Beverage beverage;

    public Decorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public abstract int getMinutesToMake();
}
