package studentmanager.model;


public class Student {
    public static int count = 0;
    private String name;
    private int age;
    private String gender;
    private String address;
    private double averageMark;
    private int id;

    public Student() {
        count++;
    }

    public Student(String name, int age, String gender, String address, double averageMark) {
        count++;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.averageMark = averageMark;
        this.id = count;
    }

    public int getId() {
        return id;
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
        return "Student{@id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", averageMark=" + averageMark +
                '}';
    }
}
