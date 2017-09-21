package io.github.aarvedahl;

public class Cake extends Pastry {
    public Cake() {
        super(new CakeRecipe());
        this.minutesToMake = 10;
        this.commodiesPrice = 12;
        this.priceToCustomer = 35;
        this.name = "Cake";
    }
}
