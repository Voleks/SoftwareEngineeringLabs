package com.lab111.lab8;

/**
 * @author Volex
 * @version 8.0
 *          Class Figure
 *          implements interface Copyable
 *          has a constructor,
 *          Override methods copy and toString
 */
public class Figure implements Copyable {
    String name;
    double volume;
    int colorDepth;

    public Figure(String name, double volume, int colorDepth) {
        this.name = name;
        this.volume = volume;
        this.colorDepth = colorDepth;
    }

    @Override
    public String toString() {
        return "Figure[name = " + name + ", volume = " + volume + ", colorDepth = " + colorDepth + "]";
    }

    @Override
    public Object copy() {
        Figure copy = new Figure(name, volume, colorDepth);
        System.out.println("making a copy...");
        return copy;
    }
}
