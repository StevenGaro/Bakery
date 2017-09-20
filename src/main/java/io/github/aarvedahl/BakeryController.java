package io.github.aarvedahl;

import java.util.ArrayList;
import java.util.List;

public class BakeryController {
    PastryFactory pastryFactory;
    EmployeeFactory employeeFactory;
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
            employeeSalary += employee.getHourlyWage() * employee.getWorkedHoursPerWeek();
        }
        return employeeFee + employeeSalary;
    }

    public List<String> pastriesList() {
        List<String> pastriesList = new ArrayList<>();
        PastryFactory pastryFactory = new PastryFactory();
        for(Pastry pastry: pastryFactory.makePastry(3)) {
            pastriesList.add(pastry.name);
        }
        return pastriesList;
    }


    public void weeklyResults(View view) {
        pastryFactory = new PastryFactory();
        employeeFactory = new EmployeeFactory();
        view.welcome(pastriesList());
        view.showProfit(calculatePastryProfit(pastryFactory.makePastry(view.getInput())));
        view.showFee(Math.round(calculateEmployeeFee(employeeFactory.hireEmployees(1)) * 100.0) / 100.0);
        view.showTotal();
    }
}