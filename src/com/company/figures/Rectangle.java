package com.company.figures;

import com.company.Drawable;
import com.company.figures.Figure;

public class Rectangle extends Figure implements Drawable {

    private double sideA;
    private double sideB;


    public Rectangle(double sideA, double sideB) {
        super("Прямоугольник");
        this.sideA = sideA;
        this.sideB = sideB;
    }



    @Override
    public double calculatePerimeter() {
        return 2*(sideA+sideB);
    }

    @Override
    public String draw() {
        char c = '\u2B1B';
        return new String().valueOf(c) + new String().valueOf(c);
    }
}
