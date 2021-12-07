package ThucHanh;

import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] student = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.println("Enter a name student: ");
        String input = sc.nextLine();
        boolean isExist = false;
        for (int i = 0; i < student.length; i++) {
            if(student[i].equals(input)) {
                System.out.println("Position of the student in the list " + input + " is " + i);
                isExist = true;
                break;
            }
        }
        if(!isExist) {
            System.out.println("Not found" + input +" in the list");
        }
    }
}
