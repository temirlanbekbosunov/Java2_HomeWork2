package com.company;

import com.company.animals.Animal;
import com.company.animals.Dog;
import com.company.figures.*;

public class Main {

    public static void main(String[] args) {

        Figure[] figures = new Figure[5];
        figures[0] = new Circle(3.0);
        figures[1] = new Rectangle(3.0, 4.0);
        figures[2] = new Square(5);
        figures[3] = new Triangle(4, 5, 3);
        figures[4] = new Rectangle(2, 5);

        for (int i = 0; i < figures.length; i++) {
            System.out.println(i + " ("
                    + figures[i].getName() + ((Drawable) figures[i]).draw() + ") Периметр фигуры = "
                    + figures[i].calculatePerimeter());
        }

        Animal dog = new Dog();
        System.out.println(dog.getName() + ((Dog) dog).draw()
                + " Издает звук = " + ((Dog) dog).callSound());
    }

}

