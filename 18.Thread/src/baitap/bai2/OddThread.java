package baitap.bai2;

public class OddThread extends Thread{

    @Override
    public void run() {
        for (int i = 1; i < 11; i+=2) {
            System.out.println("Lẻ: "+i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
