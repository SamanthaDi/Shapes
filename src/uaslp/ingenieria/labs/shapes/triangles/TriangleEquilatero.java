package uaslp.ingenieria.labs.shapes.triangles;

import uaslp.ingenieria.labs.shapes.Triangle;

public class TriangleEquilatero extends Triangle {
    public TriangleEquilatero(float base, float height){
        this.base = base;
        this.height = height;
    }

    public String getName(){
        return "Triangle Equilatero";
    }

    public float getPerim() {
        return base*3;
    }

    public float getArea() {
        return base*height/2;
    }


}
