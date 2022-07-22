package com.zipcodewilmington.froilansfarm.mammal;

import com.zipcodewilmington.froilansfarm.product.Crop;
import com.zipcodewilmington.froilansfarm.product.CropRow;
import com.zipcodewilmington.froilansfarm.product.edible.Edible;

public interface Botanist {
    <T extends Crop<? extends Edible>> void plantCrops(T crop, CropRow<T> row);

}
