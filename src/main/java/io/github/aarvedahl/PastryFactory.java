package io.github.aarvedahl;

import java.util.ArrayList;
import java.util.List;

public class PastryFactory {

    public PastryFactory() {

    }

    public List<Pastry> makePastry(int number) {
        List<Pastry> pastryList = new ArrayList<>();

        if(number <= 0) { return pastryList; }
        int i = 1;
        while(i <= number) {
            if(i % 3 == 0) {
                Pastry bun = new Bun();
                pastryList.add(bun);
            } else if(i % 3 == 1) {
                Pastry cake = new Cake();
                pastryList.add(cake);
            } else if(i % 3 == 2) {
                Pastry cupCake = new CupCake();
                pastryList.add(cupCake);
            }
            i++;
        }

        return pastryList;
    }
}
