package baitap.stackArrayList;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack<T> {
    private ArrayList<T> stack;

    public MyStack() {
        stack = new ArrayList<T>();
    }

    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }

    public void push(T t) {
        stack.add(stack.size(),t);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.remove(stack.size()-1);
    }

    public void display() {
        for (T t: stack) {
            System.out.printf("%s->", t);
        }
        System.out.println();
    }
}
