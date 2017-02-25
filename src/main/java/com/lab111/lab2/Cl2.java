package com.lab111.lab2;

/**
 *
 * Class Cl2 that
 * implements interface If2,
 * contains field of If3 type
 * and overridden methods "meth3" and "meth1"
 *
 * @author Voelx
 *
 */
public class Cl2 implements If2  {

    If3 myIf3;
    @Override
    public void meth1() {
        System.out.println("Cl2 meth1");
    }

    @Override
    public void meth2() {
        System.out.println("Cl2 meth2");
    }
}
