package io.github.aarvedahl;

public class OpenBakery {

    public static void main(String[] args) {
        BakeryController bakeryController = new BakeryController();
        Bakery bakery = new Bakery();
        bakeryController.weeklyResults(bakery);
    }
}

