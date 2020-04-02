package basics;

/**
 * Thread safe shared counter using synchronized methods.
 * Test how the example works without synchronized keyword.
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