package basics;

public class RunnableCounter implements Runnable  {

    int counter, limit;

    public RunnableCounter(int limit) {
        this.limit = limit;
    }
   
    @Override
    public void run() {
        counter=0;
        while(counter<limit) {
            counter++;
            System.out.println(Thread.currentThread().getName() +": "+  counter);
        }
    }
    
}
