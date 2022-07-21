package com.zipcodewilmington.froilansfarm.product;

import com.zipcodewilmington.froilansfarm.product.edible.CarrotRoot;

public class CarrotPlant extends Crop<CarrotRoot> {

    public CarrotPlant() {
        super(new CarrotRoot());
    }

    public CarrotPlant(boolean isHarvested, boolean fertilized, CarrotRoot yield) {
        super(isHarvested, fertilized, yield);
    }
}
