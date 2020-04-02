package basics;

/**
 * Primer koriscenja programske niti koja nasledjuje klasu Thread.
 */
public class BasicCounterThreads {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new CounterThread(10);
        thread.start();

        System.out.println("Done!");
    }

}
