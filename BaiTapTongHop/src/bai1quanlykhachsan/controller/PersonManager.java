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
        try {
            System.out.println("Điền tên họ");
            String name = scanner.nextLine();
            System.out.println("Điền ngày sinh (dd/mm/yy)");
            String date = scanner.nextLine();
            System.out.println("Điền số CMND");
            String CMND = scanner.nextLine();
            System.out.println("Điền loại phòng");
            String type = scanner.nextLine();
            System.out.println("Điền giá tiền");
            double price = scanner.nextDouble();
            System.out.println("Điền số ngày thuê");
            int days = scanner.nextInt();
            Person person = new Person(name, date, CMND);
            Hotel room = new Hotel(type, price, days);
            list.put(person, room);
        } catch (Exception e) {
            System.out.println("Nhập lỗi sai kiểu dữ liệu mời nhập lại!!");
            scanner.nextLine();
            add();
        }
    }

    public void displayAll() {
        if (!list.isEmpty()) {
            Set<Map.Entry<Person, Hotel>> setH = list.entrySet();
            for (Map.Entry<Person, Hotel> e : setH) {
                e.getKey().display();
                e.getValue().displayRoom();
            }
        } else {
            System.out.println("Khách sạn chưa có mống nào!!!:(((");
        }
    }

    public Person removeByCMND(String numCMND) {
        if (!list.isEmpty()) {
            Person person1;
            for (Person e : list.keySet()) {
                if (!(e.getCMND().equals(numCMND))) {
                    System.out.println("Không tìm thấy số CMND đó trong thông tin khách trọ");
                } else {
                    person1 = e;
                    list.remove(e);
                    System.out.println("Xóa thành công");
                    return person1;
                }
            }
        } else {
            System.out.println("Chưa có khách nàm sao tìm");
        }
        return null;
    }

    public void findByName(String name) {
        if (!list.isEmpty()) {
            for (Map.Entry<Person, Hotel> e : list.entrySet()) {
                if (!(e.getKey().getName().equals(name))) {
                    System.out.println("Không tìm thấy tên khách trọ!!!");
                } else {
                    e.getKey().display();
                    e.getValue().displayRoom();
                }
            }
        } else {
            System.out.println("Chưa có khách nàm sao tìm");
        }
    }

    public void getMoneyByCMND(String CMND) {
        if (!list.isEmpty()) {
            for (Map.Entry<Person, Hotel> e : list.entrySet()) {
                if (!(e.getKey().getCMND().equals(CMND))) {
                    System.out.println("Không tìm thấy CMND khách trọ đó!!!!");
                }
                System.out.println("Giá tiền khách phải trả sau " + e.getValue().getDaysInRoom() + " ngày là: " + countMoney(e.getValue()));
            }
        } else {
            System.out.println("Chưa có khách nàm sao tìm");
        }
    }

    public double countMoney(Hotel room) {
        return room.getPrice() * room.getDaysInRoom();
    }
}
