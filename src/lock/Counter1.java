package lock;

public class Counter1 {

    private int count = 0;

    public int inc() {
        synchronized (this) {
            return ++count;
        }
    }
}
