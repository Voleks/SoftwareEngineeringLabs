package com.lab111.lab7;

/**
 * @author Nata
 * @version 7.0
 *          public class Figure
 *          it contains all fields
 *          set method, load method, save method
 *          and @override method toString
 *          can create Save class
 */
public class Figure {
    private String name;
    private String position;
    private double volume;
    private String color;

    public void set(String name, String position, double volume, String color) {
        this.name = name;
        this.position = position;
        this.volume = volume;
        this.color = color;
    }

    public void load(Save save) {
        System.out.println("Loading...");
        name = save.getName();
        position = save.getPosition();
        volume = save.getVolume();
        color = save.getColor();
    }

    public Save save() {
        return new Save(name, position, volume, color);
    }

    @Override
    public String toString() {
        return "Figure(name = " + name + ", position = " + position + ", volume = " + volume + ", color = " + color + ")";
    }
}


