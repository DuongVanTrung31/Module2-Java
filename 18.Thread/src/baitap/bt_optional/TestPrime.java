package baitap.bt_optional;

public class TestPrime {
    public static void main(String[] args) {
        LazyPrimeFactorization lazy = new LazyPrimeFactorization();
        OptimizedPrimeFactorization optimized = new OptimizedPrimeFactorization();
        Thread thread1 = new Thread(lazy);
        Thread thread2 = new Thread(optimized);
        thread1.start();
        thread2.start();
    }
}
