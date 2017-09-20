package io.github.aarvedahl;

import java.util.ArrayList;
import java.util.List;

public class PastryFactory implements Factory{

    public PastryFactory() {

    }

    public List<Pastry> makePastry(int number) {
        List<Pastry> pastryList = new ArrayList<>();

        int i = 1;
        while(i <= number) {
            if(i % 3 == 0) {
                Pastry bun = new Bun();
                pastryList.add(bun);
            } else if(i % 3 == 1) {
                Pastry cake = new Cake();
                pastryList.add(cake);
            } else if(i % 3 == 2) {
                Pastry muffin = new Muffin();
                pastryList.add(muffin);
            }
            i++;
        }

        return pastryList;
    }
}
