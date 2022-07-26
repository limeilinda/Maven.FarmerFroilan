package com.zipcodewilmington.froilansfarm.structure;

import com.zipcodewilmington.froilansfarm.product.edible.Tomato;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FoodBoxTest {
    @Test
    void getUneatenFoodItem() {
        FoodBox<Tomato> tomatoBox = new FoodBox<>();
        Tomato tomato1 = new Tomato();
        Tomato tomato2 = new Tomato();
        Tomato tomato3 = new Tomato();
        tomato1.setIsEaten(false);
        tomato2.setIsEaten(true);
        tomato3.setIsEaten(true);
        tomatoBox.add(tomato1);
        tomatoBox.add(tomato2);
        tomatoBox.add(tomato3);

        Tomato actualTomato = tomatoBox.getUneatenFoodItem();

        Assertions.assertFalse(actualTomato.isEaten());
    }
}