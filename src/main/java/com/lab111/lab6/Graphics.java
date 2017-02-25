package com.lab111.lab6;

/**
 * @author Nata
 * @version 6.0
 *          abstract class Graphics
 *          which has method draw and
 *          setNext method
 */
abstract class Graphics {
    int priority;
    Graphics next;

    public Graphics(int priority) {
        this.priority = priority;
    }

    public void cursorMovement(String action, int level) {
        if (level <= priority) {
            draw(action);
        }
        if (next != null) {
            next.cursorMovement(action, level);
        }
    }

    public void setNext(Graphics next) {
        this.next = next;
    }

    abstract void draw(String action);
}
