package bai3thuviensach.controller;

import bai3thuviensach.model.Student;
import iostream.IOStream;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    List<Student> listStudent;
    File fileStudent = new File("src/bai3thuviensach/file/Student.txt");
    IOStream<List<Student>> fileStreamStudent = new IOStream<>(fileStudent);
    Scanner scanner = new Scanner(System.in);

    public StudentManager() {
        if (fileStudent.length() == 0) {
            listStudent = new ArrayList<>();
        } else {
            listStudent = fileStreamStudent.readData();
        }
    }


    public Student createStudent() {
        Student student = null;
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
                    System.err.println("Trùng mã sinh viên, nhập lại !");
                    return createStudent();
                }
            }
            student = new Student(name, id, date, clazz);
            listStudent.add(student);
            fileStreamStudent.saveData(listStudent);
        } catch (Exception e) {
            System.err.println(e.getMessage());
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
            fileStreamStudent.saveData(listStudent);
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
        return student;
    }

    public void displayList() {
        Iterator<Student> iterator = listStudent.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
