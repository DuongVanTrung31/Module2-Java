package studentmanager.view;

import studentmanager.controller.StudentManager;
import studentmanager.model.Student;
import java.util.Scanner;

public class StudentManagerMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = {};
        StudentManager studentManager = new StudentManager(students);
        int choice;
        do {
            menu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    studentManager.updateStudentList();
                    studentManager.addStudent(scanner);
                    break;
                case 2:
                    studentManager.displayMaxAvg();
                    break;
                case 3:
                    studentManager.displayMinAvg();
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.println("Nhập tên sinh viên muốn xóa :");
                    String nameDel = scanner.nextLine();
                    studentManager.deleteByName(nameDel);
                    studentManager.displayAllStudent();
                    if(students.length < 1){
                        studentManager.updateStudentList();
                    }
                    break;
                case 5:
                    scanner.nextLine();
                    System.out.println("Nhập tên sinh viên muốn tìm :");
                    String nameFind = scanner.nextLine();
                    studentManager.searchByName(nameFind);
                    break;
                case 6:
                    scanner.nextLine();
                    System.out.println("Nhập giới tính sinh viên muốn hiển thị :");
                    String gender = scanner.nextLine();
                    studentManager.displayAllGenderStudent(gender);
                    break;
                case 7:
                    studentManager.sortAvgMarkAllStudent();
                    break;
                case 8:
                    System.out.println("Nhập ID sinh viên muốn sửa");
                    int id = scanner.nextInt();
                    studentManager.editStudent(id, scanner);
                    studentManager.displayAllStudent();
                    break;
                case 9:
                    studentManager.displayAllStudent();
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }


    public static void menu() {
        System.out.println("Hệ thống quản lý sinh viên");
        System.out.println("1. Thêm sinh viên");
        System.out.println("2. Hiển thị các sinh viên có điểm cao nhất");
        System.out.println("3. Hiển thị các sinh viên có điểm thấp nhất");
        System.out.println("4. Xóa sinh viên theo tên");
        System.out.println("5. Tìm sinh viên theo tên");
        System.out.println("6. Hiển thị các sinh viên theo giới tính");
        System.out.println("7. Sắp xếp sinh viên theo điểm trung bình tăng dần");
        System.out.println("8. Sửa thông tin sinh viên theo ID");
        System.out.println("9. Hiển thị tất cả sinh viên");
        System.out.println("0. Thoát");
    }
}
