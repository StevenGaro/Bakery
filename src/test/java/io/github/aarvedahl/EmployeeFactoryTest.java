package io.github.aarvedahl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class EmployeeFactoryTest {
    EmployeeFactory employeeFactory;

    @Before
    public void init() {
        employeeFactory = new EmployeeFactory();
    }

    @Test
    public void emptyList() {
        assertEquals(0, employeeFactory.hireEmployees(0).size());
    }

    @Test
    public void oneSenior() {
        Employee senior = new Employee(67, 70, 35);
        assertEquals(senior.getAge(), employeeFactory.hireEmployees(2).get(0).getAge());
    }

    @Test
    public void notEmptyList() {
        assertEquals(3, employeeFactory.hireEmployees(3).size());
    }

    @Test
    public void oneSeniorOneJunior() {
        Employee senior = new Employee(67, 70, 35);
        Employee junior = new Employee(50, 80, 35);
        assertEquals(senior.getAge(), employeeFactory.hireEmployees(2).get(0).getAge());
        assertEquals(junior.getAge(), employeeFactory.hireEmployees(2).get(1).getAge());
    }
}
