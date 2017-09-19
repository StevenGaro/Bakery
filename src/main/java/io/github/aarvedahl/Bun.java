package io.github.aarvedahl;

public class Bun extends Pastry {

    public Bun(int minutesToMake, int commodiesPrice, int priceToCustomer) {
        super();
        this.minutesToMake = minutesToMake;
        this.commodiesPrice = commodiesPrice;
        this.priceToCustomer = priceToCustomer;
        this.name = "Bun";
    }
}
