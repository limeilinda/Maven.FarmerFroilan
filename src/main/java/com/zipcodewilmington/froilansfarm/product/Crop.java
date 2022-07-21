package com.zipcodewilmington.froilansfarm.product;

import com.zipcodewilmington.froilansfarm.product.edible.Edible;

public abstract class Crop<T extends Edible> implements Produce<T> {
    boolean hasBeenHarvested;
    boolean isFertilized;
    T yield;

    public Crop(boolean isHarvested, boolean fertilized, T yield) {
        this.hasBeenHarvested = isHarvested;
        this.isFertilized = fertilized;
        this.yield = yield;
    }

    public Crop(T yield) {
        hasBeenHarvested = false;
        isFertilized = false;
        this.yield = yield;
    }
    public T harvestYield() {
        if (!hasBeenHarvested && isFertilized) {
            T tmp = yield;
            yield = null;
            this.hasBeenHarvested = true;
            this.isFertilized = false;
            return tmp;
        }
        return null;
    }

    public void growYield(T crop) {
        if (!hasBeenHarvested && isFertilized) {
            yield =  crop;
        }
    }
    public boolean isHarvested() {
        return hasBeenHarvested;
    }

    public void setHasBeenHarvested(boolean hasBeenHarvested) {
        this.hasBeenHarvested = hasBeenHarvested;
    }

    public boolean hasBeenFertilized() {
        return isFertilized;
    }

    public void setFertilized(boolean fertilized) {
        isFertilized = fertilized;
    }
}
