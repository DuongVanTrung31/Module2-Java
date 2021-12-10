package BaiTap.Shape;

import BaiTap.Shape.model.Triangle;

public class MainTriangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle);
        System.out.println("Chu vi = " + triangle.getPerimeter());
        System.out.println("Diện tích= " + triangle.getArea());
        System.out.println("--------------------------------");

        Triangle triangle1 = new Triangle(3, 4, 5);
        System.out.println(triangle1);
        System.out.println("Diện tích = " + triangle1.getArea());
        System.out.println("Chu vi = " + triangle1.getPerimeter());
    }
}
