package baitap.bai1;

public class NumberGenerator implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            System.out.println("i= "+ i + ", hashcode= "+  hashCode());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
