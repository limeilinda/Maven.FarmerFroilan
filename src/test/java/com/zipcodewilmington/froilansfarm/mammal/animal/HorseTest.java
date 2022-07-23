package com.zipcodewilmington.froilansfarm.mammal.animal;

import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.mammal.Farmer;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HorseTest {
    Horse horse =new Horse();
    @Test
    public void testImplementation(){
        Assert.assertTrue(horse instanceof Animal);
    }

    @Test
    public void testInheritance(){
        Assert.assertTrue(horse instanceof Rideable);
    }

    @Test
    public void testMakeNoise() {
        String actual = horse.makeNoise();
        String expected = "NEIGH!!!";

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testRidingStatusMounted(){
        Farmer farmer = new Farmer();
        farmer.mount(horse);
        boolean actual = farmer.riderStatus();
        Assert.assertTrue(actual);
    }
    @Test
    public void testRidingStatusDismounted(){
        Farmer farmer = new Farmer();
        farmer.dismount(horse);
        boolean actual = farmer.riderStatus();
        Assert.assertFalse(actual);
    }
    
}