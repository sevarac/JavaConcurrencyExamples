package basics;

/**
 * Shared counter reader thread.
 * 
 * @author Zoran
 */
public class RunnableCounterReader implements Runnable {
    
    SharedCounter counter;

    int limit;
    
    public RunnableCounterReader(SharedCounter counter, int limit) {
        this.counter = counter;
        this.limit = limit;
    }
    
    @Override
    public void run() {
        while(counter.getValue() < limit) {
           // System.out.println(counter.getValue());
            System.out.println( Thread.currentThread().getName()+ ": " +counter.getValue());
        }
    }    
    
}
