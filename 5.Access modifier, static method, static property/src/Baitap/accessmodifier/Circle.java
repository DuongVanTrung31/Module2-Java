package Baitap.accessmodifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    private double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
}
