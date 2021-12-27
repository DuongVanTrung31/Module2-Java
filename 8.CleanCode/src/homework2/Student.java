package homework2;

import java.util.Comparator;

public class Student  {
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
        return "ID: " + this.idStudent + " - Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", averageMark=" + averageMark +
                '}';
    }

}
