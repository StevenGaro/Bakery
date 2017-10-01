package io.github.aarvedahl.beverage;

public class MediumRoast extends Beverage {

    public MediumRoast() {
        super();
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
