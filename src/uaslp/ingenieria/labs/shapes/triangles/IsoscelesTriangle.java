package uaslp.ingenieria.labs.shapes.triangles;

import uaslp.ingenieria.labs.shapes.Triangle;

public class IsoscelesTriangle extends Triangle {
    public IsoscelesTriangle(float base, float height){
        this.base = base;
        this.height = height;
    }
    public String getName(){
        return "Isosceles Triangle";
    }

    private float side;
    public float getSide() {
        return side = (float) Math.sqrt((base*base)+(height*height));
    }

    public float getPerim() {
        return base + side * 2;
    }

    public float getArea() {
        return base*height/2;
    }

}
