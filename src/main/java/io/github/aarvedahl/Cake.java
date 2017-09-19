package io.github.aarvedahl;

public class Cake extends Pastry {
    public Cake(int minutesToMake, int commodiesPrice, int priceToCustomer) {
        this.minutesToMake = minutesToMake;
        this.commodiesPrice = commodiesPrice;
        this.priceToCustomer = priceToCustomer;
        this.name = "Cake";
    }
}
