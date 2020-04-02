package basics;

/**
 * This example demonstrates two threads sharing the same data using synchronization mechanism
 * @author Zoran
 */
public class TwoSharedCounterThreads {
    public static void main(String[] args) {
        SharedCounter sharedCounter = new SharedCounter();

        Thread t1 = new Thread(new RunnableSharedCounter(sharedCounter, 65), "t1");
        Thread t2 =  new Thread(new RunnableCounterReader(sharedCounter, 65), "t2");

        t1.start();
        t2.start();

    }
}
