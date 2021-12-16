package baitap;


import java.util.Arrays;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> lists = new MyList<>();
        lists.add(0,5);
        lists.add(0,4);
        lists.add(0,3);
        lists.add(0,2);
        lists.add(0, 1);
        lists.display();
        System.out.println(lists.get(2));
        System.out.println("-----------------------");
        System.out.println(lists.remove(2));
        lists.display();
        System.out.println(Arrays.toString(lists.clone()));
        System.out.println(lists.contains(4));
        System.out.println("------------");
        System.out.println(lists.indexOf(6));

        lists.clear();
        lists.display();
    }
}