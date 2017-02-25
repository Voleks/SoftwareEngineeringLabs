package com.lab111.lab2;


/**
 *
 * Class Cl3 that
 * implements interface If3,
 * extends class Cl2,
 * contains field of If2 type
 * and overridden methods "meth3", "meth2" and "meth1"
 *
 * @author Volex
 *
 */

public class Cl3 extends Cl2 implements If3{

    If2 myIf2;
    @Override
    public void meth3() {
        System.out.println("Cl3 meth3");
    }
    @Override
    public void meth2(){
        System.out.println("Cl3 meth2");
    }

    @Override
    public void meth1(){
        System.out.println("Cl3 meth1");
    }

}
