package BT_nextdaycalculator;

import java.util.Scanner;

public class TestNextDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day: ");
        int day = sc.nextInt();
        System.out.println("Enter month: ");
        int month = sc.nextInt();
        System.out.println("Enter year: ");
        int year = sc.nextInt();

//        NextDayCalculator nextDayCalculator = new NextDayCalculator();
//        System.out.println("The next day : ");
//        if(nextDayCalculator.checkYear(year)) {
//            nextDayCalculator.display(day, month, year);
//        }else
//            nextDayCalculator.display1(day, month, year);


        NextDayCalculator2 nextDayCalculator2 = new NextDayCalculator2();
        System.out.println("The next day : ");
        if(nextDayCalculator2.checkYear(year)) {
            nextDayCalculator2.display(day, month, year);
        }else
            nextDayCalculator2.display1(day, month, year);

    }
}
