package com.zipcodewilmington.froilansfarm.product.edible;

public abstract class Edible {
    boolean isEaten;

    public Edible() {
        isEaten = false;
    }
    boolean isEaten() {
        return isEaten;
    }

    void setIsEaten(boolean isEaten) {
        this.isEaten = isEaten;
    }

}
