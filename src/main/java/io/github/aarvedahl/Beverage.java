package io.github.aarvedahl;

public abstract class Beverage {
    String description = "";
    int minutesToMake;

    public Beverage() { };

    public abstract Double ingredientsPrice();
    public abstract Double cost();

    public int getMinutesToMake() {
        return minutesToMake;
    }

    public String getDescription() {
        return description;
    }
}
