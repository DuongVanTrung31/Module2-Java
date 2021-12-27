package homework2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of Students: ");
        int numberStudent = sc.nextInt();
        Student[] students = new Student[numberStudent];
        StudentManager studentManager = new StudentManager(students);
        int choice;

        do {
            System.out.println("Menu: ");
            System.out.println("1. Add new student");
            System.out.println("2. Display student list");
            System.out.println("3. Display students has highest score");
            System.out.println("4. Display students has lowest score");
//            System.out.println("5. Add new student");
            System.out.println("5. Delete student by name");
            System.out.println("6. Find student by name");
            System.out.println("7. Find student by gender");
            System.out.println("8. Edit student via ID Student");
            System.out.println("9. Rearrange student list by average score");
            System.out.println("0. Exit");
            System.out.println("--------------------------------------------");
            System.out.println("Select your choice");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    studentManager.createStudentList();
                    break;
                case 2:
                    studentManager.displayStudentList();
                    break;
                case 3:
                    studentManager.displayHighestMark();
                    break;
                case 4:
                    studentManager.displayLowestMark();
                    break;
                case 5:
                    studentManager.deleteStudentByName();
                    break;
                case 6:
                    studentManager.findStudentByName();
                    break;
                case 7:
                    studentManager.findStudentByGender();
                    break;
                case 8:
                    studentManager.editStudentByID();
                    break;
                case 9:
                    studentManager.arrangeStudentListByMark();
                    break;
                default:
                    System.out.println("Wrong choice!!!");
                    break;
            }
        } while (choice != 0);


    }
}
