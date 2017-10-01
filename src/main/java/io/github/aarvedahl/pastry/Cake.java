package io.github.aarvedahl.pastry;

public class Cake extends Pastry {
    public Cake() {
        super(new CakeRecipe());
        this.minutesToMake = 10;
        this.priceToCustomer = 35;
        this.name = "Cake";
    }
}
