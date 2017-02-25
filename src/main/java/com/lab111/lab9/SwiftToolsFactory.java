package com.lab111.lab9;

/**
 * @author Volex
 * @version 9.0
 *          public class SwiftToolsFactory is class which
 *          implements ToolsFactory and overrides
 *          Validator createValidator method,
 *          Compiler createCompiler method and
 *          Debugger createDebugger method for Swift programming language.
 *          Creates SwiftCompiler, SwiftDebugger and SwiftValidator.
 */
public class SwiftToolsFactory implements ToolsFactory {
    @Override
    public Validator createValidator() {
        return new SwiftValidator();
    }

    @Override
    public Compiler createCompiler() {
        return new SwiftCompiler();
    }

    @Override
    public Debugger createDebugger() {
        return new SwiftDebugger();
    }
}
