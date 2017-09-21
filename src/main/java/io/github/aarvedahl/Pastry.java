package io.github.aarvedahl;

import java.util.List;

public abstract class Pastry {

    Recipe recipe;
    protected int minutesToMake;
    protected int priceToCustomer;
    protected String name;

    public Pastry(Recipe recipe) {
        this.recipe =  recipe;
    }

    public List<Ingredient> getRecipe() {
        return this.recipe.getRecipe();
    }
}
