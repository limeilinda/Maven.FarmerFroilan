package com.zipcodewilmington.froilansfarm.mammal.animal;

import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.mammal.Eater;
import com.zipcodewilmington.froilansfarm.mammal.Person;
import com.zipcodewilmington.froilansfarm.mammal.Rider;
import com.zipcodewilmington.froilansfarm.product.Crop;
import com.zipcodewilmington.froilansfarm.product.edible.EarCorn;
import com.zipcodewilmington.froilansfarm.product.edible.Edible;

import java.util.List;

public class Horse extends Animal implements Rideable {

    Rider rider;

    public Horse() {
        super();
    }
    @Override
    public String makeNoise() {
        return "NEIGH!!!";
    }


}
