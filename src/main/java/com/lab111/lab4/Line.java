package com.lab111.lab4;

/**
 * Class Line which implements interface IShape
 *
 * @author Volex
 *         version 4.0
 */
public class Line implements IShape {
    @Override
    public void draw(int x, int y) {
        System.out.println("(" + x + ", " + y + ") :draw a line");
    }
}
