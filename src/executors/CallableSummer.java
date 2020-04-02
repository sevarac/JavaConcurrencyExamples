package executors;

import basics.*;
import java.util.concurrent.Callable;

public class CallableSummer implements Callable<Integer>  {

    int limit, sum;

    public CallableSummer(int limit) {
        this.limit = limit;
    }
   
    @Override
    public Integer call() {
        int counter=0;
        sum=0;
        while(counter<limit) {
            counter++;
            System.out.println(Thread.currentThread().getName() +": "+  counter);
            sum += counter;
        }
        return sum;
    }
    
}
