package io.github.aarvedahl;

import java.util.List;
import java.util.Scanner;

public class Bakery implements View{

    private int profit;
    private double expenses;

    public void welcome(List<String> list) {
        System.out.println("---------------------------");
        System.out.println("Welcome to Carlo's Bakery!");
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
    public void showProfit(int profit) {
        this.profit = profit;
        System.out.println("The amount of profit from these pastries: " + profit);
    }


    @Override
    public void showFee(double expenses) {
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

