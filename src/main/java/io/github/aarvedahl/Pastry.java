package io.github.aarvedahl;

import java.util.List;

public abstract class Pastry {

    IRecipe recipe;
    protected int minutesToMake;
    protected int priceToCustomer;
    protected String name;

    public Pastry(IRecipe recipe) {
        this.recipe =  recipe;
    }

    public List<Ingredient> getRecipe() {
        return this.recipe.getRecipe();
    }
}
