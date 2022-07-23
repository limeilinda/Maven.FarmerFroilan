package com.zipcodewilmington.froilansfarm.mammal.animal;

import com.zipcodewilmington.froilansfarm.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.mammal.Eater;
import com.zipcodewilmington.froilansfarm.product.edible.Edible;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal implements NoiseMaker, Eater {
    List<Edible> foodEaten;

    public Animal(){
        foodEaten = new ArrayList<>();
    }

    public <T extends Edible> void eat(T edible) {
        foodEaten.add(edible);
    }

    public Boolean hasEaten(Edible edible) {
        if(foodEaten.contains(edible)){
            return true;
        }
        return null;
    }

    public String makeNoise(){
        return "";
    }

}
