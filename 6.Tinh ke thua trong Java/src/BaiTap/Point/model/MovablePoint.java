package BaiTap.Point.model;

public class MovablePoint extends Point2D{
    private double xSpeed = 0.0;
    private double ySpeed = 0.0;

    public MovablePoint(double centerX, double centerY, double xSpeed, double ySpeed) {
        super(centerX, centerY);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(double xSpeed, double ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

    public double getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(double xSpeed) {
        this.xSpeed = xSpeed;
    }

    public double getySpeed() {
        return ySpeed;
    }

    public void setySpeed(double ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(double xSpeed, double ySpeed) {
        setxSpeed(xSpeed);
        setySpeed(ySpeed);
    }

    public double[] getSpeed() {
        double[] arr = {getxSpeed(),getySpeed()};
        return arr;
    }

    public MovablePoint move() {
        double x = super.getCenterX();
        double y = super.getCenterY();
        x += xSpeed;
        y += ySpeed;
        setCenterX(x);
        setCenterY(y);
        return this;
    }

    @Override
    public String toString() {
        return "MovablePoint{ x=" + getCenterX() +
                ", y=" + getCenterY() +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                "} ";
    }
}
