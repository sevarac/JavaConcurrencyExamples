package basics;

/**
 *This example demostrates order of execution (thread scheduling) of two threads counting up to 100.
 */
public class TwoCounters {
    
    public static void main(String[] args) {
        Thread t1 = new Thread(new RunnableCounter(100), "First Thread");
        Thread t2 = new Thread(new RunnableCounter(100), "SECOND THREAD");
        
        t1.start();
        t2.start();
    }
    
}