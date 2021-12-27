package BT_triangle;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter edge A : ");
        int edgeA = sc.nextInt();
        System.out.println("Enter edge B : ");
        int edgeB = sc.nextInt();
        System.out.println("Enter edge C : ");
        int edgeC = sc.nextInt();

        System.out.println(Triangle.compareTriangle(edgeA, edgeB, edgeC));
    }
}
