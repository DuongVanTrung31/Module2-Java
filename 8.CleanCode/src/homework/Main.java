package homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();
        int choice;
        do {
            System.out.println("Menu lựa chọn nhé: ");
            System.out.println("1. Nhập thông tin các học sinh");
            System.out.println("2. Hiển thị thông tin các học sinh");
            System.out.println("3. Hiển thị các học sinh max rank");
            System.out.println("4. Hiển thị các học sinh cùi bắp");
            System.out.println("5. Thêm học sinh và hiển thị ra");
            System.out.println("6. Xóa học sinh và hiển thị ra");
            System.out.println("7. Tìm học sinh và hiển thị ra");
            System.out.println("8. Tìm giới tính học sinh và hiển thị ra");
            System.out.println("9. Chỉnh sửa học sinh qua ID và hiển thị");
            System.out.println("10. Sắp xếp học sinh theo trình");
            System.out.println("0. Exit");
            System.out.println("--------------------------------------------");
            System.out.println("Nhập lựa chọn");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    studentManager.createStudentList();
                    break;
                case 2:
                    studentManager.displayStudentList();
                    break;
                case 3:
                    studentManager.highestAverageMark();
                    break;
                case 4:
                    studentManager.lowestAverageMark();
                    break;
                case 5:
                    studentManager.addStudent();
                    break;
                case 6:
                    studentManager.deleteStudent();
                    break;
                case 7:
                    studentManager.findStudent();
                    break;
                case 8:
                    studentManager.findStudentGender();
                    break;
                case 9:
                    studentManager.editStudentID();
                    break;
                case 10:
                    studentManager.arrangeStudents();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Sai lựa chọn, nhập lại đi");
                    break;
            }

        } while (true);


    }
}
