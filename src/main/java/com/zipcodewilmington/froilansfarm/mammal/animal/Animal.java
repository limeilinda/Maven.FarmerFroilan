package com.zipcodewilmington.froilansfarm.mammal.animal;

import com.zipcodewilmington.froilansfarm.NoiseMaker;
import com.zipcodewilmington.froilansfarm.mammal.Eater;
import com.zipcodewilmington.froilansfarm.product.edible.Edible;

import java.util.List;

public abstract class Animal implements NoiseMaker, Eater {
    List<? extends Edible> foodEaten;
}
