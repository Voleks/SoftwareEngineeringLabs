package com.lab111.lab9;

/**
 * @author Volex
 * @version 9.0
 *          public class JavaToolsFactory is class which
 *          implements ToolsFactory and overrides
 *          Validator createValidator method,
 *          Compiler createCompiler method and
 *          Debugger createDebugger method for Java programming language.
 *          Creates JavaCompiler, JavaDebugger and JavaValidator.
 */
public class JavaToolsFactory implements ToolsFactory {
    @Override
    public Validator createValidator() {
        return new JavaValidator();
    }

    @Override
    public Compiler createCompiler() {
        return new JavaCompiler();
    }

    @Override
    public Debugger createDebugger() {
        return new JavaDebugger();
    }
}
