package lock;

/**
 * http://tutorials.jenkov.com/java-concurrency/locks.html
 */
public class Lock {

    private boolean isLocked = false;

    public synchronized void lock()
            throws InterruptedException {
        while (isLocked) {
            wait();
        }
        isLocked = true;
    }

    public synchronized void unlock() {
        isLocked = false;
        notify();
    }
}
