package com.lab111.lab3;

/**
 * Line extends class Shape
 *
 * @author Volex
 */
public class Line extends Shape {


    Line(int x, int y, int height, int width) {
        super(x, y, height, width);
    }

    @Override
    public void show() {
        System.out.println("Line, x = " + x + " y = " + y);


    }
}
