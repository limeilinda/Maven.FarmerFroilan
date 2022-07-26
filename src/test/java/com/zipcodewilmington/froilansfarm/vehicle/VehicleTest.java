package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.mammal.Botanist;
import com.zipcodewilmington.froilansfarm.mammal.Person;
import com.zipcodewilmington.froilansfarm.product.Crop;
import com.zipcodewilmington.froilansfarm.product.CropRow;
import com.zipcodewilmington.froilansfarm.product.TomatoPlant;
import com.zipcodewilmington.froilansfarm.product.edible.EarCorn;
import com.zipcodewilmington.froilansfarm.product.edible.Tomato;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    Tractor tractor = new Tractor();
    CropDuster cropDuster = new CropDuster();
    CropRow row = new CropRow();
    Vehicle Tractor = new Tractor();


    Crop<Tomato> tomatoCrop =new TomatoPlant();



    @Test
    public void testInheritanceNoiseMaker(){
        Assert.assertTrue(Tractor instanceof NoiseMaker);
    }

    @Test
    public void testInheritanceRideable(){
        assertTrue(Tractor instanceof Rideable);
    }

    @Test
    public void harvest() {
    tractor.harvest(tomatoCrop);
    Assert.assertTrue(tomatoCrop.isHarvested());
    }


    @Test
    void fertilize() {

    }

    @Test
    void fly() {

    }
}