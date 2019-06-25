package com.company.figures;

import com.company.Drawable;
import com.company.figures.Figure;

public class Circle extends Figure implements Drawable {

    private double radius;
    private final double PI=3.14;

    public Circle(double radius) {
        super("круг");
        this.radius= radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2*PI*radius;
    }

    @Override
    public String draw() {
        return "\u26AB";
    }
}
