package com.zipcodewilmington.froilansfarm.mammal.animal;

import com.zipcodewilmington.froilansfarm.mammal.Eater;
import com.zipcodewilmington.froilansfarm.product.Crop;
import com.zipcodewilmington.froilansfarm.product.Produce;
import com.zipcodewilmington.froilansfarm.product.edible.Edible;
import com.zipcodewilmington.froilansfarm.product.edible.Egg;

public class Chicken extends Animal implements Produce<Egg>{
    Egg egg = new Egg();
    Boolean hasBeenFertilized;

    public Chicken(){
        super();
    }

    @Override
    public String makeNoise() {
        return "bak bak";
    }

    public Egg harvestYield() {
        if(!hasBeenFertilized==true) {
            return egg;
        }
        return null;
    }

    public boolean hasBeenFertilized() {
        return false;
    }


}
