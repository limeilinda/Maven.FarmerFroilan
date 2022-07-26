package com.zipcodewilmington.froilansfarm.structure;

import com.zipcodewilmington.froilansfarm.mammal.Person;
import com.zipcodewilmington.froilansfarm.mammal.animal.Chicken;
import com.zipcodewilmington.froilansfarm.product.edible.Edible;

import java.util.ArrayList;
import java.util.Optional;

public class FoodBox<T extends Edible> extends Shelter<T> {
    public FoodBox() {
        super.items = new ArrayList<T>();
    }


    public T getUneatenFoodItem() {
       Optional<T> food = items.stream().filter(x -> !x.isEaten()).findFirst();
        return food.orElse(null);
    }
}
