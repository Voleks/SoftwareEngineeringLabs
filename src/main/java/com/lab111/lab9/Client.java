package com.lab111.lab9;

/**
 * @author Volex
 * @version 9.0
 *          Client main method
 *          creates JavaToolsFactory and SwiftToolsFactory
 *          has a private static
 *          ToolsFactory method getFactoryByProgramLang
 *
 */
public class Client {
    public static void main(String[] args) {
        ToolsFactory factory = getFactoryByProgramLang("JAVA");
        Compiler c = factory.createCompiler();
        Debugger d = factory.createDebugger();
        Validator v = factory.createValidator();

        c.compile();
        d.debug();
        d.test();
        v.isValid(true);

    }

    private static ToolsFactory getFactoryByProgramLang(String lang) {
        switch (lang) {
            case "JAVA":
                return new JavaToolsFactory();
            case "SWIFT":
                return new SwiftToolsFactory();
            default:
                throw new RuntimeException("Unsupported programming language: " + lang);
        }

    }
}
