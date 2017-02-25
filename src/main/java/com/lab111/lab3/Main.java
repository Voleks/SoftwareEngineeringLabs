package com.lab111.lab3;

/**
 * Main class
 *
 * @author Volex
 */
public class Main {
    public static void main(String[] args) {
        IGraphics shape = new Line(1, 4, 5, 6);
        IGraphics shape2 = new Circle(2, 4, 5, 6);
        IGraphics shape3 = new Rectangle(1, 3, 5, 6);
        IGraphics shape4 = new Line(1, 4, 5, 6);

        Composite composite1 = new Composite();
        Composite composite2 = new Composite();

        composite1.addElement(shape);
        composite1.addElement(shape4);
        composite2.addElement(shape3);
        composite2.addElement(shape2);

        Composite composite = new Composite();
        composite.addElement(composite1);
        composite.addElement(composite2);
        composite.show();

    }
}
