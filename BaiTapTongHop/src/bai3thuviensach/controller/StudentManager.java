package bai3thuviensach.controller;

import bai3thuviensach.model.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    List<Student> listStudent = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Student createStudent() {
        Student student= null;
        try {
            System.out.println("Nhập tên sinh viên");
            String name = scanner.nextLine();
            System.out.println("Nhập mã sinh viên");
            String id = scanner.nextLine();
            System.out.println("Nhập ngày/tháng/năm sinh");
            String date = scanner.nextLine();
            System.out.println("Nhập tên lớp");
            String clazz = scanner.nextLine();
            for (Student s : listStudent) {
                if (s.getId().equals(id)) {
                    System.out.println("Trùng mã sinh viên, nhập lại !");
                    return null;
                }
            }
            student = new Student(name, id, date, clazz);
            listStudent.add(student);
        } catch (Exception e) {
            System.err.println("Nhập sai kiểu dữ liệu");
            createStudent();
        }
        return student;
    }

    public Student deleteStudent(String id) {
        Student student = null;
        for (Student st : listStudent) {
            if (st.getId().equalsIgnoreCase(id)) {
                student = st;
            }
        }
        if (student != null) {
            listStudent.remove(student);
        }
        return student;
    }

    public Student searchById(String id) {
        Student student = null;
        for (Student st : listStudent) {
            if (st.getId().equalsIgnoreCase(id)) {
                student = st;
            }
        }
        if (student == null) {
            System.out.println("Sinh viên ko tồn tại");
        }
        return student;
    }

    public void displayList() {
        Iterator<Student> iterator = listStudent.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
