package com.zipcodewilmington.froilansfarm.product;

import com.zipcodewilmington.froilansfarm.product.edible.Edible;

public interface Produce<T extends Edible> {
    boolean hasBeenFertilized();
    T harvestYield();
}
