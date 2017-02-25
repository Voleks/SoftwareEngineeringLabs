package com.lab111.lab9;

/**
 * @author Volex
 * @version 9.0
 *          public class JavaValidator implements Validator
 *          overrides boolean isValid method for Java programming language
 */
public class JavaValidator implements Validator {
    @Override
    public boolean isValid(boolean o) {
        if (o){
            System.out.println("Your Java-program is valid");
        } else System.out.println("Your Java-program is not valid");
        return o;
    }
}
