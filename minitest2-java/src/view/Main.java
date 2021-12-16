package view;

import model.Student;
import model.StudentManger;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        StudentManger studentManger = new StudentManger(students);
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        do {
            System.out.println("Quản lý sinh viên");
            System.out.println("1. Hiển thị tất cả");
            System.out.println("2. Thêm sinh viên");
            System.out.println("3. Tìm theo id");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                        studentManger.dislay();
                    break;
                case 2:
                    System.out.println("Nhâp tên học sinh");
                    String name = scanner.nextLine();
                    System.out.println("Nhập tuổi");
                    int age = scanner.nextInt();
                    System.out.println("Nhập điểm TB");
                    double avg = scanner.nextDouble();
                    Student student = new Student(name , age ,avg);
                        studentManger.add(student);
                    break;
                case 3:
                    System.out.println("Nhập id");
                    int id = scanner.nextInt();
                    studentManger.searchById(id);
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
            }

        } while (choice != 0);
    }
}
