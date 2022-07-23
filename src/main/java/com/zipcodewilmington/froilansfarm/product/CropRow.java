package com.zipcodewilmington.froilansfarm.product;

import com.zipcodewilmington.froilansfarm.product.edible.Edible;

import java.util.ArrayList;
import java.util.List;

public class CropRow <T extends Crop<? extends Edible>> {
    List<T> crops;
    public CropRow() {
        crops = new ArrayList<>();
    }

    public CropRow(List<T> crops) {
        this.crops = crops;
    }

    public List<T> getCrops() {
        return crops;
    }

    public void add(T crop) {
        crops.add(crop);
    }

    public void setCrops(List<T> crops) {
        this.crops = crops;
    }

    public int size() {
        return crops.size();
    }

    public T get(T crop) {
        if (crops.contains(crop)) {
            return crop;
        }
        return null;
    }
    public T get(int index) {
        return crops.get(index);
    }


}
