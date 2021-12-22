package bai1quanlykhachsan.view;

import bai1quanlykhachsan.controller.PersonManager;
import bai1quanlykhachsan.model.Hotel;
import bai1quanlykhachsan.model.Person;


import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<Person, Hotel> list = new HashMap<>();
        PersonManager personManager = new PersonManager(list);
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            menu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Phiếu điền thông tin cá nhân");
                    personManager.add();
                    scanner.nextLine();
                    break;
                case 2:
                    header();
                    personManager.displayAll();
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.println("Nhập số CMND khách hàng");
                    String cmnd = scanner.nextLine();
                    personManager.getMoneyByCMND(cmnd);
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.println("Nhập tên khách hàng");
                    String names = scanner.nextLine();
                    header();
                    personManager.findByName(names);
                    break;
                case 5:
                    scanner.nextLine();
                    System.out.println("Nhập số CMND khách hàng");
                    String cmndDel = scanner.nextLine();
                    System.out.println(personManager.removeByCMND(cmndDel));
                    break;
                case 0:
                    break;

            }
        } while (choice != 0);
    }

    public static void menu() {
        System.out.println("------ Quản lý khách sạn -------");
        System.out.println("1. Thuê phòng");
        System.out.println("2. Thông tin các phòng đang được sử dụng");
        System.out.println("3. Tính tiền trọ khách hàng thông qua <- CMND ->");
        System.out.println("4. Tìm kiếm thông tin khách hàng qua tên");
        System.out.println("5. Tiễn khách ra khỏi khách sạn qua <- CMND -> (Xóa thông tin)");
        System.out.println("0. Thoát");
    }
    public static void header() {
        System.out.printf("%-15S%-15s%-15s%-15s%-15s%-15s", "họ tên", "Ngày sinh", "CMND", "Loại phòng", "Giá", "Thời hạn(ngày)");
        System.out.println();
    }
}
