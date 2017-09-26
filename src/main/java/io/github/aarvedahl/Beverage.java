package io.github.aarvedahl;

public abstract class Beverage {
    String description = "";

    public Beverage() { };

    public abstract Double cost();

    public String getDescription() {
        return description;
    }
}
