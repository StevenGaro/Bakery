package io.github.aarvedahl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class CarlosCarlosBakeryControllerTest {
    CarlosBakeryController carlosBakeryController;

    @Before
    public void init() {
        carlosBakeryController = new CarlosBakeryController();
    }

    @Test
    public void zeroPastryProfit() {
        PastryFactory pastryFactory = new PastryFactory();
        assertEquals(0, carlosBakeryController.calculatePastryProfit(pastryFactory.makePastry(0)));
    }

    @Test
    public void calculatePastryProfit() {
        PastryFactory pastryFactory = new PastryFactory();
        assertEquals(44, carlosBakeryController.calculatePastryProfit(pastryFactory.makePastry(3)));
        assertEquals(77,  carlosBakeryController.calculatePastryProfit(pastryFactory.makePastry(5)));
    }

    @Test
    public void zeroEmployees() {
        EmployeeFactory employeeFactory = new EmployeeFactory();
        assertEquals(0, carlosBakeryController.calculateEmployeeFee(employeeFactory.hireEmployees(0)), 0.001);
    }

    @Test
    public void oneEmployee() {
        EmployeeFactory employeeFactory = new EmployeeFactory();
        assertEquals(2976.015, carlosBakeryController.calculateEmployeeFee(employeeFactory.hireEmployees(1)), 0.001);
    }

    @Test
    public void twoEmployees() {
        EmployeeFactory employeeFactory = new EmployeeFactory();
        assertEquals(5952.03, carlosBakeryController.calculateEmployeeFee(employeeFactory.hireEmployees(2)), 0.01);
    }

    @Test
    public void pastriesList() {
        assertEquals(3, carlosBakeryController.pastriesList().size());
    }


    @Test
    public void enoughWithTime() {
        EmployeeFactory employeeFactory = new EmployeeFactory();
        PastryFactory pastryFactory = new PastryFactory();
        assertEquals(true, carlosBakeryController.enoughWithTime(employeeFactory.hireEmployees(1), pastryFactory.makePastry(250)));
    }

    @Test
    public void notEnoughTime() {
        EmployeeFactory employeeFactory = new EmployeeFactory();
        PastryFactory pastryFactory = new PastryFactory();
        assertEquals(false, carlosBakeryController.enoughWithTime(employeeFactory.hireEmployees(1), pastryFactory.makePastry(350)));
    }
}
