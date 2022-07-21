package com.zipcodewilmington.froilansfarm.product;

import com.zipcodewilmington.froilansfarm.product.edible.CarrotRoot;
import com.zipcodewilmington.froilansfarm.product.edible.EarCorn;
import com.zipcodewilmington.froilansfarm.product.edible.Tomato;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CropTest {
    Crop<Tomato> tomatoCrop;
    Crop<EarCorn> cornCrop;
    Crop<CarrotRoot> carrotRootCrop;

    @BeforeEach
    public void init() {
        tomatoCrop = new TomatoPlant();
        cornCrop = new CornStalk();
    }

    @Test
    void testConstructor() {
        carrotRootCrop = new CarrotPlant(false, true, new CarrotRoot());
        Boolean actual = carrotRootCrop.isHarvested();
        Assert.assertFalse(actual);

    }

    @Test
    void testImplementation() {
        Boolean expected = true;
        Boolean actual = (tomatoCrop instanceof Produce);
        Assert.assertEquals(expected, actual);
    }

    @Test
    void testGetYield() {
        Tomato expectedTomato = new Tomato();
        tomatoCrop.setFertilized(true);
        tomatoCrop.growYield(expectedTomato);

        Tomato actualTomato = tomatoCrop.harvestYield();

        Assert.assertTrue(expectedTomato.equals(actualTomato));
    }

    @Test
    void testHarvestYieldIsNullWhenNotFertilized() {
        Tomato expectedTomato = null;

        Tomato actualTomato = tomatoCrop.harvestYield();

        Assert.assertEquals(expectedTomato, actualTomato);
    }

    @Test
    void testGrowYield() {
        EarCorn expectedEarCorn = new EarCorn();
        cornCrop.setFertilized(true);
        cornCrop.setHasBeenHarvested(false);
        cornCrop.growYield(expectedEarCorn);

        EarCorn actualCorn = cornCrop.harvestYield();

        Assert.assertEquals(expectedEarCorn, actualCorn);

    }

    @Test
    void testIsHarvested() {
        tomatoCrop.setHasBeenHarvested(false);

        Assert.assertFalse(tomatoCrop.isHarvested());
    }


    @Test
    void testHasBeenFertilized() {
        tomatoCrop.setFertilized(true);

        Boolean expected = true;

        Boolean actual = tomatoCrop.hasBeenFertilized();

        Assert.assertEquals(expected, actual);
    }

}