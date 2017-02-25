package com.lab111.lab2;

/**
 * Class Cl1 that
 * implements interface If1,
 * contains field of Cl3 type
 * and overridden method "meth1"
 *
 * @author Volex
 */
public class Cl1 implements If1 {
    Cl3 myCL3;

    @Override
    public void meth1() {
        System.out.println("Cl1 meth1");

    }
}
