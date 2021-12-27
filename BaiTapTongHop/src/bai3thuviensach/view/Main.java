package bai3thuviensach.view;

import bai3thuviensach.controller.StudentManager;
import bai3thuviensach.controller.TicketManager;
import bai3thuviensach.model.Student;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final StudentManager studentManager = new StudentManager();
    private static final TicketManager ticketManager = new TicketManager();
    public static void main(String[] args) {

        int choice;
        do {
            System.out.println("------Menu-----");
            System.out.println("1. Quản lý sinh viên");
            System.out.println("2. Quản lý thư viện");
            System.out.println("0 . Exit");
            System.out.println("Nhập lựa chọn của bạn");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    menuStudent();
                    break;
                case 2:
                    menuTicketBook();
                    break;
            }
        } while (choice != 0);
    }

    public static void menuTicketBook() {
        int choice1;
        do {
            System.out.println("----Menu thư viện----");
            System.out.println("1. Mượn sách");
            System.out.println("2. Hiển thị thông tin các sinh viên đang mượn sách");
            System.out.println("3. Hiện thị thông tin sách theo mã sinh viên đã mượn");
            System.out.println("4. Hiển thị các sinh viên cần trả sách theo đúng hạn");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn của bạn");
            choice1 = Integer.parseInt(scanner.nextLine());
            switch (choice1) {
                case 1:
                    System.out.println("Nhập vào mã sinh viên muốn mượn ");
                    String idStudent = scanner.nextLine();
                    Student student = studentManager.searchById(idStudent);
                    if (student != null) {
                        System.out.println(ticketManager.createTicket(student));
                        System.out.println("Đã xác nhận");
                    } else {
                        System.out.println("Ko tồn tại sinh viên trên");
                    }
                    break;
                case 2:
                    ticketManager.displayAll();
                    break;
                case 3:
                    System.out.println("Nhập vào mã sinh viên");
                    String idStudent1 = scanner.nextLine();
                    ticketManager.displayById(idStudent1);
                    break;
                case 4:
                    ticketManager.displayMonthEnd();
                    break;
            }
        } while (choice1 != 0);
    }

    public static void menuStudent() {
        int choice2;
        do {
            System.out.println("----Menu sinh viên----");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Xóa sinh viên");
            System.out.println("3. Hiển thị sinh viên theo mã");
            System.out.println("4. Hiển thị tất cả các sinh viên");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn của bạn");
            choice2 = Integer.parseInt(scanner.nextLine());
            switch (choice2) {
                case 1:
                    Student student = studentManager.createStudent();
                    if(student != null){
                        System.out.println(student);
                        System.out.println("Thêm thành công");
                    } else {
                        System.out.println("Lỗi");
                    }
                    break;
                case 2:
                    System.out.println("Nhập vào mã sinh viên");
                    String idStudentDel = scanner.nextLine();
                    Student delStudent = studentManager.deleteStudent(idStudentDel);
                    if(delStudent != null){
                        System.out.println(delStudent);
                        System.out.println("xóa thành công");
                    } else {
                        System.out.println("Không tồn tại sinh viên đó");
                    }
                    break;
                case 3:
                    System.out.println("Nhập vào mã sinh viên");
                    String idStudentFind = scanner.nextLine();
                    Student findStudent = studentManager.searchById(idStudentFind);
                    if(findStudent != null){
                        System.out.println(findStudent);
                    } else {
                        System.out.println("Không tồn tại sinh viên đó");
                    }
                    break;
                case 4:
                    studentManager.displayList();
                    break;
            }
        } while (choice2 != 0);
    }
}
