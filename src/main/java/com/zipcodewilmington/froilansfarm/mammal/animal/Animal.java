package com.zipcodewilmington.froilansfarm.mammal.animal;

import com.zipcodewilmington.froilansfarm.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.mammal.Eater;
import com.zipcodewilmington.froilansfarm.product.edible.Edible;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal implements NoiseMaker, Eater {
    List<Edible> foodEaten;
    List<Rideable> rideableList;

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

    public void mount(Rideable rideable) {
        rideableList.add(rideable);
    }

    public void dismount(Rideable rideable) {
        rideableList.remove(rideable);
    }

    public Boolean riddenStatus(Rideable rideable) {
        if (rideableList.contains(rideable)) {
            return true;
        }
        return null;
    }



}
