package com.company.figures;

import com.company.Drawable;
import com.company.figures.Figure;

public class Square extends Figure implements Drawable {


    private double sideA;

    public Square(double sideA) {
        super("квадрат");
        this.sideA= sideA;
    }

    @Override
    public double calculatePerimeter() {
        return sideA*4;
    }

    @Override
    public String draw() {
        return "\u2B1B";
    }
}
