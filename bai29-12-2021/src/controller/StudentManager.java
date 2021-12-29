package controller;

import model.Student;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    private List<Student> studentList;
    Scanner scanner = new Scanner(System.in);

    public StudentManager() {
        this.studentList = new ArrayList<>();
    }

    public Student createStudent() {
        Student student;
        System.out.println("Nhập tên học sinh");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi ");
        int age = Integer.parseInt(scanner.nextLine());
        if (age >= 18 && age <= 60) {
            System.out.println("Nhập giới tính");
            int choice = Integer.parseInt(scanner.nextLine());
            String gender = "";
            switch (choice) {
                case 1:
                    gender = "Male";
                    break;
                case 2:
                    gender = "Female";
                    break;
                case 3:
                    gender = "Other";
                    break;
                default:
                    System.err.println("Nhập sai");
                    break;
            }
            System.out.println("Nhập địa chỉ");
            String address = scanner.nextLine();
            System.out.println("Nhập điểm trung bình");
            double point = Double.parseDouble(scanner.nextLine());
            if (point >= 0 && point <= 10) {
                student = new Student(name, age, gender, address, point);
                studentList.add(student);
                return student;
            }
        }
        return null;
    }

    public Student removeStudent(String name) {
        Student student = null;
        for (Student s : studentList) {
            if (s.getName().equalsIgnoreCase(name)) {
                student = s;
            }
        }
        if (student != null) {
            studentList.remove(student);
            System.out.println("xóa thành công");
        }
        return student;
    }

    public void displayAll() {
        studentList.forEach(System.out::println);
    }

    public List<Student> displayPointsUpper() {
        List<Student> newStudentList;
        newStudentList = (List<Student>) studentList.stream().map(student -> student.getPointAverage() >= 7.5);
        newStudentList.forEach(System.out::println);
        return newStudentList;
    }

    public Student updateStudent(String name) {
        Student student = null;
        for (Student s : studentList) {
            if (s.getName().equalsIgnoreCase(name)) {
                student = s;
            }
        }
        int index = studentList.indexOf(student);
        if (student != null) {
            System.out.println("Nhập tên học sinh");
            String name1 = scanner.nextLine();
            System.out.println("Nhập tuổi ");
            int age = Integer.parseInt(scanner.nextLine());
            if (age >= 18 && age <= 60) {
                System.out.println("Nhập giới tính");
                int choice = Integer.parseInt(scanner.nextLine());
                String gender = "";
                switch (choice) {
                    case 1:
                        gender = "Male";
                        break;
                    case 2:
                        gender = "Female";
                        break;
                    case 3:
                        gender = "Other";
                        break;
                    default:
                        System.err.println("Nhập sai");
                        break;
                }
                System.out.println("Nhập địa chỉ");
                String address = scanner.nextLine();
                System.out.println("Nhập điểm trung bình");
                double point = Double.parseDouble(scanner.nextLine());
                if (point >= 0 && point <= 10) {
                    student.setName(name1);
                    student.setAge(age);
                    student.setGender(gender);
                    student.setAddress(address);
                    student.setPointAverage(point);
                    studentList.set(index, student);
                    return student;
                }
            }
        }
        return null;
    }

    public void displayTable() {

    }

    public void write() {
        try (BufferedWriter bufferedWriter =
                     new BufferedWriter(new FileWriter("student.csv"))) {
            StringBuilder sb = new StringBuilder();
            sb.append("Tên,");
            sb.append("tuổi,");
            sb.append("giới tính,");
            sb.append("địa chỉ,");
            sb.append("điểm trung bình");
            sb.append('\n');

            if (studentList.size() > 0) {
                for (Student s :
                        studentList) {
                    sb.append(s.getName());
                    sb.append(',');
                    sb.append(s.getAge());
                    sb.append(',');
                    sb.append(s.getGender());
                    sb.append(',');
                    sb.append(s.getAddress());
                    sb.append(',');
                    sb.append(s.getPointAverage());
                    sb.append('\n');
                }
            }
            bufferedWriter.write(sb.toString());
            System.out.println("Write successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void read() {

    }
}

