package io.github.aarvedahl;

import io.github.aarvedahl.controller.CarlosBakeryController;
import io.github.aarvedahl.view.CarlosBakery;

public class OpenBakery {

    public static void main(String[] args) {
        CarlosBakeryController carlosBakeryController = new CarlosBakeryController();
        CarlosBakery carlosBakery = new CarlosBakery();
        carlosBakeryController.weeklyResults(carlosBakery);
    }
}

