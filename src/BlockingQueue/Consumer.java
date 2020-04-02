package BlockingQueue;


import consumerproducer.*;
import java.util.Random;

public class Consumer implements Runnable {
    private BlockingQueue<String> queue;

    public Consumer(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        Random random = new Random();
        for (String message = queue.take();
             ! message.equals("DONE");
             message = queue.take()) {
            System.out.format("MESSAGE RECEIVED: %s%n", message);
            try {
                Thread.sleep(random.nextInt(100));
            } catch (InterruptedException e) {}
        }
    }
}
