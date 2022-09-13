package com.zipcodewilmington.froilansfarm.mammal.animal;

import com.zipcodewilmington.froilansfarm.product.edible.EarCorn;
import com.zipcodewilmington.froilansfarm.product.edible.Edible;
import com.zipcodewilmington.froilansfarm.product.edible.Tomato;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    @Test
    public void testAnimal() {
        Chicken chicken = new Chicken();
        Tomato tomato = new Tomato();
        chicken.eat(tomato);

        Boolean expected = true;
        Boolean actual = chicken.hasEaten(tomato);

        Assert.assertEquals(expected, actual);


    }

}