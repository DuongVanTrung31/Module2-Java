package Student;

public class Main {
    public static void main(String[] args) {
        Student[] arrObj = new Student[3];
        Student student1 = new Student("Huấn" , 23 , "Male" , "Japan" , 1.0, 1.0, 2.0);
        Student student2 = new Student("Nam",20,"Male","Korean",9.0,9.0,9.0);
        Student student3 = new Student("Tiến",29,"Male","Laos",5.0,6.0,3.2);

        arrObj[0] = student1;
        arrObj[1] = student2;
        arrObj[2] = student3;
        for (Student i:arrObj) {
            System.out.println(i);
        }
    }
}
