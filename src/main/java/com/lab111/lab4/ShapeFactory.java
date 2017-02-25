package com.lab111.lab4;

import java.util.HashMap;
import java.util.Map;

/**
 * Class ShapeFactory realize flyweight pattern
 *
 * @author Volex
 *         version 4.0
 */
public class ShapeFactory {
    private static final Map<String, IShape> shapes = new HashMap<>();

    public IShape getShape(String shapeName) {
        IShape shape = shapes.get(shapeName);

        if (shape == null) {

            switch (shapeName) {
                case "circle": {
                    shape = new Circle();
                    break;
                }
                case "line": {
                    shape = new Line();
                    break;
                }
                case "square": {
                    shape = new Square();
                    break;
                }
            }
            shapes.put(shapeName, shape);

        }

        return shape;

    }
}
