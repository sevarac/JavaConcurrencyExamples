package basics;

public class RunnableSharedCounter implements Runnable {

    SharedCounter counter;
    int limit;

    public RunnableSharedCounter(SharedCounter counter, int limit) {
        this.counter = counter;
        this.limit = limit;
    }

    @Override
    public void run() {
        while(counter.getValue() < limit) {
            counter.incValue();
        }
    }

}