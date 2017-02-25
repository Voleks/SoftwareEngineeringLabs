package com.lab111.lab9;

/**
 * @author Volex
 * @version 9.0
 *          public class SwiftDebugger implements Debugger
 *          overrides debug and test methods for Swift programming language
 */
public class SwiftDebugger implements Debugger{
    @Override
    public void debug() {
        System.out.println("Debugging on Swift");
    }

    @Override
    public void test() {
        System.out.println("Testing on Swift");
    }
}
