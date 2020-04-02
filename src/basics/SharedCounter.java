package basics;

/**
 * Thread safe counter using synchronized methods
 */
public class SharedCounter {
    int value=0;

    public synchronized void incValue() {
        value++;
        System.out.println( Thread.currentThread().getName()+ ": " +value);
    }

    public synchronized int getValue() {
        return value;
    }

}