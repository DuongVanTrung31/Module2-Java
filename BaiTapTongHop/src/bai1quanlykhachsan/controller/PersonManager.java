package bai1quanlykhachsan.controller;


import bai1quanlykhachsan.model.Hotel;
import bai1quanlykhachsan.model.Person;

import java.util.*;

public class PersonManager {
    private HashMap<Person, Hotel> list;
    Scanner scanner = new Scanner(System.in);


    public PersonManager(HashMap<Person, Hotel> lists) {
        list = lists;
    }

    public void add() {
        System.out.println("Nhập tên họ");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh");
        String date = scanner.nextLine();
        System.out.println("Nhập số CMND");
        String CMND = scanner.nextLine();
        System.out.println("Nhập loại phòng");
        String type = scanner.nextLine();
        System.out.println("Nhập giá tiền");
        double price = scanner.nextDouble();
        System.out.println("Số ngày thuê");
        int days = scanner.nextInt();
        Person person = new Person(name, date, CMND);
        Hotel room = new Hotel(type, price, days);
        list.put(person, room);
    }

    public void displayAll() {
        System.out.printf("%-15S%-15s%-15s%-15s%-15s%-15s", "họ tên", "Ngày sinh", "CMND", "Loại phòng", "Giá", "Thời hạn(ngày)");
        Set<Map.Entry<Person, Hotel>> setH = list.entrySet();
        for (Map.Entry<Person, Hotel> e : setH) {
            e.getKey().display();
            e.getValue().displayRoom();
        }
    }

    public void createPassenger(Scanner scanner) {

    }
}
