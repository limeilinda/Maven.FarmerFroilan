package com.zipcodewilmington.froilansfarm.mammal.animal;

import com.zipcodewilmington.froilansfarm.Rideable;
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
    void makeNoise() {
        String actual = horse.makeNoise();
        String expected = "NEIGH!!!";

        Assert.assertEquals(actual,expected);
    }


}