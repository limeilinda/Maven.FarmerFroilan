package com.zipcodewilmington.froilansfarm.mammal;

import com.zipcodewilmington.froilansfarm.product.edible.EarCorn;
import com.zipcodewilmington.froilansfarm.product.edible.Tomato;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Farmer farmer = new Farmer();
    Tomato tomato = new Tomato();

    EarCorn earCorn = new EarCorn();

    @Test
    void testConstructor(){
        String expected = "NickCHoi";
        farmer.setName(expected);
        Assert.assertEquals(expected,farmer.getName());
    }

    @Test
    void setName() {
        farmer.setName("Nick");
        Assert.assertEquals("Nick", farmer.getName());

    }

    @Test
    void getName() {
        farmer.setName("NickChoi");
        Assert.assertEquals("NickChoi", farmer.getName());
    }

    @Test
    void makeNoise() {
        String actual = farmer.makeNoise();
        String expected = "Hello!";
        Assert.assertEquals(expected,actual);
    }

    @Test
    void eat() {
        farmer.eat(tomato);
        Assert.assertTrue(farmer.hasEaten(tomato));
    }

    @Test
    void eat1() {
        farmer.eat(earCorn);
        Assert.assertNull(farmer.hasEaten(tomato));
    }

    @Test
    void hasEaten() {
        farmer.eat(earCorn);
        Assert.assertNull(farmer.hasEaten(tomato));

    }
}