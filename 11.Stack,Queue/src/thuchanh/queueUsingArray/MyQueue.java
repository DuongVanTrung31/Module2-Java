package thuchanh.queueUsingArray;

public class MyQueue {
    private int capacity;
    private int queueArray[];
    private int head = 0;
    private int tail = -1;
    private int currSize = 0;

    public MyQueue(int size) {
        this.capacity = size;
        queueArray = new int[this.capacity];
    }

    public boolean isQueueEmpty() {
        return currSize == 0;
    }

    public boolean isQueueFull() {
        return currSize == capacity;
    }

    public void enqueue(int item) {
        if (isQueueFull()) {
            System.out.println("Overflow ! Unable to add element: " + item);
        } else {
            tail++;
            if (tail == capacity - 1) {
                tail = 0;
            }
            queueArray[tail] = item;
            currSize++;
            System.out.println("Element " + item + " is pushed to Queue !");
        }
    }

    public void dequeue() {
        if(isQueueEmpty()) {
            System.out.println("Underflow ! Unable to remove element from Queue");
        } else {
            head++;
            if(head == capacity-1) {
                System.out.println("Pop operation done! removed: " + queueArray[head -1]);
                head = 0;
            } else {
                System.out.println("Pop operation done ! removed: " + queueArray[head - 1]);
            }
            currSize--;
        }
    }
}
