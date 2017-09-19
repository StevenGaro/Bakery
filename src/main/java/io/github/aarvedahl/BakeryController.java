package io.github.aarvedahl;

import java.util.List;

public class BakeryController {

    public  BakeryController() {

    }

    public int calculatePastryProfit(List<Pastry> pastries) {
        int cost = 0;
        int priceToCustomer = 0;
        for(Pastry pastry: pastries) {
            cost += pastry.commodiesPrice;
            priceToCustomer += pastry.priceToCustomer;
        }
        return priceToCustomer - cost;

    }
// TODO add employeesalary
    public double calculateEmployeeFee(List<Employee> employees) {
        double employeeFee = 0;
        int employeeSalary = 0;
        for(Employee employee: employees) {
            if(employee.getAge() >= 65) {
                employeeFee = 0.1636 * (employee.getHourlyWage() * employee.getWorkedHoursPerWeek());
             } else {
                employeeFee = 0.3142 * (employee.getHourlyWage() * employee.getWorkedHoursPerWeek());
            }
            employeeFee += 0.0511 * (employee.getHourlyWage() * employee.getWorkedHoursPerWeek());
        }
        return employeeFee;
    }
}