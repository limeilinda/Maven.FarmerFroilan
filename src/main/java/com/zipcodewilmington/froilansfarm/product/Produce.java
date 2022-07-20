package com.zipcodewilmington.froilansfarm.product;

import com.zipcodewilmington.froilansfarm.product.edible.Edible;

public abstract class Produce<T extends Edible> {
    T yield;
    boolean hasBeenFertilized;
}
