package controller;

import model.Book;
import model.NovelBook;
import model.ScienceBook;

import java.time.LocalDate;
import java.util.Scanner;


public class ManagerBook {



    public static void displayListBooks(Book[] bookList) {
        for (Book b : bookList) {
            System.out.println(b);
        }
    }

    public static ScienceBook createScienceBook(Scanner scanner) {
        scanner.nextLine();
        System.out.println("Nhập tên sách : ");
        String name = scanner.nextLine();
        System.out.println("Nhập thể loại : ");
        String category = scanner.nextLine();
        System.out.println("Nhập giá tiền : ");
        double price = scanner.nextDouble();
        System.out.println("Nhập số lượng : ");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập ngày xuất bản YY/MM/DD: ");
        LocalDate date = LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        scanner.nextLine();
        return new ScienceBook(name, price, quantity, date, category);
    }

    public static NovelBook createNovelBook(Scanner scanner) {
        scanner.nextLine();
        System.out.println("Nhập tên sách : ");
        String name = scanner.nextLine();
        System.out.println("Nhập giá tiền : ");
        double price = scanner.nextDouble();
        System.out.println("Nhập số lượng : ");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập ngày xuất bản YY/MM/DD: ");
        LocalDate date = LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        scanner.nextLine();
        System.out.println("Nhập tác giả : ");
        String author = scanner.nextLine();
        return new NovelBook(name, price, quantity, date, author);
    }

    public static void createListBooks(Scanner scan, Book[] lists) {
        for (int i = 0; i < lists.length; i++) {
            System.out.println("Nhập thể loại sách thứ " + (i+1) + " :");
            System.out.println("1. Sách khoa học");
            System.out.println("2. Sách tiểu thuyết");
            int type = scan.nextInt();
            if (type == 1) {
                lists[i] = createScienceBook(scan);
            } else if (type == 2) {
                lists[i] = createNovelBook(scan);
            } else {
                System.out.println("Nhập sai!!");
            }
        }
    }

    public static double totalPriceListBooks(Book[] lists) {
        double totalPrice = 0;
        for (Book b : lists) {
            totalPrice += b.getPrice() * b.getQuantity();
        }
        return totalPrice;
    }

    public static void findHighestPriceBook(Book[] lists) {
        double maxPrice = lists[0].getPrice();
        int index = 0;
        for (int i = 1; i < lists.length; i++) {
            if (lists[i].getPrice() > maxPrice) {
                maxPrice = lists[i].getPrice();
                index = i;
            }
        }
        System.out.println(lists[index]);
    }

    public static Book findLowestPriceBook(Book[] lists) {
        double minPrice = lists[0].getPrice();
        int index = 0;
        for (int i = 1; i < lists.length; i++) {
            if (lists[i].getPrice() < minPrice) {
                minPrice = lists[i].getPrice();
                index = i;
            }
        }
        return lists[index];
    }

//    public static Book findAnyBook(Scanner scanner,Book[] lists) {
//        for (:
//             ) {
//
//        }
//    }
}
