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
                    ManagerBook.createListBooks(scan, listBooks);
                    break;
                case 2:
                    System.out.println("Tổng giá tất cả sách = " + ManagerBook.totalPriceListBooks(listBooks));
                    break;
                case 3:
                    System.out.println("Danh sách : ");
                    ManagerBook.displayListBooks(listBooks);
                    break;
                case 4:
                    ManagerBook.findAnyBook(scan, listBooks);
                    break;
                case 5:
                    ManagerBook.findAuthorBook(scan, listBooks);
                    break;
                case 6:
                    System.out.println("Giá trung bình các sách khoa học = " + ManagerBook.avgScienceBooks(listBooks));
                    break;
                case 7:
                    ManagerBook.findAllBookRangePrices(scan, listBooks);
                    break;
                case 8:
                    ManagerBook.findAllSciencebooks(listBooks);
                    break;
                case 9:
                    ManagerBook.findAllNovelBook(listBooks);
                    break;
                case 10:
                    ManagerBook.findAllBookHasSamePrice(scan, listBooks);
                    break;
                case 11:
                    System.out.println("Sách có giá cao nhất là: ");
                    ManagerBook.findHighestPriceBook(listBooks);
                    break;
                case 12:
                    System.out.println("Sách có giá thấp nhất là: ");
                    ManagerBook.findLowestPriceBook(listBooks);
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }

    public static void menu() {
        System.out.println("Thư viện quản lý sách");
        System.out.println("==========================");
        System.out.println("1. Thêm sách mới");
        System.out.println("2. Tính tổng giá tất cả các sách");
        System.out.println("3. Hiển thị giỏ sách");
        System.out.println("4. Tìm sách theo thể loại ");
        System.out.println("5. Tìm sách theo tác giả ");
        System.out.println("6. Tính đơn giá trung bình sách khoa học");
        System.out.println("7. Tìm sách trong tầm giá khoảng : ");
        System.out.println("8. Tìm tất cả sách khoa học ");
        System.out.println("9. Tìm tất cả sách tiểu thuyết ");
        System.out.println("10. Tìm tất cả sách có giá tiền là : ");
        System.out.println("11. Tìm sách có giá cao nhất");
        System.out.println("12. Tìm sách có giá thấp nhất");
        System.out.println("0. Exit");
        System.out.println("==========================");
    }
}

