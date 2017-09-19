package io.github.aarvedahl;

import java.util.ArrayList;
import java.util.List;

public class PastryFactory {

    public PastryFactory() {

    }

    public List<Pastry> makePastry(int number) {
        List<Pastry> pastryList = new ArrayList<>();

        int i = 1;
        while(i <= number) {
            if(i % 3 == 0) {
                Pastry bun = new Bun(3, 4, 10);
                pastryList.add(bun);
            } else if(i % 3 == 1) {
                Pastry cake = new Cake(10, 12, 25);
                pastryList.add(cake);
            } else if(i % 3 == 2) {
                Pastry muffin = new Muffin(5, 7, 15);
                pastryList.add(muffin);
            }
            i++;
        }

        return pastryList;
    }
}
