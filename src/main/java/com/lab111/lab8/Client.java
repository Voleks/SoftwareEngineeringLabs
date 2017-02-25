package com.lab111.lab8;

/**
 * @author Volex
 * @version 8.0
 *          Main Client method
 *          creates a Figure sample
 */
public class Client {
    public static void main(String[] args) {
        Figure original = new Figure("Circle", 50, 400);
        System.out.println(original);
        Figure clone = (Figure) original.copy();
        System.out.println(clone);

    }


}
