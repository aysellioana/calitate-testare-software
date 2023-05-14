package Flyweight;

import java.awt.*;

public class Circle implements Shape{
    Color color;
    int thickness;

    public Circle(Color color, int thickness) {
        this.color = color;
        this.thickness = thickness;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Desenare la pozitia ("+x+","+y+")"+"cu culoarea "+color+" si grosime "+thickness);
    }
}
