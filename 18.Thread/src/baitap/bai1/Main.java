package baitap.bai1;

public class Main {
    public static void main(String[] args) {
        NumberGenerator num1 = new NumberGenerator();
        NumberGenerator num2 = new NumberGenerator();

        Thread thread1 = new Thread(num1);
        Thread thread2 = new Thread(num2);
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);
        thread1.start();
        thread2.start();
    }
}
