package baitap.circularQueueLinkedList;

public class Solution<T> {
    public MyQueue<T> myQueue;
    public Solution(){
        myQueue = new MyQueue<T>();
    }
    public Node<T> deQueue() {
        Node<T> node = null;
        if(!isEmpty()){
            node = myQueue.head;
            if(myQueue.head == myQueue.tail) {
                myQueue.head = myQueue.tail = null;
            } else {
                myQueue.head = myQueue.head.next;
                myQueue.tail.next = myQueue.head;
            }
        }
        return node;
    }
    public void enQueue(T data){
        Node<T> node = new Node<>(data);
        if(isEmpty()) {
            myQueue.head = myQueue.tail = node;
        } else {
            myQueue.tail.next = node;
        }
        myQueue.tail = node;
        myQueue.tail.next = myQueue.head;
    }
    public void displayQueue() {
        Node<T> temp = myQueue.head;
        if(!isEmpty()) {
            do {
                System.out.printf("%s<-",temp.data);
                temp = temp.next;
            } while (temp.next != myQueue.head.next);
            System.out.println("\n" + "----------");
        } else {
            System.out.println("Queue is Empty");
        }
    }

    public boolean isEmpty(){
        return myQueue.head == null;
    }
}
