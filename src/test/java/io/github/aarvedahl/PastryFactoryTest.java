package io.github.aarvedahl;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PastryFactoryTest {
    PastryFactory pastryFactory;
    @Before
    public void init() {
        pastryFactory = new PastryFactory();
    }

    @Test
    public void emptyList() {
        assertEquals(0, pastryFactory.makePastry(0).size());
    }

    @Test
    public void notEmptyList() {
        assertEquals(3, pastryFactory.makePastry(3).size());
    }

    @Test
    public void everyThirdBun() {
        Pastry bun = new Bun(3, 4, 10);
        assertEquals(bun.priceToCustomer, pastryFactory.makePastry(3).get(2).priceToCustomer);
    }

    @Test
    public void everyThirdCake() {
        Pastry cake = new Cake(10, 12, 25);
        assertEquals(cake.priceToCustomer, pastryFactory.makePastry(3).get(0).priceToCustomer);
    }

    @Test
    public void everyThirdMuffin() {
        Pastry muffin = new Muffin(5, 7, 15);
        assertEquals(muffin.priceToCustomer, pastryFactory.makePastry(3).get(1).priceToCustomer);
    }
}
