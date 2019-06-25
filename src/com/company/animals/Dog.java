package com.company.animals;

import com.company.Drawable;

public class Dog extends Animal implements Drawable, SoundProducable {
    public Dog() {
        super("Собака");
    }

    @Override
    public String draw() {
        return "\ud83d\udc29";
    }

    @Override
    public String callSound() {
        return "ГАВ-ГАВ";
    }
}
