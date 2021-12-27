package homework2;

public class ComparableStudent extends Student implements Comparable<ComparableStudent> {

    public ComparableStudent() {
    }

    public ComparableStudent(String name, int age, String gender, String address, double averageMark, int idStudent) {
        super(name, age, gender, address, averageMark, idStudent);
    }

    @Override
    public int compareTo(ComparableStudent o) {
        if (o !=null){
            if (getAverageMark() > o.getAverageMark()){
                return -1;
            } else if (getAverageMark() < o.getAverageMark()){
                return 1;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }
}
