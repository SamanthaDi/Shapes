package uaslp.ingenieria.labs.shapes;

import uaslp.ingenieria.labs.Shape;

public class Rectangle extends Shape {
    private int base;
    private int height;

    public Rectangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public String getName() {
        return "Rectangle";
    }

    public float getPerim() {
        return (base*2)+(height*2);
    }

    public float getArea() {
        return base * height;
    }
    public int getSideCount() {
        return 4;
    }
}
