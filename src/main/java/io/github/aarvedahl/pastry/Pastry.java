package io.github.aarvedahl.pastry;

import java.util.List;

public abstract class Pastry {

    IRecipe recipe;
    public int minutesToMake;
    public int priceToCustomer;
    public String name;

    public Pastry(IRecipe recipe) {
        this.recipe =  recipe;
    }

    public List<Ingredient> getRecipe() {
        return this.recipe.getRecipe();
    }
}
