package io.github.aarvedahl;

import java.util.ArrayList;
import java.util.List;

public class CakeRecipe implements IRecipe {
    @Override
    public List<Ingredient> getRecipe() {
        List<Ingredient> ingredients = new ArrayList<>();
        Ingredient milk = new Milk(0.5);
        ingredients.add(milk);
        Ingredient sugar = new Sugar(0.3);
        ingredients.add(sugar);
        Ingredient flour = new Flour(0.4);
        ingredients.add(flour);
        return ingredients;
    }
}
