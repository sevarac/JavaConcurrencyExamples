/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlockingQueue;

/**
 *
 * @author Zoran
 */
public class BlockingQueueExample {
    
    public static void main(String[] args) {
        BlockingQueue queue = new BlockingQueue(5);
        
        (new Thread(new Producer(queue))).start();
        (new Thread(new Consumer(queue))).start();
    }
}
