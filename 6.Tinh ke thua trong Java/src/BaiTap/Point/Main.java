package BaiTap.Point;

import BaiTap.Point.model.MovablePoint;
import BaiTap.Point.model.Point2D;
import BaiTap.Point.model.Point3D;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(48, 20);
        point2D.setCenterXY(30,60);
        point2D.getCenterXY();

        Point3D point3D = new Point3D(50,30.6,40.5);
        point3D.setCenterXYZ(20,80,55.5);
        System.out.println(point3D);

        MovablePoint movablePoint = new MovablePoint(1,2,3,4);
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println(movablePoint);
    }
}
