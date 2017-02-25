package com.lab111.lab9;

/**
 * @author Volex
 * @version 9.0
 *          main interface ToolsFactory
 *          has Validator createValidator method,
 *          Compiler createCompiler method and
 *          Debugger createDebugger method
 */
public interface ToolsFactory {
    Validator createValidator();

    Compiler createCompiler();

    Debugger createDebugger();
}
