package io.github.aarvedahl;

public class Employee {
    private int age;
    private int hourlyWage;
    private int workedHoursPerWeek;

    public Employee(int age, int hourlyWage, int workedHoursPerWeek) {
        this.age = age;
        this.hourlyWage = hourlyWage;
        this.workedHoursPerWeek = workedHoursPerWeek;
    }

    public int getAge() {
        return age;
    }

    public int getHourlyWage() {
        return hourlyWage;
    }

    public int getWorkedHoursPerWeek() {
        return workedHoursPerWeek;
    }
}
