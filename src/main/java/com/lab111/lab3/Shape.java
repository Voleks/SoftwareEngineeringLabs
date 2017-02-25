package com.lab111.lab3;

/**
 * Shape realize interface IGraphics
 *
 * @author Volex
 */
public abstract class Shape implements IGraphics {
    protected int x;
    protected int y;

    protected int height;
    protected int width;

    Shape(int x, int y, int height, int width) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    @Override
    public void show() {

    }
}
