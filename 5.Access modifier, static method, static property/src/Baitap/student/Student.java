package Baitap.student;

public class Student {
    private String name ="John";
    private String classes = "CO2";

    public Student() {
    }

    void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
