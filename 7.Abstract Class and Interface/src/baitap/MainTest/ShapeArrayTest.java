package baitap.MainTest;

import model.shape.Circle;
import model.shape.Rectangle;
import model.shape.Shape;
import model.shape.Square;

public class ShapeArrayTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Square("Blue", true, 50);
        shapes[1] = new Circle(3.5);
        shapes[2] = new Rectangle(10, 20);
        shapes[3] = new Square(30);

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        System.out.println("<----------------------------------->");
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                System.out.println("Diện tích =" + ((Circle) shape).getArea());
            } else if (shape instanceof Rectangle) {
                if(shape instanceof Square) {
                    ((Square) shape).howToColor();
                } else {
                    System.out.println("Diện tích =" + ((Rectangle) shape).getArea());
                }
            }
        }


    }
}
