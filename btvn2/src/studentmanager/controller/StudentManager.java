package studentmanager.controller;

import studentmanager.model.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class StudentManager implements Comparator<Student> {
    private Student[] students;
    public static int index = 0;

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAverageMark() > o2.getAverageMark() ? 1 : -1;
    }

    public StudentManager() {
    }

    public StudentManager(Student[] students) {
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void displayAllStudent() {
        System.out.println("Danh sách tất cả học sinh là: ");
        for (Student student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
        System.out.println("-----------------");
    }

    public void displayMaxAvg() {
        double maxAvg = students[0].getAverageMark();
        for (Student student : students) {
            if (student.getAverageMark() > maxAvg) {
                maxAvg = student.getAverageMark();
            }
        }
        System.out.println("Những sinh viên có điểm cao nhất là: ");
        for (Student student : students) {
            if (student.getAverageMark() == maxAvg) {
                System.out.println(student);
            }
        }
        System.out.println("-------------------------");
    }

    public void displayMinAvg() {
        double minAvg = students[0].getAverageMark();
        for (Student student : students) {
            if (student.getAverageMark() < minAvg) {
                minAvg = student.getAverageMark();
            }
        }
        System.out.println("Những sinh viên có điểm thấp nhất là: ");
        for (Student student : students) {
            if (student.getAverageMark() == minAvg) {
                System.out.println(student);
            }
        }
        System.out.println("-------------------------");
    }

    public void searchByName(String searchName) {
        boolean check = false;
        for (Student student : students) {
            if (student.getName().equals(searchName)) {
                check = true;
                System.out.println(student);
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy học sinh tên đó!!!");
        }
        System.out.println("---------------------");
    }

    public void displayAllGenderStudent(String gender) {
        boolean check = false;
        for (Student student : students) {
            if (student.getGender().equals(gender)) {
                check = true;
                System.out.println(student);
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy các học sinh có giới tính đó!!!");
        }
        System.out.println("------------------------");
    }

    public void sortAvgMarkAllStudent() {
        System.out.println("Các sinh viên theo điểm TB tăng dần");
        Comparator<Student> studentComparator = new StudentManager();
        Arrays.sort(students, studentComparator);
        displayAllStudent();
    }

    public void addStudent(Scanner scanner) {
        scanner.nextLine();
        System.out.println("Nhập tên : ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi : ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập giới tính: ");
        String gender = scanner.nextLine();
        System.out.println("Nhập địa chỉ: ");
        String address = scanner.nextLine();
        System.out.println("Nhập điểm số trung bình: ");
        double average = scanner.nextDouble();
        Student student = new Student(name, age, gender, address, average);
        students[index] = student;
        index++;
    }

    public void editStudent(int id, Scanner scanner) {
        int choose;
        boolean check = false;
        for (Student student : students) {
            if (student.getId() == id) {
                check = true;
                System.out.println("< Chọn trường muốn sửa >");
                System.out.println("1. Sửa tên ");
                System.out.println("2. Sửa tuổi");
                System.out.println("3. Sửa giới tính");
                System.out.println("4. Sửa địa chỉ");
                System.out.println("5. Sửa điểm TB ");
                System.out.println("0. Quay lại");
                choose = scanner.nextInt();
                switch (choose) {
                    case 1:
                        System.out.println("Nhập tên muốn sửa: ");
                        String name = scanner.nextLine();
                        student.setName(name);
                        break;
                    case 2:
                        System.out.println("Nhập tuổi muốn sửa: ");
                        int age = scanner.nextInt();
                        student.setAge(age);
                        break;
                    case 3:
                        System.out.println("Nhập giới tính muốn sửa: ");
                        String gender = scanner.nextLine();
                        student.setGender(gender);
                        break;
                    case 4:
                        System.out.println("Nhập địa chỉ muốn sửa: ");
                        String address = scanner.nextLine();
                        student.setAddress(address);
                        break;
                    case 5:
                        System.out.println("Nhập số điểm TB muốn sửa: ");
                        double average = scanner.nextDouble();
                        student.setAverageMark(average);
                        break;
                    case 0:
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + choose);
                }
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy id đó !!!");
        }
        System.out.println("-----------------");
    }

    public void updateStudentList() {
        Student[] newStudentList = new Student[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            newStudentList[i] = students[i];
        }
        students = newStudentList;
    }

    public void deleteByName(String name) {
        int count = 0;
        for (Student student : students) {
            if (student.getName().equals(name)) {
                count++;
            }
        }
        Student[] newStudentList = new Student[students.length - count];
        int index = 0;
        for (Student student : students) {
            if (!(student.getName().equals(name))) {
                newStudentList[index] = student;
                index++;
            }
        }
        students = newStudentList;
    }
}
