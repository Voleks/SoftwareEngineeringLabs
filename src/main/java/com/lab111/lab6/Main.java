package com.lab111.lab6;

/**
 * @author Nata
 * @version 6.0
 *          Main client method
 */
public class Main {
    public static void main(String[] args) {
        Graphics panel = new Panel(GraphicNum.panel);
        Graphics panel2 = new Panel(GraphicNum.panel);
        Graphics panel3 = new Panel(GraphicNum.panel);

        Graphics button = new Button(GraphicNum.button);
        Graphics button2 = new Button(GraphicNum.button);
        panel.setNext(panel2);
        panel2.setNext(panel3);
        button.setNext(button2);

        panel.cursorMovement("Exit", 1);
        button.cursorMovement("Close", 2);

    }
}
