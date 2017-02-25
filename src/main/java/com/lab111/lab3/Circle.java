package com.lab111.lab3;

/**
 * Circle extends class Shape
 *
 * @author Volex
 */
public class Circle extends Shape {


    Circle(int x, int y, int height, int width) {
        super(x, y, height, width);
    }

    @Override
    public void show() {
        System.out.println("Circle, x = " + x + " y = " + y);
    }
}
