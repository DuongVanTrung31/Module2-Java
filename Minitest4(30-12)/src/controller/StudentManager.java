package controller;

import model.Human;
import model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static final String PATH_NAME = "src/student.csv";
    private ArrayList<Student> listStudent;
    private final Scanner scanner = new Scanner(System.in);

    public StudentManager() {
        this.listStudent = readFile(PATH_NAME);
    }

    public boolean checkAge(int age) {
        return (age >= 18 && age <= 60);
    }

    public boolean checkPoint(double point) {
        return point >= 0 && point <= 10;
    }

    public void displayAllStudent() {
        listStudent.forEach(System.out::println);
    }

    public void addStudent() {
        System.out.println("Input name: ");
        String name = scanner.nextLine();
        System.out.println("Input age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Input math point");
        double pointMath = Double.parseDouble(scanner.nextLine());
        System.out.println("Input physical point");
        double pointPhy = Double.parseDouble(scanner.nextLine());
        System.out.println("Input chemical point");
        double pointChem = Double.parseDouble(scanner.nextLine());
        if (checkAge(age) && checkPoint(pointMath) && checkPoint(pointChem) && checkPoint(pointPhy)) {
            listStudent.add(new Student(name, age, pointMath, pointPhy, pointChem));
            writeFile(listStudent,PATH_NAME);
            System.out.println("Add student have name = " + name + " successfully!");
        } else {
            System.out.println("Data entry error, please check again!!!");
        }
    }

    public Student editStudent(int id) {
        Student editStudent = null;
        for (Student s : listStudent) {
            if (s.getId() == id) {
                editStudent = s;
            }
        }
        if (editStudent != null) {
            int index = listStudent.indexOf(editStudent);
            System.out.println("Input new name: ");
            editStudent.setName(scanner.nextLine());
            System.out.println("Input new age: ");
            editStudent.setAge(Integer.parseInt(scanner.nextLine()));
            System.out.println("Input new math point");
            editStudent.setPointMath(Double.parseDouble(scanner.nextLine()));
            System.out.println("Input new physical point");
            editStudent.setPointPhysical(Double.parseDouble(scanner.nextLine()));
            System.out.println("Input new chemical point");
            editStudent.setPointChemistry(Double.parseDouble(scanner.nextLine()));
            if (checkAge(editStudent.getAge()) &&
                    checkPoint(editStudent.getPointMath()) &&
                    checkPoint(editStudent.getPointPhysical()) &&
                    checkPoint(editStudent.getPointChemistry())) {
                listStudent.set(index, editStudent);
                writeFile(listStudent,PATH_NAME);
                System.out.println("Update student have name = " + editStudent.getName() + " successfully!");
            } else {
                System.out.println("Data entry error, please check again!!!");
            }
        }
        return editStudent;
    }

    public Student deleteStudent(int id) {
        Student studentDel = null;
        for (Student s:listStudent) {
            if (s.getId() == id) {
                studentDel = s;
            }
        }
        if(studentDel != null) {
            listStudent.remove(studentDel);
            writeFile(listStudent,PATH_NAME);
            System.out.println("Delete student have name = " + studentDel.getName() + " successfully!");
        }
        return studentDel;
    }

    public Student findStudent(int id) {
        Student studentFind = null;
        for (Student s : listStudent) {
            if (s.getId() == id) {
                studentFind = s;
            }
        }
        return studentFind;
    }
    public void sortStudentInsert() {
        listStudent.sort((o1, o2) -> o1.avgPoint() > o2.avgPoint() ? 1: -1);
        listStudent.forEach(System.out::println);
    }

    public void sortStudentDec() {
        listStudent.sort((o1, o2) -> o1.avgPoint() < o2.avgPoint() ? 1: -1);
        listStudent.forEach(System.out::println);
    }

    public ArrayList<Student> findMaxPoint () {
        ArrayList<Student> studentsBest = null;
        double max = 0;
        for (Student s:listStudent) {
            if(s.avgPoint() > max){
                max = s.avgPoint();
            }
        }
        for (Student s:listStudent) {
            if(s.avgPoint() == max) {
                studentsBest.add(s);
            }
        }
        return studentsBest;
    }


    public void writeFile(ArrayList<Student> students, String path){
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
            for (Student student : students) {
                bufferedWriter.write(student.getId()+ "," + student.getName() + "," + student.getAge() + ","
                        + student.getPointMath() + "," + student.getPointPhysical() + "," + student.getPointChemistry() +"\n");
            }
            bufferedWriter.close();
            System.out.println("Write file successfully!");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }


    public ArrayList<Student> readFile(String path) {
        ArrayList<Student> students = new ArrayList<>();
        File file = new File(PATH_NAME);

        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                students.add(new Student(strings[1], Integer.parseInt(strings[2]), Double.parseDouble(strings[3]),  Double.parseDouble(strings[4]), Double.parseDouble(strings[5])));
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        Human.setVALUE(students.size());
        return students;
    }
}

