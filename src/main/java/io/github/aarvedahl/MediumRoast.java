package io.github.aarvedahl;

public class MediumRoast extends Beverage {

    public MediumRoast() {
        super();
        description = "Medium Roast";
        minutesToMake = 1;
    }

    @Override
    public Double ingredientsPrice() {
        return 1.25;
    }

    @Override
    public Double cost() {
        return 9.99;
    }
}
