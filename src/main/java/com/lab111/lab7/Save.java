package com.lab111.lab7;

/**
 * @author Nata
 * @version 7.0
 *          public class Save
 *          contains private fields,
 *          constructor and getMethods
 *          for all field
 */
public class Save {
    private String name;
    private String position;
    private double volume;
    private String color;

    public Save(String name, String position, double volume, String color) {
        this.name = name;
        this.position = position;
        this.volume = volume;
        this.color = color;
    }

    public double getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getPosition() {
        return position;
    }
}
