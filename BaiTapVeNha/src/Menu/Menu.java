package Menu;

import controller.ManagerBook;
import model.Book;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập số lượng sách :");
        int size = scan.nextInt();
        Book[] listBooks = new Book[size];
        int choice = -1;
        do {
            menu();
            choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1:
                    ManagerBook.createListBooks(scan,listBooks);
                    break;
                case 2:
                    System.out.println("Tổng giá tất cả sách = " +ManagerBook.totalPriceListBooks(listBooks));
                    break;
                case 3:
                    ManagerBook.displayListBooks(listBooks);
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }

    public static void menu() {
        System.out.println("Menu quản lý sách");
        System.out.println("==========================");
        System.out.println("1. Thêm sách mới");
        System.out.println("2. Tính tổng");
        System.out.println("3. Hiển thị giỏ hàng ");
        System.out.println("0. Exit");
        System.out.println("==========================");
        ;
    }
}

