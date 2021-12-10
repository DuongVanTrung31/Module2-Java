package BaiTap.Shape;


import BaiTap.Shape.model.Circle;
import BaiTap.Shape.model.Cylinder;

public class MainCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(3.5);
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        Cylinder cylinder = new Cylinder(4.0, 4);
        System.out.println(cylinder);
        System.out.println(cylinder.getVolume());
    }
}
