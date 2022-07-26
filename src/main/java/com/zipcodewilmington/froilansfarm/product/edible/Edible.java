package com.zipcodewilmington.froilansfarm.product.edible;

public abstract class Edible {
    boolean isEaten;

    public Edible() {
        isEaten = false;
    }
    public boolean isEaten() {
        return isEaten;
    }

    public void setIsEaten(boolean isEaten) {
        this.isEaten = isEaten;
    }

}
