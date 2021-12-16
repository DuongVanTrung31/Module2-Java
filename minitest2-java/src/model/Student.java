package model;

public class Student extends Human{
    public static int value = 0;
    private double averageMark;
    private int id;
    public Student() {
        id = ++value;
    }

    public Student(String name, int age, double averageMark) {
        super.setName(name);
        super.setAge(age);
        this.averageMark = averageMark;
        this.id = ++value;
    }

    public int getId() {
        return id;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    @Override
    public String toString() {
        return "Student{@id=" + id + ", name=" + this.getName() +
                ", age="+ this.getAge() +
                ", averageMark=" + averageMark +
                "} ";
    }
}
