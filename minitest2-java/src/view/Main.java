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
            System.out.println("4. Xóa sinh viên theo id");
            System.out.println("5. Sửa thông tin");
            System.out.println("6. Sắp xếp điểm TB");
            System.out.println("7. Tính tổng điểm");
            System.out.println("8. Exit!!!");
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
                    System.out.println("Nhập id");
                    int id1= scanner.nextInt();
                    studentManger.removeById(id1);
                    break;
                case 5:
                    System.out.println("Nhập id");
                    int id2= scanner.nextInt();
                    studentManger.editById(id2,scanner);
                    break;
                case 6:
                    studentManger.sortByAvgMark();
                    break;
                case 7:
                    studentManger.sumAvgMark();
                    break;
                case 0:
                    System.exit(0);
            }

        } while (choice != 0);
    }
}
