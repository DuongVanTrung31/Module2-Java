package baitap.bt_optional;

public class OptimizedPrimeFactorization implements Runnable{
    @Override
    public void run() {
        int num = 2;
        while (num < 100) {
            boolean check = false;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if(num % i == 0 ) {
                    check = true;
                    break;
                }
            }
            if(!check){
                System.out.println("Op: "+num);
            }
            num++;
        }
    }
}
