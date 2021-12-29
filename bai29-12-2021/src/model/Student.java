package model;

public class Student extends Human {
    private double pointAverage;

    public Student() {
    }

    public Student(String name, int age, String gender, String address, double pointAverage) {
        super(name, age, gender, address);
        this.pointAverage = pointAverage;
    }

    public double getPointAverage() {
        return pointAverage;
    }

    public void setPointAverage(double pointAverage) {
        this.pointAverage = pointAverage;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "pointAverage=" + pointAverage +
                "}";
    }
}
