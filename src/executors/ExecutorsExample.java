package executors;

import basics.RunnableCounter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Zoran
 */
public class ExecutorsExample {
    public static void main(String[] args) {        
        ExecutorService es = Executors.newFixedThreadPool(4);
        // ExecutorService es = Executors.newCachedThreadPool();        
        es.submit(new RunnableCounter(100));        
        es.shutdown();                
    }
}
