package thuchanh.stackUsingArray;

public class MyStack {
    private int arr[];
    private int size;
    private int index = 0;

    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
    }

    public int size() {
        return index;
    }

    public void push(int element) {
        if (isFull()) {
            throw new StackOverflowError("Stack is Full");
        }
        arr[index] = element;
        index++;
    }

    public int pop() throws Exception{
        if(isEmpty()) {
            throw new Exception("Stack is null");
        }
        return arr[--index];
    }

    public boolean isFull() {
        return index >= size;
    }

    public boolean isEmpty() {
        return index == 0;
    }
}
