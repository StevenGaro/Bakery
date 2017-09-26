package io.github.aarvedahl;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class BeverageFactoryTest {
    BeverageFactory beverageFactory;
    @Before
    public void init() {
        beverageFactory = new BeverageFactory();
    }


    @Test
    public void oneBeverage() {
        assertEquals(1, beverageFactory.collectBeverage(1, beverageFactory.randomDecorator(0, beverageFactory.randomBeverage(0))).size());
    }

    @Test
    public void correctPrice() {
       assertEquals(21.49, beverageFactory.collectBeverage(1, beverageFactory.randomDecorator(0, beverageFactory.randomBeverage(0))).get(0).cost(), 0.01);
       assertEquals(19.49, beverageFactory.collectBeverage(1, beverageFactory.randomDecorator(3, beverageFactory.randomBeverage(1))).get(0).cost(), 0.01);
    }

    @Test
    public void correctIngredientsPrice() {
        assertEquals(5.75, beverageFactory.collectBeverage(1, beverageFactory.randomDecorator(2, beverageFactory.randomBeverage(0))).get(0).ingredientsPrice(), 0.01);
        assertEquals(4, beverageFactory.collectBeverage(1, beverageFactory.randomDecorator(3, beverageFactory.randomBeverage(2))).get(0).ingredientsPrice(), 0.01);
        assertEquals(3.24, beverageFactory.collectBeverage(1, beverageFactory.randomDecorator(1, beverageFactory.randomBeverage(1))).get(0).ingredientsPrice(), 0.01);
    }
}
