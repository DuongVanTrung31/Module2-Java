package model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class StudentManger implements Manager<Student> {
    private ArrayList<Student> students;

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public StudentManger(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public void dislay() {
        for (Student student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
        System.out.println("---------------");
    }

    @Override
    public void add(Student student) {
        students.add(student);
        System.out.println("Thêm thành công");
    }

    @Override
    public void searchById(int id) {
        boolean check = false;
        for (Student student : students) {
            if (student != null && student.getId() == id) {
                check = true;
                System.out.println(student);
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy sinh viên vào trùng với id đó!!");
        }
        System.out.println("-------------");
    }

    @Override
    public void removeById(int id) {
        students.removeIf(student -> student != null && student.getId() == id);
    }

    @Override
    public void editById(int id, Scanner scanner) {
        boolean check = false;
        for (Student student : students) {
            if (student != null && student.getId() == id){
                check = true;
                System.out.println("Sửa tên");
                String name1 = scanner.nextLine();
                student.setName(name1);
                System.out.println("Sửa tuổi");
                int age1 = scanner.nextInt();
                student.setAge(age1);
                double avg1 = scanner.nextDouble();
                student.setAverageMark(avg1);
            }
        }
        if(!check) {
            System.out.println("ko tìm thấy mã id đó!!!");
        }
    }

    @Override
    public void sortByAvgMark() {

        AgitrrayList.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAverageMark() > o2.getAverageMark() ? 1 : -1;
            }
        });
    }

    @Override
    public double sumAvgMark() {
        double sum = 0;
        for (Student student: students) {
            sum += student.getAverageMark();
        }
        return sum;
    }
}
