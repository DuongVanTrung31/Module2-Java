package Student;

public class Student {
    private String name;
    private int age;
    private  String gender;
    private String address;
    public double mathMark;
    public double philologyMark;
    public double englishMark;

    Student(){}

    public Student(String name, int age, String gender, String address, double mathMark, double philologyMark, double englishMark) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.mathMark = mathMark;
        this.philologyMark = philologyMark;
        this.englishMark = englishMark;
    }

    public double avg() {
        return (mathMark + philologyMark + englishMark) / 3;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", mathMark=" + mathMark +
                ", philologyMark=" + philologyMark +
                ", englishMark=" + englishMark +
                '}';
    }
}
