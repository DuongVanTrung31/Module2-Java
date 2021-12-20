package thuchanh.comparableandcomparator;

import thuchanh.hashmapandhashset.Student;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge() > o2.getAge() ? 1 :-1;
    }
}
