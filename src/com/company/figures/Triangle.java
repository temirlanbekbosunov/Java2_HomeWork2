package com.company.figures;

import com.company.Drawable;
import com.company.figures.Figure;

public class Triangle extends Figure implements Drawable {

    private double sideA, sideB, sideC;


    public Triangle(double sideA, double sideB, double sideC) {
        super("треугольник");
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculatePerimeter() {
        return sideA+sideB+sideC;
    }

    @Override
    public String draw() {
        return"\ud83d\udd3a" ;
    }
}
