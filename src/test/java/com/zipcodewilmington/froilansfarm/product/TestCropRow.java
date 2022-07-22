package com.zipcodewilmington.froilansfarm.product;

import com.zipcodewilmington.froilansfarm.product.edible.CarrotRoot;
import com.zipcodewilmington.froilansfarm.product.edible.Tomato;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TestCropRow {
    CropRow<TomatoPlant> tomatoRow;
    CropRow<CornStalk> cornRow;

    @BeforeEach
    void init() {
        tomatoRow = new CropRow<>();
        cornRow = new CropRow<>();
    }

    @Test
    void testConstructor() {
        CropRow<CarrotPlant> carrotRow = new CropRow<>();
        CarrotPlant carrotPLant = new CarrotPlant();
        CropRow<TomatoPlant> newTomatoRow = new CropRow<>(new ArrayList<>(Arrays.asList(new TomatoPlant(), new TomatoPlant(),
                new TomatoPlant())));
        Assert.assertEquals(3, newTomatoRow.size());

        carrotRow.getCrops();

        carrotRow.add(carrotPLant);

        Integer expectedSize = 1;

        Integer actualSize = carrotRow.size();

        Assert.assertEquals(expectedSize, actualSize);

    }

    @Test
    void setCrops() {
        List<TomatoPlant> cropTomato = new ArrayList<>(Arrays.asList(new TomatoPlant(), new TomatoPlant(),
                new TomatoPlant()));
        tomatoRow.setCrops(cropTomato);
        Integer expectedSize = 3;

        Integer actualSize = cropTomato.size();

        Assert.assertEquals(expectedSize, actualSize);

    }

    @Test
    void testAddGetCrop() {
        TomatoPlant expectedPlant = new TomatoPlant();
        tomatoRow.add(expectedPlant);

        TomatoPlant actual = tomatoRow.get(expectedPlant);

        Assert.assertEquals(expectedPlant, actual);

    }

    @Test
    void testGetCropInt() {
        TomatoPlant expectedPlant = new TomatoPlant();
        tomatoRow.add(expectedPlant);

        TomatoPlant actual = tomatoRow.get(0);

        Assert.assertEquals(expectedPlant, actual);
    }

    @Test
    void testGetCropNull() {
        TomatoPlant plant = new TomatoPlant();

        TomatoPlant expected = null;

        TomatoPlant actual = tomatoRow.get(plant);

        Assert.assertEquals(expected, actual);
    }

}