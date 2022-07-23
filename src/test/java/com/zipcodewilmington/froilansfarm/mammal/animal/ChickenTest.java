package com.zipcodewilmington.froilansfarm.mammal.animal;

import com.zipcodewilmington.froilansfarm.product.Produce;
import com.zipcodewilmington.froilansfarm.product.edible.EarCorn;
import com.zipcodewilmington.froilansfarm.product.edible.Edible;
import com.zipcodewilmington.froilansfarm.product.edible.Egg;
import com.zipcodewilmington.froilansfarm.product.edible.Tomato;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ChickenTest {
    Chicken chicken = new Chicken();
    Tomato tomato = new Tomato();
    EarCorn corn = new EarCorn();
    Egg egg = new Egg();

    @org.junit.jupiter.api.Test
    public void makeNoiseTest(){
    String expected = "bak bak";
    Assert.assertEquals(expected, chicken.makeNoise());
}
    @org.junit.jupiter.api.Test
    public void testImplementation() {
        Assert.assertTrue(chicken instanceof Produce);
    }

    @org.junit.jupiter.api.Test
    public void testInheritance() {
        Assert.assertTrue(chicken instanceof Animal);
    }

    @org.junit.jupiter.api.Test
    public void testYield(){
        chicken.hasBeenFertilized=false;
        Egg actual= chicken.harvestYield();
        Assert.assertTrue(actual instanceof Egg);
    }
    @org.junit.jupiter.api.Test
    public void testFailYield(){
        chicken.hasBeenFertilized=true;
        Egg actual= chicken.harvestYield();
        Assert.assertFalse(actual instanceof Egg);
    }
    @org.junit.jupiter.api.Test

    public void testHasEaten(){
        List<Edible> eaten;
        chicken.eat(tomato); //chicken ate tomato, now in arraylist position 0
        chicken.eat(corn); // ^^ same thing

        boolean actual =chicken.hasEaten(tomato);
        boolean actual1 = chicken.hasEaten(corn);
        boolean actual2 = chicken.hasEaten(corn);

        boolean expected = chicken.foodEaten.contains(tomato);
        boolean expected1 = chicken.foodEaten.contains(corn);
        boolean expected2 = chicken.foodEaten.contains(egg);

        Assert.assertEquals(actual,expected);
        Assert.assertEquals(actual1,expected1);
        Assert.assertFalse(String.valueOf(actual2),expected2); //if Asserttrue. it fails as it should! cause chicken didnt eat egg!
    }
}