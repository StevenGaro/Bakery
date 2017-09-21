package io.github.aarvedahl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class BakeryControllerTest {
    BakeryController bakeryController;

    @Before
    public void init() {
        bakeryController = new BakeryController();
    }

    @Test
    public void zeroPastryProfit() {
        PastryFactory pastryFactory = new PastryFactory();
        assertEquals(0, bakeryController.calculatePastryProfit(pastryFactory.makePastry(0)));
    }

    @Test
    public void calculatePastryProfit() {
        PastryFactory pastryFactory = new PastryFactory();
        assertEquals(44, bakeryController.calculatePastryProfit(pastryFactory.makePastry(3)));
        assertEquals(77,  bakeryController.calculatePastryProfit(pastryFactory.makePastry(5)));
    }

    @Test
    public void zeroEmployees() {
        EmployeeFactory employeeFactory = new EmployeeFactory();
        assertEquals(0, bakeryController.calculateEmployeeFee(employeeFactory.hireEmployees(0)), 0.001);
    }

    @Test
    public void oneEmployee() {
        EmployeeFactory employeeFactory = new EmployeeFactory();
        assertEquals(2976.015, bakeryController.calculateEmployeeFee(employeeFactory.hireEmployees(1)), 0.001);
    }

    @Test
    public void twoEmployees() {
        EmployeeFactory employeeFactory = new EmployeeFactory();
        assertEquals(5952.03, bakeryController.calculateEmployeeFee(employeeFactory.hireEmployees(2)), 0.01);
    }

    @Test
    public void pastriesList() {
        assertEquals(3, bakeryController.pastriesList().size());
    }


    @Test
    public void enoughtWithTime() {

    }

    @Test
    public void notEnoughTime() {

    }
}
