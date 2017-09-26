package io.github.aarvedahl;

import java.util.ArrayList;
import java.util.List;

public class BeverageFactory {

    public BeverageFactory() {

    }

    public List<Beverage> roastBeverage(int number) {
        List<Beverage> list = new ArrayList<>();
        int i = 0;
        if(number == 0) { return list; }
        while(i < number){
            Beverage beverage = new CoffeeMilk(randomBeverage(2));
            list.add(beverage);
            i++;
        }
        return list;
    }

    private Beverage randomBeverage(int randomNumber) {
        //if(randomNumber == 1) {
            return new Espresso();
      //  }
    }
}
