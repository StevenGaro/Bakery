package io.github.aarvedahl;

import java.util.ArrayList;
import java.util.List;

public class CarlosBakeryController {
    PastryFactory pastryFactory;
    EmployeeFactory employeeFactory;

    public CarlosBakeryController() {

    }

    public int calculatePastryProfit(List<Pastry> pastries) {
        int cost = 0;
        int priceToCustomer = 0;
        for(Pastry pastry: pastries) {
            for(Ingredient ingredient: pastry.getRecipe()) {
                cost += ingredient.amount * ingredient.costPerKg;
            }
            priceToCustomer += pastry.priceToCustomer;
        }
        return priceToCustomer - cost;
    }

    public double calculateEmployeeFee(List<Employee> employees) {
        double employeeFee = 0;
        int employeeSalary = 0;
        for(Employee employee: employees) {
            if(employee.getAge() >= 65) {
                employeeFee += 0.1636 * (employee.getHourlyWage() * employee.getWorkedHoursPerWeek());
             } else {
                employeeFee += 0.3142 * (employee.getHourlyWage() * employee.getWorkedHoursPerWeek());
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


    public void weeklyResults(IView view) {
        pastryFactory = new PastryFactory();
        employeeFactory = new EmployeeFactory();
        view.welcome(pastriesList());
        int amountOfPastry = view.getInput();
        if(enoughWithTime(employeeFactory.hireEmployees(1), pastryFactory.makePastry(amountOfPastry))) {
            view.showProfit(calculatePastryProfit(pastryFactory.makePastry(amountOfPastry)));
            view.showFee(calculateEmployeeFee(employeeFactory.hireEmployees(1)));
            view.showTotal();
        } else {
            view.notEnoughTime();
        }
    }

    public boolean enoughWithTime(List<Employee> employees, List<Pastry> pastries) {
        int employeeMinutes = 0;
        int pastriesMinutes = 0;
        for(Employee employee: employees) {
            employeeMinutes += (employee.getWorkedHoursPerWeek() * 60);
        }
        for(Pastry pastry: pastries) {
            pastriesMinutes += pastry.minutesToMake;
        }
        if(employeeMinutes >= pastriesMinutes) {
            return true;
        } else {
            return false;
        }
    }

    public double calculateBeverageProfit(List<Beverage> beverages) {
        double profit = 0;
        double ingredientCost = 0;
        for(Beverage beverage: beverages) {
            profit += beverage.cost();
            ingredientCost += beverage.ingredientsPrice();
        }
        return profit - ingredientCost;
    }
}