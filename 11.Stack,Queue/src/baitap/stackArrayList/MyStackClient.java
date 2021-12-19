package baitap.stackArrayList;


import java.util.Arrays;

public class MyStackClient {
    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<>();
        Integer[] integers = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(integers));
        System.out.println("Push a[i] into stack");
        for (Integer integer : integers) {
            myStack.push(integer);
        }
        myStack.display();
        System.out.println("Pop out stack");
        for (int i = 0; i < integers.length; i++) {
            integers[i] = myStack.pop();
            myStack.display();
        }
        System.out.println("Array when reverse");
        System.out.println(Arrays.toString(integers));
        System.out.println("------------------------");
        MyStack<String> stringMyStack = new MyStack<>();
        String string = "Welcome to My Stack";
        String[] strings = string.split("\\s");
        System.out.println("String Array is:");
        for (String s : strings) {
            System.out.print(s + "\t");
        }
        System.out.println();
        System.out.println("Push into stack");
        for (String s : strings) {
            stringMyStack.push(s);
            stringMyStack.display();
        }
        System.out.println("================");
        System.out.println("Pop out stack");
        for (int i = 0; i < strings.length; i++) {
            strings[i] = stringMyStack.pop();
            stringMyStack.display();
        }

        System.out.println("After Reverse String Array is:");
        for (String s : strings) {
            System.out.print(s + "\t");
        }
    }
}