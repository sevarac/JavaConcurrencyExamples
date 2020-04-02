/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package executors;

import basics.RunnableCounter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Zoran
 */
public class ExecutorExample2 {
    
    public static void main(String[] args) throws ExecutionException {
        
        List<Callable<Integer>> counters = new ArrayList<>();
        for(int i=0; i<10; i++)
            counters.add(new CallableSummer((int)(Math.random() * 100)));
        
        int cpus = Runtime.getRuntime().availableProcessors();
        System.out.println("CPUs:"+cpus);
        
        ExecutorService es = Executors.newFixedThreadPool(cpus-1);
        try {
            List<Future<Integer>> results = es.invokeAll(counters);
            
            for(Future<Integer> f : results)
                System.out.println("Sum: "+f.get());
            
        } catch (InterruptedException ex) {
            Logger.getLogger(ExecutorExample2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        es.shutdown();     
    }

}
