package view;

import controller.StudentManager;
import model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final StudentManager students = new StudentManager();
    public static void main(String[] args) {
        int choice;
        do {
            menu();
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    students.addStudent();
                    break;
                case 2:
                    System.out.println("Input id student");
                    int idEdit = Integer.parseInt(scanner.nextLine());
                    System.out.println(students.editStudent(idEdit));
                    break;
                case 3:
                    System.out.println("Input id student");
                    int idDel = Integer.parseInt(scanner.nextLine());
                    System.out.println(students.deleteStudent(idDel));
                    break;
                case 4:
                    System.out.println("Input id student");
                    int idFind = Integer.parseInt(scanner.nextLine());
                    System.out.println(students.findStudent(idFind));
                    break;
                case 5:
                    System.out.println("List student Point Insert");
                    students.sortStudentInsert();
                    break;
                case 6:
                    System.out.println("List student Point Decess");
                    students.sortStudentDec();
                    break;
                case 7:
                    ArrayList<Student> bestStudent;
                    bestStudent = students.findMaxPoint();
                    bestStudent.forEach(System.out::println);
                    break;
                case 8:
                    System.out.println("List student");
                    students.displayAllStudent();
                    break;
            }
        } while (choice != 0);
    }

    public static void menu() {
        System.out.println("----- Menu ------");
        System.out.println("1.Add student");
        System.out.println("2.Edit student by ID");
        System.out.println("3.Delete student by ID");
        System.out.println("4.Find student by ID");
        System.out.println("5.Sort student point Insert");
        System.out.println("6.Sort student point Decress");
        System.out.println("7.Find student maxPoint");
        System.out.println("8.Display all student");
        System.out.println("0. Exit");
        System.out.println("Enter choice");
    }
}
