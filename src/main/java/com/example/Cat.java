package com.example;

public class Cat {

    Predator predator;

    public Cat(Feline feline) {
        this.predator = feline;
    }

    public String getSound() {
        return "Мяу";
    }

    public String getFood() throws Exception {
        return String.join(", ", predator.eatMeat());
    }

}
