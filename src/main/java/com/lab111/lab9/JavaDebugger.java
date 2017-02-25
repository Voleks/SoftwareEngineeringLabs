package com.lab111.lab9;

/**
 * @author Volex
 * @version 9.0
 *          public class JavaDebugger implements Debugger
 *          overrides debug and test methods for Java programming language
 */
public class JavaDebugger implements Debugger {
    @Override
    public void debug() {
        System.out.println("Debugging on Java");
    }

    @Override
    public void test() {
        System.out.println("Testing on Java");
    }
}
