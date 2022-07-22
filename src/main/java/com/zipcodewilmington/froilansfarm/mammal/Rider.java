package com.zipcodewilmington.froilansfarm.mammal;

import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.mammal.animal.Animal;
import com.zipcodewilmington.froilansfarm.product.Crop;
import com.zipcodewilmington.froilansfarm.product.CropRow;
import com.zipcodewilmington.froilansfarm.product.edible.Edible;
import com.zipcodewilmington.froilansfarm.vehicle.Vehicle;

public interface Rider {

    <T extends Rideable> void mount(T Rideable);

    <T extends Rideable> void dismount(T Rideable);

    Boolean riderStatus();
}
