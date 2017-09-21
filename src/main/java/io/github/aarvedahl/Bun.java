package io.github.aarvedahl;

public class Bun extends Pastry {

    public Bun() {
        super(new BunRecipe());
        this.minutesToMake = 3;
        this.priceToCustomer = 12;
        this.name = "Bun";
    }
}
