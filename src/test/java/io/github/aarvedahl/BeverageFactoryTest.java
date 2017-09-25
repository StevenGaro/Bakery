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
        System.out.println(beverageFactory.roastBeverage(1).size());
        assertEquals(1, beverageFactory.roastBeverage(1).size());
    }
}
