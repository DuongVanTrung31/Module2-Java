package homework;

import sun.awt.image.GifImageDecoder;

public class Student implements Comparable<Student> {
    public static int idStudentStatic = 1000;
    private String name;
    private int age;
    private String gender;
    private String address;
    private double averageMark;
    private int idStudent;

    public Student() {
    }

    public Student(String name, int age, String gender, String address, double averageMark, int idStudent) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.averageMark = averageMark;
        this.idStudent = idStudent;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public Student(int idStudent) {
        this.idStudent = idStudent;
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    @Override
    public String toString() {
        return "ID = " + idStudent +
                " - Student{" +
                "name='" + this.name + '\'' +
                ", age=" + this.age +
                ", gender='" + this.gender + '\'' +
                ", address='" + this.address + '\'' +
                ", averageMark=" + this.averageMark +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if (o != null){
            if (getAverageMark() > o.getAverageMark()) {
                return -1;
            } else if (getAverageMark() < o.getAverageMark()) {
                return 1;
            } else {
                return 0;
            }
        }
        return 2;
    }
}
