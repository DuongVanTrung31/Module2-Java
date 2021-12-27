package homework;

import java.util.Arrays;
import java.util.Scanner;

public class StudentManager {
    private Student[] students;
    private final Scanner sc = new Scanner(System.in);

    public Student createStudent() {
        System.out.println("Họ và tên: ");
        String name = sc.nextLine();
        System.out.println("Tuổi: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Giới tính: ");
        String gender = sc.nextLine();
        System.out.println("Địa chỉ: ");
        String address = sc.nextLine();
        System.out.println("Điểm trung bình: ");
        double averageMark = sc.nextDouble();
        sc.nextLine();
        return new Student(name, age, gender, address, averageMark, Student.idStudentStatic);
    }

    public Student[] createStudentList() {
        System.out.println("Nhập số lượng học sinh: ");
        int number = sc.nextInt();
        students = new Student[number];
        int choice;
        int i = 0;
        while (i < number) {
            System.out.println("1. Nhập thông tin học sinh thứ " + (i + 1));
            System.out.println("2. Thôi mỏi tay quá");
            System.out.println("Bạn chọn cái nào?");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    students[i] = createStudent();
                    Student.idStudentStatic++;
                    i++;
                    break;
                case 2:
                    System.out.println("Nhập sau cũng được nhé.");
                    break;
                default:
                    System.out.println("Sai lựa chọn rồi.");
                    break;
            }
            if (choice == 2) {
                break;
            }
        }

        return students;
    }

    public void displayStudentList() {
        for (Student student : students) {
            if (student != null) {
                System.out.println(student.toString());
            }
        }
    }

    public void highestAverageMark() {
        double max = students[0].getAverageMark();
        for (Student student : students) {
            if (student != null) {
                if (max < student.getAverageMark()) {
                    max = student.getAverageMark();
                }
            }
        }
        for (Student student : students) {
            if (student != null) {
                if (max == student.getAverageMark()) {
                    System.out.println(student);
                }
            }
        }
    }

    public void lowestAverageMark() {
        double min = students[0].getAverageMark();
        for (Student student : students) {
            if (student != null) {
                if (min > student.getAverageMark()) {
                    min = student.getAverageMark();
                }
            }
        }
        for (Student student : students) {
            if (student != null) {
                if (min == student.getAverageMark()) {
                    System.out.println(student);
                }
            }
        }
    }

    public Student[] addStudent() {
        Student[] newStudents = new Student[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            newStudents[i] = students[i];
        }
        System.out.println("Nhập thông tin học sinh cần thêm");
        newStudents[newStudents.length - 1] = createStudent();
        students = newStudents;
        return students;
//        displayStudentList();

    }

    public void deleteStudent() {
        System.out.println("Nhập tên học sinh cần xóa: ");
        String name = sc.nextLine();
        int index = 0;
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null){
                if (!students[i].getName().equals(name)) {
                    students[index] = students[i];
                    index++;
                    count++;
                }
            }

        }
        Student[] newStudents = new Student[count];
        for (int i = 0; i < newStudents.length; i++) {
            newStudents[i] = students[i];
        }
        students = newStudents;
        if (count == 0) {
            System.out.println("Không có tên học sinh trong danh sách");
        } else {
            displayStudentList();
        }
    }

    public void findStudent() {
        System.out.println("Nhập tên học sinh cần tìm: ");
        String name = sc.nextLine();
        boolean check = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getName().equals(name)) {
                System.out.println("Thông tin học sinh tên: " + students[i].getName());
                System.out.println(students[i]);
                check = true;
            }
        }
        if (!check) {
            System.out.println("Không có học sinh cần tìm");
        }
    }

    public void findStudentGender() {
        System.out.println("Giới tính bạn muốn tìm: ");
        String gender = sc.nextLine();
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGender().equals(gender)) {
                System.out.println(students[i]);
            }
        }
    }

    public void editStudentID() {
        System.out.println("Nhập ID sinh viên: ");
        int idStudent = sc.nextInt();
        sc.nextLine();
        boolean check = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null){
                if (students[i].getIdStudent() == idStudent) {
                    System.out.println("Sửa lại sinh viên ID " + idStudent);
                    students[i] = createStudent();
                    students[i].setIdStudent(idStudent);
                }
            }

        }
        displayStudentList();
    }

    public void arrangeStudents() {
        int index = 0;
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null){
                count++;
            }
        }
        Student[] newStudents = new Student[count];
        for (int i = 0; i < newStudents.length; i++) {
            newStudents[index] = students[i];
            index++;
        }
        students = newStudents;
        Arrays.sort(students);
        displayStudentList();

    }

}
