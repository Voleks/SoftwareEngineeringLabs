package com.lab111.lab4;

import java.util.Random;

/**
 * Class Square which implements interface IShape
 *
 * @author Volex
 *         version 4.0
 */
public class Square implements IShape {
    Random random = new Random();
    /**
     * @param a stands for side of the square
     * which is randomly generated
     */
    int a = random.nextInt(100);

    @Override
    public void draw(int x, int y) {
        System.out.println("(" + x + ", " + y + ") :draw a square with side = " + a);
    }
}
