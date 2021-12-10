package BaiTap.Point.model;


import BaiTap.Point.model.Point2D;

public class Point3D extends Point2D {
    private double centerZ = 0.0;

    public Point3D() {
    }

    public Point3D(double centerX, double centerY, double centerZ) {
        super(centerX, centerY);
        this.centerZ = centerZ;
    }

    public double getCenterZ() {
        return centerZ;
    }

    public void setCenterZ(double centerZ) {
        this.centerZ = centerZ;
    }

    public void setCenterXYZ(double centerX,double centerY, double centerZ) {
        this.setCenterX(centerX);
        this.setCenterY(centerY);
        this.setCenterZ(centerZ);
    }


    public double[] getCenterXYZ() {
        double[] array = {this.getCenterX() ,this.getCenterY() , this.centerZ};
        return  array;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "centerZ=" + this.getCenterX() +
                ", centerY=" + this.getCenterY() +
                ", centerZ="+ centerZ + "}";
    }
}
