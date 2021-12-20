package view;

import controller.AnimalManager;
import model.Animal;
import model.Cat;
import model.Dog;
import model.Mouse;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<Animal> lists = new LinkedHashSet<>();
        AnimalManager animalManager = new AnimalManager(lists);
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            menu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    int choose;
                    do {
                        System.out.println("Chọn con vật muốn thêm");
                        System.out.println("1. Thêm chó");
                        System.out.println("2. Thêm mèo");
                        System.out.println("3. Thêm chuột");
                        System.out.println("0. Quay lại");
                        choose = scanner.nextInt();
                        switch (choose) {
                            case 1:
                                Dog dog = (Dog) animalManager.createAnimal(scanner, choose);
                                animalManager.add(dog);
                                scanner.nextLine();
                                break;
                            case 2:
                                Cat cat = (Cat) animalManager.createAnimal(scanner, choose);
                                animalManager.add(cat);
                                scanner.nextLine();
                                break;
                            case 3:
                                Mouse mouse = (Mouse) animalManager.createAnimal(scanner, choose);
                                animalManager.add(mouse);
                                scanner.nextLine();
                                break;
                        }
                    } while (choose !=0);
                    scanner.nextLine();
                    break;
                case 2:
                    System.out.println("Nhập tên con vật cần xóa");
                    String nameDel = scanner.nextLine();
                    animalManager.remove(nameDel);
                    scanner.nextLine();
                    break;
                case 3:
                    System.out.println("Nhập tên con vật cần sửa");
                    String nameUpdate = scanner.nextLine();
                    animalManager.update(nameUpdate);
                    scanner.nextLine();
                    break;
                case 4:
                    System.out.println("Nhập tên con vật cần hiện");
                    String nameShow = scanner.nextLine();
                    animalManager.displayByName(nameShow);
                    scanner.nextLine();
                    break;
                case 5:
                    System.out.println("Tất cả con vật");
                    animalManager.displayAll();
                    scanner.nextLine();
                    break;
                case 6:
                    System.out.println("Tất cả các con chó");
                    animalManager.displayDogs();
                    scanner.nextLine();
                    break;
                case 7:
                    animalManager.weightRange(scanner);
                    scanner.nextLine();
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }

    public static void menu() {
        System.out.println("MENU:");
        System.out.println("1. Thêm 1 con vật");
        System.out.println("2. Xóa 1 con vật theo tên");
        System.out.println("3. Sửa 1 con vật theo tên");
        System.out.println("4. Hiển thị thông tin con vật theo tên nhập");
        System.out.println("5. Hiển thị tất cả các con vật");
        System.out.println("6. Hiển thị tất cả các con chó");
        System.out.println("7. Tìm các con vật theo cân nặng");
        System.out.println("0. Exit");
    }
}
