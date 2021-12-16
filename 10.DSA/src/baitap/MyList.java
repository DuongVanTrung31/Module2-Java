package baitap;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(int index, E element) {
        if (size > elements.length) {
            ensureCapa();
        }
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("eror");
        } else {
            size++;
            for (int i = size; i > index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
        }
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ",Size " + i);
        }
        return (E) elements[i];
    }

    public E remove(int index) {
        E result;
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        } else {
            result = (E) elements[index];
            for (int i = index; i < size; i++) {
                elements[i] = elements[i + 1];
            }
            size--;
        }
        return result;
    }

    public int size() {
        return size;
    }

    public void display() {
        for (Object o : elements) {
            if (o != null)
                System.out.println(o);
        }
    }

    public E[] clone() {
        E[] arrayNew = Arrays.copyOf((E[])elements, size);
        return arrayNew;
    }

    public boolean contains(E e) {
        for (Object o: elements) {
            if (o.equals(e)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if(elements[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }
    public boolean add(E e) {
        return size < elements.length;
    }

    public void clear() {
        elements = new Object[DEFAULT_CAPACITY];
    }
}
