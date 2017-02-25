package com.lab111.lab7;

/**
 * @author Nata
 * @version 7.0
 *          Client-main method
 *          can create Figures and Files
 */
public class Client {
    public static void main(String[] args) {

        Figure figure = new Figure();
        figure.set("Triangle", "top", 5.0, "solid-black");
        System.out.println(figure);

        File file = new File();
        file.setSave(figure.save());
        figure.set("Circle", "bottom", 7.0, "solid-gray");
        System.out.println(figure);

        figure.load(file.getSave());
        System.out.println(figure);

    }
}
