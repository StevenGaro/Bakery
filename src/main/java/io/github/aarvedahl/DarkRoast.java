package io.github.aarvedahl;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        super();
        description = "Dark Roast";
        minutesToMake = 2;
    }

    @Override
    public Double ingredientsPrice() {
        return 1.5;
    }

    @Override
    public Double cost() {
        return 12.99;
    }
}
