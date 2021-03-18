package uaslp.ingenieria.labs;

import uaslp.ingenieria.labs.shapes.Circle;
import uaslp.ingenieria.labs.shapes.Rectangle;
import uaslp.ingenieria.labs.shapes.Square;
import uaslp.ingenieria.labs.shapes.Triangle;
import uaslp.ingenieria.labs.shapes.triangles.IsoscelesTriangle;
import uaslp.ingenieria.labs.shapes.triangles.ScaleneTriangle;
import uaslp.ingenieria.labs.shapes.triangles.TriangleEquilatero;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Shape> shapes = new LinkedList<>();

        // for-each -> Java 1.5

        //shapes.add(new Shape());
        shapes.add(new Circle(5));
        shapes.add(new Rectangle(3, 4));
        shapes.add(new Square(10));
        shapes.add(new TriangleEquilatero(6, 3));
        shapes.add(new ScaleneTriangle(5, 3, 2, 4));
        shapes.add(new IsoscelesTriangle(6, 3));


        for(Shape shape : shapes){
            System.out.println("Name: " + shape.getName());
            System.out.println("Sides count: " + shape.getSideCount());
            System.out.println("Perim: " + shape.getPerim());
            System.out.println("Area: " + shape.getArea());
            System.out.println("-----------------------------------------");

        }
    }
}
