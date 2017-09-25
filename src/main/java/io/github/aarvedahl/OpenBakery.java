package io.github.aarvedahl;

public class OpenBakery {

    public static void main(String[] args) {
        CarlosBakeryController carlosBakeryController = new CarlosBakeryController();
        CarlosBakery carlosBakery = new CarlosBakery();
        carlosBakeryController.weeklyResults(carlosBakery);
    }
}

