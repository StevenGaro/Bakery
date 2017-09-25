package io.github.aarvedahl;

public abstract class Beverage {
    String description = "";

    public Beverage() { };

    abstract Double cost();

    String getDescription() {
        return description;
    }
}
