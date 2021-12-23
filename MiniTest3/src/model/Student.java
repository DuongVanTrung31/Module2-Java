package model;

public class Student extends Person{
    private double pointMath;
    private double pointPhysical;
    private double pointChemistry;

    public Student(){
    }

    public Student(String name, int age, double pointMath, double pointPhysical, double pointChemistry) {
        super(name, age);
        this.pointMath = pointMath;
        this.pointPhysical = pointPhysical;
        this.pointChemistry = pointChemistry;
    }

    public double getPointMath() {
        return pointMath;
    }

    public void setPointMath(double pointMath) {
        this.pointMath = pointMath;
    }

    public double getPointPhysical() {
        return pointPhysical;
    }

    public void setPointPhysical(double pointPhysical) {
        this.pointPhysical = pointPhysical;
    }

    public double getPointChemistry() {
        return pointChemistry;
    }

    public void setPointChemistry(double pointChemistry) {
        this.pointChemistry = pointChemistry;
    }

    public double AVGMark() {
        return (pointChemistry + pointPhysical + pointMath)/3;
    }

    @Override
    public String toString() {
        return "Student{"+ super.toString() +
                "pointMath=" + pointMath +
                ", pointPhysical=" + pointPhysical +
                ", pointChemistry=" + pointChemistry +
                "} ";
    }
}
