package forkjoin;

import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;


public class ForkJoinDemo {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int[] numbers = new int[10000];
        Random random= new Random();
        for(int i=0; i<10000; i++) {
            numbers[i] = random.nextInt(100000);
        }
                   
        ForkJoinPool pool =  ForkJoinPool.commonPool();
//        ForkJoinPool pool = new ForkJoinPool(4);        
        RecursiveSummer summer = new RecursiveSummer(numbers, 0, 10000);
        pool.execute(summer);
        pool.shutdown();
        
        Integer result = summer.join();
        
        
    }
    
}
