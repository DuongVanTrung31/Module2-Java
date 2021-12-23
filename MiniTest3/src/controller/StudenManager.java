package controller;

import model.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudenManager {
    private ArrayList<Student> studentList;
    Scanner scanner = new Scanner(System.in);

    public StudenManager(ArrayList<Student> list) {
        studentList = list;
    }

    public void addStudent() {
        studentList.add(createStudent());
    }

    public Student updateStudent(int id) {
        Student studentUpdate = null;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id) {
                studentUpdate = studentList.get(i);
            }
        }
        if(studentUpdate != null) {
            System.out.println("Nhập vào tên mới");
            studentUpdate.setName(scanner.nextLine());
            System.out.println("Nhập vào tuổi mới");
            studentUpdate.setAge(scanner.nextInt());
            System.out.println("Nhập điểm Toán mới");
            studentUpdate.setPointMath(scanner.nextDouble());
            System.out.println("Nhập điểm Lý mới");
            studentUpdate.setPointPhysical(scanner.nextDouble());
            System.out.println("Nhập điểm Hóa mới");
            studentUpdate.setPointChemistry(scanner.nextDouble());
        }
        return studentUpdate;
    }

    public Student remove(int id) {
        Student studentRemove = null;
        for (Student s : studentList) {
            if (s.getId() == id) {
                studentRemove = s;
            }
        }
        studentList.remove(studentRemove);
        return studentRemove;
    }

    public Student findById(int id) {
        Student studentFind = null;
        for (Student s : studentList) {
            if (s.getId() == id) {
                studentFind = s;
            }
        }
        return studentFind;
    }

    public void sortByAVGMark() {
        studentList.sort(((o1, o2) -> (int) (o1.AVGMark() - o2.AVGMark())));
    }

    public Student findByAVGMark() {
        double max = 0;
        Student studentMaximum = null;
        for (Student student : studentList) {
            if (student.AVGMark() > max) {
                max = student.AVGMark();
                studentMaximum = student;
            }
        }
        for (Student s:studentList) {
            if(s.AVGMark() == max) {
                System.out.println(s);
            }
        }
        return studentMaximum;
    }

    public void displayAll() {
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public Student createStudent() {
        System.out.println("Nhập tên học sinh");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi");
        int age = scanner.nextInt();
        System.out.println("Nhập điểm Toán");
        double math = scanner.nextDouble();
        System.out.println("Nhập điểm Lý");
        double physics = scanner.nextDouble();
        System.out.println("Nhập điểm Hóa");
        double chem = scanner.nextDouble();
        Student student = new Student(name, age, math, physics, chem);
        return student;
    }
}
