package basics;

/**
 * Ovaj primer demosntrira kreiranje threadova pomocu Runnable interfejsa i
 * osnovnu sinhronizaciju pomocu join metode.
 *
 * @author Zoran
 */
public class BasicRunnableThreads {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new RunnableCounter(10));    // kreiramo thread
        thread.start();
        thread.join();
        System.out.println("Pozdrav iz glavnog threada nakon sto je brojac zavrsio!");
    }
}
