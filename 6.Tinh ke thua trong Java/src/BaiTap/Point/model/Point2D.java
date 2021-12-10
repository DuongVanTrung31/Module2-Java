package BaiTap.Point.model;

public class Point2D {
    private double centerX = 0.0;
    private double centerY = 0.0;

    public Point2D(double centerX, double centerY) {
        this.centerX = centerX;
        this.centerY = centerY;
    }

    public Point2D() {
    }

    public double getCenterX() {
        return centerX;
    }

    public void setCenterX(double centerX) {
        this.centerX = centerX;
    }

    public double getCenterY() {
        return centerY;
    }

    public void setCenterY(double centerY) {
        this.centerY = centerY;
    }

    public void setCenterXY(double centerX , double centerY) {
        this.setCenterX(centerX);
        this.setCenterY(centerY);
    }
    public double[] getCenterXY() {
        double[] array = {this.getCenterX(), this.getCenterX()};
        return array;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "centerX=" + centerX +
                ", centerY=" + centerY +
                '}';
    }
}
