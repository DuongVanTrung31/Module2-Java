package baitap.MainTest;


import model.shape.Circle;
import model.shape.Rectangle;
import model.shape.Shape;
import model.shape.Square;


public class RandomResizeableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3.5);
        shapes[1] = new Rectangle(10,20);
        shapes[2] = new Square(30);
        for (Shape shape: shapes) {
            System.out.println("Pre-resizeale: "+ shape);
        }
        System.out.println("               <------------------ After change ------------------->        ");
        for (Shape shape:shapes){
            if (shape instanceof Circle) {
                ((Circle) shape).resize(Math.floor(Math.random()*100));
            } else if (shape instanceof Rectangle) {
                ((Rectangle) shape).resize(Math.floor(Math.random()*100));
            }
            System.out.println("After-resizeale: " + shape);
        }
    }
}
