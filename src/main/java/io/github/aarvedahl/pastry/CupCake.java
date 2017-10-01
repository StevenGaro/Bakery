package io.github.aarvedahl.pastry;

public class CupCake extends Pastry {
    public CupCake() {
        super(new CupCakeRecipe());
        this.minutesToMake = 5;
        this.priceToCustomer = 14;
        this.name = "CupCake";
    }
}
