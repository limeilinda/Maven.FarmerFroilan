package com.zipcodewilmington.froilansfarm.product;

import com.zipcodewilmington.froilansfarm.product.edible.CarrotRoot;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestCarrotPlant {

    @Test
    public void testConstructor() {
        CarrotRoot carrot = new CarrotRoot();

        CarrotPlant plant = new CarrotPlant();
        plant.setFertilized(true);
        plant.growYield(carrot);

        CarrotRoot actualCarrot = plant.harvestYield();

        Assert.assertEquals(carrot, actualCarrot);
    }
}