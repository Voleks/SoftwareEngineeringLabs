package com.lab111.lab3;

import java.util.ArrayList;

/**
 * Composite realize interface IGraphics
 *
 * @author Volex
 */
public class Composite implements IGraphics {
    ArrayList<IGraphics> arrayList = new ArrayList<>();

    void addElement(IGraphics element) {
        arrayList.add(element);
    }

    void removeElement(IGraphics element) {
        arrayList.remove(element);
    }

    @Override
    public void show() {
        for (IGraphics element : arrayList)
            element.show();
    }
}
