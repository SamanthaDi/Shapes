package uaslp.ingenieria.labs.shapes.triangles;

import uaslp.ingenieria.labs.shapes.Triangle;

public class ScaleneTriangle extends Triangle {

    private float side;
    private float side2;
    public ScaleneTriangle(float base, float height, float side, float side2){
        this.base = base;
        this.height = height;
        this.side = side;
        this.side2 = side2;

    }

    public String getName(){
        return "Scalene Triangle";
    }

    public float getPerim() {
        return base + side + side2;
    }

    public float getArea() {
        return base*height/2;
    }

}
