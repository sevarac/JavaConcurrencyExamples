package basics;

/**
 *This example demostrates order of execution of two threads
 */
public class TwoCounters {
    
    public static void main(String[] args) {
        Thread t1 = new Thread(new RunnableCounter(100), "t1");
        Thread t2 = new Thread(new RunnableCounter(100), "t2");
        
        t1.start();
        t2.start();
    }
    
}