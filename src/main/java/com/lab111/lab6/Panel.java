package com.lab111.lab6;

/**
 * @author Nata
 * @version 6.0
 *          class Panel extends Graphics
 *          Overrides method draw and realize
 *          super constructor
 */
public class Panel extends Graphics {

    public Panel(int priority) {
        super(priority);
    }

    @Override
    void draw(String action) {
        System.out.println("Cursor on the panel: " + action);
    }
}
