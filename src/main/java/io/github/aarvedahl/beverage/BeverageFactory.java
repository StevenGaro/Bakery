package io.github.aarvedahl.beverage;

import java.util.ArrayList;
import java.util.List;

public class BeverageFactory {

    public BeverageFactory() {

    }

    public List<Beverage> collectBeverage(int number) {
        List<Beverage> list = new ArrayList<>();
        int i = 0;
        if (number <= 0) {
            return list;
        }
        while (i < number) {
            int decoratorNumber = (int) (Math.random() * 4);
            int beverageNumber = (int) (Math.random() * 3);
            Beverage beverage = randomDecorator(decoratorNumber, randomBeverage(beverageNumber));
            list.add(beverage);
            i++;
        }
        return list;
    }

    private Beverage randomDecorator(int decoratorNumber, Beverage beverage) {
        if (decoratorNumber == 0) {
            return new CoffeeMilk(beverage);
        } else if (decoratorNumber == 1) {
            return new Mocha(beverage);
        } else if (decoratorNumber == 2) {
            return new Caramel(beverage);
        } else {
            return new WhippedCream(beverage);
        }
    }

    private Beverage randomBeverage(int beverageNumber) {
        if (beverageNumber == 0) {
            return new Espresso();
        } else if (beverageNumber == 1) {
            return new MediumRoast();
        } else {
            return new DarkRoast();
        }
    }

}
