package io.github.aarvedahl;

import java.util.ArrayList;
import java.util.List;

public class EmployeeFactory {

    public EmployeeFactory() {  }

    public List<Employee> hireEmployees(int number) {
        List<Employee> employees = new ArrayList<>();

        if(number == 0){ return employees; }
        int i = 1;
        Employee senior = new Employee(67, 70, 35);
        employees.add(senior);
        while(i < number) {
            int random = (int)(Math.random() * 3);
            if(random != 1) {
                Employee employee = new Employee(50, 80, 40);
                employees.add(employee);
            } else {
                Employee oldEmployee = new Employee(67, 70, 35);
                employees.add(oldEmployee);
            }
            i++;
        }
        return employees;
    }
}
