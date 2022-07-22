package com.zipcodewilmington.froilansfarm.mammal;

import com.zipcodewilmington.froilansfarm.product.Crop;
import com.zipcodewilmington.froilansfarm.product.CropRow;
import com.zipcodewilmington.froilansfarm.product.edible.Edible;
import com.zipcodewilmington.froilansfarm.vehicle.Aircraft;

public interface Pilot<T extends Aircraft> {
    <T extends Aircraft> void fly(T aircraft);
}
