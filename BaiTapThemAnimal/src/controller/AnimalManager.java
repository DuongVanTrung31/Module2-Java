package controller;

import model.Animal;
import model.Cat;
import model.Dog;
import model.Mouse;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class AnimalManager {
    private LinkedHashSet<Animal> animals;
    Scanner scanner = new Scanner(System.in);

    public AnimalManager(LinkedHashSet<Animal> list) {
        animals = list;
    }

    public void add(Animal animal) {
        animals.add(animal);
        System.out.println("Thêm thành công");
    }

    public void remove(String name) {
        animals.removeIf(animal -> animal.getName().equals(name));
        System.out.println("Xóa thành công");
    }

    public Animal update(String name) {
        Animal animalUpdate = null;
        for (Animal animal : animals) {
            if (animal.getName().equals(name)) {
                animalUpdate = animal;
            }
        }
        if(animalUpdate != null) {
            System.out.println("Nhâp tuổi mới");
            animalUpdate.setAge(scanner.nextInt());
            System.out.println("Nhập cân nặng mới");
            animalUpdate.setWeight(scanner.nextDouble());
            return animalUpdate;
        }
        return null;
    }

    public void displayByName(String name) {
        for (Animal animal : animals) {
            if (animal.getName().equals(name)) {
                System.out.println(animal);
            }
        }
    }

    public void displayAll() {
        Iterator<Animal> iterator = animals.iterator();
        while (iterator.hasNext()) {
            Animal element = iterator.next();
            System.out.println(element);
        }
    }

    public void displayDogs() {
        for (Animal a : animals) {
            if (a instanceof Dog) {
                System.out.println(a);
            }
        }
    }

    public void weightRange(Scanner scanner) {
        System.out.println("Nhập khoảng cân nặng từ: ");
        double range1 = scanner.nextDouble();
        System.out.println("đến khoảng cân nặng: ");
        double range2 = scanner.nextDouble();
        boolean check = false;
        Iterator<Animal> iterator = animals.iterator();
        while (iterator.hasNext()) {
            check = iterator.next().getWeight() >= range1 && iterator.next().getWeight() <= range2;
            if (check) {
                System.out.println(iterator.next());
            }
        }
        if (!check) {
            System.out.println("Ko tìm thấy trong khoảng cân đó");
        }
    }

    public Animal createAnimal(Scanner scanner, int choose) {
        scanner.nextLine();
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi");
        int age = scanner.nextInt();
        System.out.println("Nhập cân nặng");
        double weight = scanner.nextDouble();
        switch (choose) {
            case 1:
                return new Dog(name, age, weight);
            case 2:
                return new Cat(name, age, weight);
            case 3:
                return new Mouse(name, age, weight);
        }
        return null;
    }
}
