package BaiTap;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DrawingTypes {
    public static void printTriangle(int input) {
        switch (input) {
            case 1:
                System.out.println("Print the triangle top-left");
                for (int i = 1; i <= 5; i++) {
                    for (int j = 5; j >= i; j--) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 2:
                System.out.println("Print the triangle top-right");
                for (int i = 1; i <= 5 ; i++) {
                    for (int j = 5; j >= 1 ; j--) {
                        if(j > 6 - i ) {
                            System.out.print(" ");
                        }
                        else {
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                }
                break;
            case 3:
                System.out.println("Print the triangle bottom-left");
                for (int i = 1; i <= 5 ; i++) {
                    for (int j = 1; j <= i ; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 4:
                System.out.println("Print the triangle bottom-right");
                for (int i = 1; i <= 5  ; i++) {
                    for (int j = 1; j <= 5 ; j++) {
                        if(j <= 5 - i) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                }
        }
    }
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 4) {
            System.out.println("Choose type you want ?");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Print the rectangle");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 2:
                    System.out.println("Print the square triangle");
                    System.out.println("1. Print the triangle top-left");
                    System.out.println("2. Print the triangle top-right");
                    System.out.println("3. Print the triangle bottom-left");
                    System.out.println("4. Print the triangle bottom-right");
                    choice = input.nextInt();
                    printTriangle(choice);
                    break;
                case 3:
                    System.out.println("Print isosceles triangle");
//                    for (int i = 0; i < ; i++) {
//
//                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Choice Again");
            }
        }
    }
}
