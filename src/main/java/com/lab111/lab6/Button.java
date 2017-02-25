package com.lab111.lab6;

/**
 * @author Nata
 * @version 6.0
 *          class Button extends Graphics
 *          Overrides method draw and realize
 *          super constructor
 */
public class Button extends Graphics {
    public Button(int priority) {
        super(priority);
    }

    @Override
    void draw(String action) {
        System.out.println("Cursor on the button: " + action);
    }
}
