package bai3thuviensach.controller;

import bai3thuviensach.model.Student;
import iostream.IOStream;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentManager implements Serializable {
    IOStream<List<Student>> fileStreamStudent;
    List<Student> listStudent;
    {
        try {
            File fileStudent = new File("src/bai3thuviensach/file/Student.txt");
            if(!fileStudent.exists()) {
                fileStudent.createNewFile();
            }
            fileStreamStudent = new IOStream<>(fileStudent);
            if(fileStudent.length() > 0) {
                listStudent = fileStreamStudent.readData();
            } else {
                listStudent = new ArrayList<>();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    Scanner scanner = new Scanner(System.in);

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
                    return null;
                }
            }
            student = new Student(name, id, date, clazz);
            listStudent.add(student);
            fileStreamStudent.saveData(listStudent);
        } catch (Exception e) {
            System.err.println(e.getMessage());
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
