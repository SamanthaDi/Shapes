package uaslp.ingenieria.labs.shapes;

import uaslp.ingenieria.labs.Shape;

public class Circle extends Shape {
    private float radio;

    public Circle(float radio){
        this.radio = radio;
    }

    // Re-definir el metodo de una clase hija SOBRE-ESCRITURA
    //overwriting

    public String getName() {
        return "Circle";
    }

    public float getArea() {
        return (float)Math.PI * (radio*radio);
    }

    public float getPerim(){
        return 2* (float)Math.PI *radio;
    }
    public int getSideCount() {
        return 1;
    }

}
