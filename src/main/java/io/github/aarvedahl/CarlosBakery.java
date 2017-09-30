package io.github.aarvedahl;

import java.util.List;
import java.util.Scanner;

public class CarlosBakery implements IView {

    private double profit;
    private double expenses;

    public void welcome(List<String> list) {
        System.out.println("---------------------------");
        System.out.println("Welcome to Carlo's CarlosBakery!");
        System.out.println("---------------------------");
        System.out.println("We offer following pastries:");
        pastries(list);
        System.out.println("---------------------------");
        System.out.println("How many pastries have we sold this week? ");
    }

    private void pastries(List<String> pastriesList) {
        for(String pastry: pastriesList) {
            System.out.println(pastry);
        }
    }

    public int getInput() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    @Override
    public void amountSoldBeverages() {
        System.out.println("---------------------------");
        System.out.println("How many beverages have we sold this week?");
        System.out.println("---------------------------");
    }

    @Override
    public void showProfit(int pastryProfit, double beverageProfit) {
        System.out.println("The amount of profit from these pastries: " + pastryProfit +" and the amount of profit from beverages is: " + beverageProfit);
        this.profit = (pastryProfit + beverageProfit);
    }



    @Override
    public void showExpenses(double expenses) {
        this.expenses = expenses;
        System.out.println("The amount of fees these week including salary is: " + expenses);
    }

    @Override
    public void showTotal() {
        System.out.println("Total result this week is following: " + (profit - expenses)  + " kr");
    }

    @Override
    public void notEnoughTime() {
        System.out.println("The amount of time it takes to bake the pastries is exceeding amount of working hours");
    }
}

