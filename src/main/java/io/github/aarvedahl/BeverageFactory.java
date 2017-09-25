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
            int random = (int)(Math.random() * 4);
            list.add(new CoffeeMilk(randomBeverage(random)));
        }
        return list;
    }

    private Beverage randomBeverage(int randomNumber) {
        //if(randomNumber == 1) {
            return new Espresso();
      //  }
    }
}
