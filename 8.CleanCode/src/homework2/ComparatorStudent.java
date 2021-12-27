package homework2;

import java.util.Comparator;

public class ComparatorStudent implements Comparator<Student> {

    public ComparatorStudent() {
    }

    @Override
    public int compare(Student o1, Student o2) {
        if (o1 != null && o2 != null) {
            if (o1.getAverageMark() > o2.getAverageMark()) {
                return -1;
            } else if (o1.getAverageMark() < o2.getAverageMark()) {
                return 1;
            } else {
                return 0;
            }
        }
        return 0;
    }
}
