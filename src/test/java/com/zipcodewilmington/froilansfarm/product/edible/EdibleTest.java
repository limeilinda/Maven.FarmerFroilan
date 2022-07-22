package com.zipcodewilmington.froilansfarm.product.edible;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EdibleTest {

    Egg egg;

    @BeforeEach
        void init() {
            egg = new Egg();
        }
    @Test
    void isEaten() {
        Boolean expected = false;

        Boolean actual = egg.isEaten();

        Assert.assertEquals(expected, actual);
    }

    @Test
    void setIsEaten() {
        Boolean expected = true;
        egg.setIsEaten(true);

        Boolean actual = egg.isEaten();

        Assert.assertEquals(expected, actual);
    }
}