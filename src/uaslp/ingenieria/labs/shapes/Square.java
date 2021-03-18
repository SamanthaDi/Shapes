package uaslp.ingenieria.labs.shapes;
import uaslp.ingenieria.labs.Shape;

public class Square extends Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public String getName() {
        return "Square";
    }

    public float getPerim() {
        return side * 4;
    }

    public float getArea() {
        return side *side;
    }
    public int getSideCount() {
        return 4;
    }
}
