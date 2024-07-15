package edu.geometry.client;
import edu.geometry.Rectangle;
import edu.geometry.Circle;


public class ShapeClient {
    public static void main(String[] args) {
    Circle circle = new Circle(6);
    Rectangle rectangle = new Rectangle(6, 7);

    System.out.println("Circle area: "+circle.area());
    System.out.println("Rectangle area: "+rectangle.area());

    }
}