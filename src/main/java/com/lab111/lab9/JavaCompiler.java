package com.lab111.lab9;

/**
 * @author Volex
 * @version 9.0
 *          public class JavaCompiler implements Compiler
 *          overrides compile method for Java programming language
 */
public class JavaCompiler implements Compiler {
    @Override
    public void compile() {
        System.out.println("Compilation on Java");
    }
}
