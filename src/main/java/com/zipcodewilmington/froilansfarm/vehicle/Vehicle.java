package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.product.Crop;
import com.zipcodewilmington.froilansfarm.product.CropRow;
import com.zipcodewilmington.froilansfarm.product.edible.Edible;
import com.zipcodewilmington.froilansfarm.structure.Field;

public abstract class Vehicle implements NoiseMaker, Rideable {

    CropRow row = new CropRow();


    public void harvest(Crop crop) {
        crop.setHasBeenHarvested(true);
    }

    public <T extends Crop<? extends Edible>> void fertilize(CropRow<T> row){
        for(Crop c: row.getCrops()){
            c.setFertilized(true);
        }
    }
    public void fly(Field field) {
//        for(CropRow r: field.getCropRow()) {
//            this.fertilize(r);
//        }
    }
}
