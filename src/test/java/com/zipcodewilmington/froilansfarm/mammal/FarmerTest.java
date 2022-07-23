package com.zipcodewilmington.froilansfarm.mammal;

import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.product.*;
import com.zipcodewilmington.froilansfarm.product.edible.CarrotRoot;
import com.zipcodewilmington.froilansfarm.product.edible.EarCorn;
import com.zipcodewilmington.froilansfarm.product.edible.Tomato;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FarmerTest {
    Farmer farmer=new Farmer();
    TomatoPlant tomatoCrop;
    CornStalk cornCrop;
    CarrotPlant carrotRootCrop;
    CropRow<CarrotPlant> carrotRow = new CropRow<>();
    CropRow<CornStalk> cornRow = new CropRow<>();
    CropRow<TomatoPlant> tomatoRow = new CropRow<>();

    @Test
    public void testImplementation(){
        Assert.assertTrue(farmer instanceof Person);
    }

    @Test
    public void testInheritanceBotanist(){
        Assert.assertTrue(farmer instanceof Botanist);
    }
    @Test
    public void testInheritanceRideable(){
        Assert.assertTrue(farmer instanceof Rider);
    }

    @Test
    void plantTomatoCrops() {
        farmer.plantCrops(tomatoCrop, tomatoRow);
        TomatoPlant expected = tomatoRow.get(0);
        Assert.assertEquals(tomatoCrop, expected);
    }
    @Test
    void plantCornCrops() {
        farmer.plantCrops(tomatoCrop, tomatoRow);
        farmer.plantCrops(cornCrop, cornRow);
        farmer.plantCrops(cornCrop, cornRow);
        CornStalk expected = cornRow.get(1);
        Assert.assertEquals(cornCrop, expected);
    }
    @Test
    void plantCarrotCrops() {
        farmer.plantCrops(carrotRootCrop, carrotRow);
        farmer.plantCrops(carrotRootCrop, carrotRow);
        farmer.plantCrops(carrotRootCrop, carrotRow);
        int actual = carrotRow.size();
        int expected = 3;
        Assert.assertEquals(expected, actual);
    }


}