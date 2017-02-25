package com.lab111.lab9;

/**
 * @author Volex
 * @version 9.0
 *          public class SwiftValidator implements Validator
 *          overrides boolean isValid method for Swift programming language
 */
public class SwiftValidator implements Validator {
    @Override
    public boolean isValid(boolean o) {
        if (o){
            System.out.println("Your Swift-program is valid");
        } else System.out.println("Your Swift-program is not valid");
        return false;
    }
}
