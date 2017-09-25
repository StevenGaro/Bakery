package io.github.aarvedahl;

public abstract class Decorator extends Beverage {
    Beverage beverage;
    public Decorator(Beverage beverage) {
        this.beverage = beverage;
    }

}