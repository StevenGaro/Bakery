package io.github.aarvedahl;

import java.util.ArrayList;
import java.util.List;

public class BeverageFactory {

    public BeverageFactory() {

    }

    public List<Beverage> collectBeverage(int number, Beverage beverageToAdd) {
        List<Beverage> list = new ArrayList<>();
        int i = 0;
        if(number <= 0) { return list; }
        while(i < number){
            Beverage beverage = beverageToAdd;
            list.add(beverage);
            i++;
        }
        return list;
    }

    public Beverage randomDecorator(int decoratorNumber, Beverage beverage) {
        if(decoratorNumber == 0) {
            return new CoffeeMilk(beverage);
        } else if(decoratorNumber == 1) {
            return new Mocha(beverage);
        } else if(decoratorNumber == 2) {
            return new Caramel(beverage);
        } else{
            return new WhippedCream(beverage);
        }
    }
    public Beverage randomBeverage(int beverageNumber) {
        if(beverageNumber == 0) {
            return new Espresso();
        } else if(beverageNumber == 1) {
            return new MediumRoast();
        } else {
            return new DarkRoast();
        }
    }
}
