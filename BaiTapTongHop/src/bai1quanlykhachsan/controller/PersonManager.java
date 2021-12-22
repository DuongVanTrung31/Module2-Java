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
        scanner.nextLine();
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
            for (Map.Entry<Person, Hotel> e : list.entrySet()) {
                e.getKey().display();
                e.getValue().displayRoom();
            }
        } else {
            System.out.println("Khách sạn chưa có mống nào!!!:(((");
        }
    }

    public Person removeByCMND(String numCMND) {
        boolean check = true;
        if (!list.isEmpty()) {
            Person person1;
            for (Person e : list.keySet()) {
                if (e.getCMND().equals(numCMND)) {
                    person1 = e;
                    list.remove(e);
                    System.out.println("Xóa thành công");
                    return person1;
                }
            }
            if(check) {
                System.out.println("Không tìm thấy khách hàng có số CMND đó");
            }
        } else {
            System.out.println("Chưa có khách nàm sao tìm");
        }
        return null;
    }

    public void findByName(String name) {
        boolean check = true;
        if (!list.isEmpty()) {
            for (Map.Entry<Person, Hotel> e : list.entrySet()) {
                if (e.getKey().getName().equals(name)) {
                    check = false;
                    e.getKey().display();
                    e.getValue().displayRoom();
                }
            }
            if(check){
                System.out.println("Không tìm thấy khách hàng đó");
            }
        } else {
            System.out.println("Chưa có khách nàm sao tìm");
        }
    }

    public void getMoneyByCMND(String CMND) {
        boolean check = true;
        if (!list.isEmpty()) {
            for (Map.Entry<Person, Hotel> e : list.entrySet()) {
                if (e.getKey().getCMND().equals(CMND)) {
                    check = false;
                    System.out.println("Giá tiền khách phải trả sau " + e.getValue().getDaysInRoom() + " ngày là: " + countMoney(e.getValue()));
                }
            }
            if(check){
                System.out.println("Không tìm thấy khách hàng có số CMND đó");
            }
        } else {
            System.out.println("Chưa có khách nàm sao tìm");
        }
    }

    public double countMoney(Hotel room) {
        return room.getPrice() * room.getDaysInRoom();
    }
}
