package baitap;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes;

    private class Node {
        Node next;
        E e;

        public Node(E e) {
            this.e = e;
        }

        public E getE() {
            return e;
        }
    }

    public MyLinkedList(E e) {
        head = new Node(e);
    }


    public void add(int index, E e) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(e);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(int e) {
        Node temp = head;
        head = new Node(temp.e);
        head.next = temp;
        numNodes++;
    }

    public boolean contains(E e) {
        Node temp = head;
        for (int i = 0; i < size(); i++) {
            if (temp.e == e) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(E e) {
        Node temp = head;
        for (int i = 0; i < size(); i++) {
            if (temp.e == e) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public void addLast(E e) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(e);
        numNodes++;
    }

    public void remove(int index) {
        Node temp = head;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        numNodes--;
    }
    public E get(int i){
        Node temp = head;
        for (int j = 0; j < i; j++){
            temp = temp.next;
        }
        return temp.e;
    }

    public E getFirst(){
        return head.e;
    }

    public E getLast(){
        Node temp = head;
        for (int j = 1; j < size(); j++){
            temp = temp.next;
        }
        return temp.e;
    }

    public boolean remove(E e) {
        Node temp = head;
        for (int i = 0; i < size(); i++) {
            if (temp.e == e) {
                remove(i);
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int size() {
        return numNodes;
    }


    public void clear() {
        head = null;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.e + "\t");
            temp = temp.next;
        }
        System.out.println();
    }
}
