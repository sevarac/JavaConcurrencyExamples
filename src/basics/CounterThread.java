package basics;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Kreiranje programske niti nasledjivanjem klase Thread i redefinisanjem metode run.
 * Nit ispisuje brojeve od 1 do vrednosti limit koja se zadaje prilikom kreiranja niti,
 * i pravi pauzu slucajne duzine izmdju dva ispisa.
 * 
 * @author Zoran Sevarac
 */
public class CounterThread extends Thread {

    int limit;

    public CounterThread(int limit) {
        this.limit = limit;
    }

    @Override
    public void run() {
        System.out.println("Counting at thread: "+Thread.currentThread().getName());
        for(int i=0; i<limit; i++) {
            try {
                int time = (int)(Math.random() * 1000);
                System.out.println("Processing item " + i + " took "+ time + " ms");
                Thread.sleep(time);
            } catch (InterruptedException ex) {
                Logger.getLogger(CounterThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }



}
