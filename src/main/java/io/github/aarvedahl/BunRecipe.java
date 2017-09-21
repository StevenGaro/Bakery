package io.github.aarvedahl;

import java.util.ArrayList;
import java.util.List;

public class BunRecipe implements Recipe{

    @Override
    public List<Ingredient> getRecipe() {
        List<Ingredient> ingredientList = new ArrayList<>();
        Ingredient sugar = new Sugar(0.06);
        ingredientList.add(sugar);
        Ingredient milk = new Milk(0.1);
        ingredientList.add(milk);
        Ingredient flour = new Flour(0.12);
        ingredientList.add(flour);
        return ingredientList;
    }
}
