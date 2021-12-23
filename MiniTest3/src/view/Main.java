package view;

import controller.StudenManager;
import model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list =new ArrayList<>();
        StudenManager studenManager = new StudenManager(list);
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        do {
            System.out.println("Quản lý học sinh");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Sửa sinh viên theo id");
            System.out.println("3. Xóa sinh viên theo id");
            System.out.println("4. Tìm kiếm sinh viên theo id");
            System.out.println("5. Sắp xếp điểm TB");
            System.out.println("6. Tìm sinh viên điểm TB cao nhất");
            System.out.println("7. Hiển thị tất cả các sinh viên");
            System.out.println("0 . Exit");
            System.out.println("Nhập lựa chọn");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    studenManager.addStudent();
                    break;
                case 2:
                    System.out.println("Nhập id sinh viên");
                    int idUpdate = scanner.nextInt();
                    System.out.println(studenManager.updateStudent(idUpdate));;
                    break;
                case 3:
                    System.out.println("Nhập id sinh viên");
                    int idDel = scanner.nextInt();
                    studenManager.remove(idDel);
                    break;
                case 4:
                    System.out.println("Nhập id sinh viên");
                    int idFind = scanner.nextInt();
                    System.out.println(studenManager.findById(idFind));;
                    break;
                case 5:
                    studenManager.sortByAVGMark();
                    break;
                case 6:
                    System.out.println("Sinh viên có điểm cao nhất");
                    studenManager.findByAVGMark();;
                    break;
                case 7:
                    System.out.println("Danh sách các sinh viên");
                    studenManager.displayAll();
                    break;
                case 0:
                    break;
            }
        } while (choice != 0);
    }
}
