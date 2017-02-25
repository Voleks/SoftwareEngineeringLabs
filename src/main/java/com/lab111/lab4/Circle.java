package com.lab111.lab4;

import java.util.Random;

/**
 * Class Circle which implements interface IShape
 *
 * @author Volex
 *         version 4.0
 */
public class Circle implements IShape {
    /**
     * @param r stands for radius of circle
     * which is randomly generated
     */
    Random random = new Random();
    int r = random.nextInt(100);

    @Override
    public void draw(int x, int y) {
        System.out.println("(" + x + ", " + y + ") :draw a circle with radius = " + r);
    }
}
