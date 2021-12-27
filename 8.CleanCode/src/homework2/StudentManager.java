package homework2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;

public class StudentManager {
    private static final String DIVIDE_SECTION = "----------------";
    private Student[] students;
    private static int index = 0;

    Scanner sc = new Scanner(System.in);

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

    public Student creatNewStudent() {
        System.out.print("Input student name: ");
        String name = sc.nextLine();
        System.out.print("Input student age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Input student gender: ");
        String gender = sc.nextLine();
        System.out.print("Input student address: ");
        String address = sc.nextLine();
        System.out.print("Input student average mark: ");
        double averageMark = sc.nextDouble();
        sc.nextLine();
        int idStudent = Student.idStudentStatic;
        Student student = new Student(name, age, gender, address, averageMark,idStudent);
        Student.idStudentStatic++;
        return student;
    }

    public void createStudentList() {
        students[index] = creatNewStudent();
        index++;
        System.out.println(DIVIDE_SECTION);
    }

    public void displayStudentList() {
        for (Student student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
        System.out.println(DIVIDE_SECTION);
    }

    public void displayHighestMark() {
        double max = students[0].getAverageMark();
        for (Student student : students) {
            if (student != null) {
                if (max < student.getAverageMark()) {
                    max = student.getAverageMark();
                }
            }
        }
        for (Student student : students) {
            if (student != null) {
                if (max == student.getAverageMark()) {
                    System.out.println(student);
                }
            }
        }
        System.out.println(DIVIDE_SECTION);
    }

    public void displayLowestMark() {
        double min = students[0].getAverageMark();
        for (Student student : students) {
            if (student != null) {
                if (min > student.getAverageMark()) {
                    min = student.getAverageMark();
                }
            }
        }
        for (Student student : students) {
            if (student != null) {
                if (min == student.getAverageMark()) {
                    System.out.println(student);
                }
            }
        }
        System.out.println(DIVIDE_SECTION);
    }

    public void deleteStudentByName() {
        System.out.print("Input student name: ");
        String name = sc.nextLine();
        boolean check = false;
//        for (Student student: students) {
//            if (student != null){
//                if (student.getName().equals(name)){
//                    student = null;
//                }
//
//            }
//        }        // Tại sao foreach lại không dùng được ở đây?
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (students[i].getName().equals(name)) {
                    students[i] = null;
                    check = true;
                }
            }
        }
        if (!check){
            System.out.println("Student not on the list");
        }
//        for (Student student : students) {
//            if (student != null) {
//                System.out.println(student);
//            }
//        }
        displayStudentList();
    }

    public void findStudentByName(){
        System.out.print("Input student name: ");
        String name = sc.nextLine();
        boolean check = false;
        for (Student student : students) {
            if (student != null) {
                if (student.getName().equals(name)) {
                    System.out.println(student);
                    check = true;
                }
            }
        }
        if (!check){
            System.out.println("Student not on the list");
        }
        System.out.println(DIVIDE_SECTION);
    }

    public void findStudentByGender(){
        System.out.print("Input student gender: ");
        String gender = sc.nextLine();
        boolean check = true;
        for (Student student : students) {
            if (student != null) {
                if (student.getGender().equals(gender)) {
                    System.out.println(student);
                }
            }
        }
        if (!check){
            System.out.println(gender + " not on the gender data");
        }
        System.out.println(DIVIDE_SECTION);
    }

    public void editStudentByID(){
        System.out.print("Input student ID: ");
        int idStudent = sc.nextInt();
        sc.nextLine();
        boolean check = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null){
                if (students[i].getIdStudent() == idStudent){
                    students[i] = creatNewStudent();
                    students[i].setIdStudent(idStudent);
                    Student.idStudentStatic--;
                }
            }
        }
        if (!check){
            System.out.println("Student ID not on the list");
        }
        displayStudentList();
    }

    public void arrangeStudentListByMark(){
        Comparator<Student> comparator = new ComparatorStudent();
        Arrays.sort(students,comparator);
        displayStudentList();

//        ComparableStudent[] studentsNew = new ComparableStudent[students.length];
//        for (int i = 0; i < studentsNew.length; i++) {
//            studentsNew[i] = (ComparableStudent) students[i];
//        }
//        Arrays.sort(studentsNew);
//        students = studentsNew;
//        displayStudentList();
//        Hỏi thêm về comparable


    }
}
