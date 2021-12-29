package view;

import controller.StudentManager;
import model.Student;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static final StudentManager studentManager = new StudentManager();
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        do {
            menu();
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    studentManager.createStudent();
                    break;
                case 2:
                    System.out.println("Nhập tên muốn xóa");
                    String nameDel = scanner.nextLine();
                    studentManager.removeStudent(nameDel);
                    break;
                case 3:
                    System.out.println("Nhập tên muốn sửa");
                    String nameFix = scanner.nextLine();
                    studentManager.updateStudent(nameFix);
                    break;
                case 4:
                    studentManager.displayAll();
                    break;
                case 5:
                    studentManager.displayPointsUpper();
                    break;
                case 6:
                    break;
                case 7:
                    studentManager.write((List<Student>) studentManager);
                    break;
                case 8:
                    break;
            }
        } while (choice != 0);
    }

    public static void menu() {
        System.out.println("Menu sinh viên");
        System.out.println("1.Thêm sinh viên");
        System.out.println("2.Xóa sinh viên");
        System.out.println("3.Sửa sinh viên");
        System.out.println("4.Hiển thị tất cả");
        System.out.println("5.Hiển thị các sinh viên điểm Tb trên 7.5");
        System.out.println("6.Hiển thị theo table");
        System.out.println("7.Ghi file");
        System.out.println("8.Đọc file");
        System.out.println("0. Exit");
        System.out.println("Nhập lựa chọn");
    }
}
