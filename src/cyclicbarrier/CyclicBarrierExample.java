/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

/**
 *
 * @author Zoran
 */
public class CyclicBarrierExample {

    public static void main(String[] args) {
        Runnable barrier1Action = new Runnable() {
            public void run() {
                System.out.println("BarrierAction 1 executed ");
            }
        };
        Runnable barrier2Action = new Runnable() {
            public void run() {
                System.out.println("BarrierAction 2 executed ");
            }
        };

        CyclicBarrier barrier1 = new CyclicBarrier(2, barrier1Action);
        CyclicBarrier barrier2 = new CyclicBarrier(2, barrier2Action);

        CyclicBarrierRunnable barrierRunnable1
                = new CyclicBarrierRunnable(barrier1, barrier2);

        CyclicBarrierRunnable barrierRunnable2
                = new CyclicBarrierRunnable(barrier1, barrier2);

        new Thread(barrierRunnable1).start();
        new Thread(barrierRunnable2).start();
    }

}
