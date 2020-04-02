package BlockingQueue;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BlockingQueue<T> {

    private List<T> queue = new LinkedList<>();
    private int size = 10;

    public BlockingQueue(int size) {
        this.size = size;
    }

    public synchronized void put(T item) {
        while (queue.size() == this.size) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(BlockingQueue.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (queue.isEmpty()) {
            notifyAll();
        }
        queue.add(item);
    }

    public synchronized T take() {
        while (queue.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(BlockingQueue.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (queue.size() == this.size) {
            notifyAll();
        }

        return this.queue.remove(0);
    }

}
