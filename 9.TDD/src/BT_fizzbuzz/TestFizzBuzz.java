package BT_fizzbuzz;

import java.util.Scanner;

public class TestFizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        FizzBuzz fizzBuzz = new FizzBuzz();
        System.out.println(fizzBuzz.getResult(num));
    }
}
