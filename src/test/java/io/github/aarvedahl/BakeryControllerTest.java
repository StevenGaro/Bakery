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
        assertEquals(27, bakeryController.calculatePastryProfit(pastryFactory.makePastry(3)));
        assertEquals(48,  bakeryController.calculatePastryProfit(pastryFactory.makePastry(5)));
    }

    @Test
    public void zeroEmployees() {
        EmployeeFactory employeeFactory = new EmployeeFactory();
        assertEquals(0, bakeryController.calculateEmployeeFee(employeeFactory.hireEmployees(0)), 0.001);
    }

    @Test
    public void oneEmployee() {
        EmployeeFactory employeeFactory = new EmployeeFactory();
        assertEquals(526.015, bakeryController.calculateEmployeeFee(employeeFactory.hireEmployees(1)), 0.001);
    }

    @Test
    public void twoEmployees() {
        EmployeeFactory employeeFactory = new EmployeeFactory();
        assertEquals(1168.96, bakeryController.calculateEmployeeFee(employeeFactory.hireEmployees(2)), 0.01);
    }

    @Test
    public void pastriesList() {
        assertEquals(3, bakeryController.pastriesList().size());
    }

}
