package io.github.aarvedahl;

public abstract class Beverage {
    String description = "";
    int timeToMake;

    public Beverage() { };

    public abstract Double ingredientsPrice();
    public abstract Double cost();

    public String getDescription() {
        return description;
    }
}
