package io.github.aarvedahl.pastry;

import java.util.ArrayList;
import java.util.List;

public class BunRecipe implements IRecipe {

    @Override
    public List<Ingredient> getRecipe() {
        List<Ingredient> ingredients = new ArrayList<>();
        Ingredient sugar = new Sugar(0.06);
        ingredients.add(sugar);
        Ingredient milk = new Milk(0.1);
        ingredients.add(milk);
        Ingredient flour = new Flour(0.12);
        ingredients.add(flour);
        return ingredients;
    }
}
