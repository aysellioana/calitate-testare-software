package Flyweight;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Shape redCircle= ShapeFactory.getShape("red-circle", Color.RED,1);
        Shape redCircle2= ShapeFactory.getShape("red-circle", Color.RED,1);
        Shape blueCircle= ShapeFactory.getShape("blue-circle", Color.RED,2);

        redCircle.draw(10,10);
        redCircle2.draw(10,20);
        blueCircle.draw(10,15);
    }
}