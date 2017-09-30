package io.github.aarvedahl;

public abstract class Beverage {
    int minutesToMake;

    public Beverage() {
    }

    public abstract Double ingredientsPrice();

    public abstract Double cost();

    public int getMinutesToMake() {
        return minutesToMake;
    }

}
