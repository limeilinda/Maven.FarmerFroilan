package com.zipcodewilmington.froilansfarm.mammal;

import com.zipcodewilmington.froilansfarm.product.Crop;
import com.zipcodewilmington.froilansfarm.product.CropRow;
import com.zipcodewilmington.froilansfarm.product.edible.Edible;

public interface Eater {
    <T extends Edible> void eat(T edible);
    Boolean hasEaten(Edible edible);
}
