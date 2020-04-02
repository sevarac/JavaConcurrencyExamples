package forkjoin;

import java.util.concurrent.RecursiveTask;

public class RecursiveSummer extends RecursiveTask<Integer> {

    private final int[] numbers;
    private final int start;
    private final int end;

    public RecursiveSummer(int[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
       if (end-start <2000) {
           int sum = 0;
           for(int i=start; i<end; i++) {
               sum = sum + numbers[i];
           }
           return sum;
       }
       
       int mid = (end - start) / 2;
       
       RecursiveSummer summer1 = new RecursiveSummer(numbers, start, mid);
       summer1.fork();
       RecursiveSummer summer2 = new RecursiveSummer(numbers, mid, end);
       return summer2.compute() + summer1.join();  
    }
    
}
