package consumerproducer2;

class Producer extends Thread {
   private final SharedData sharedData;
   private final int prodNum;
   
   public Producer(SharedData sd, int prodNum) {
      sharedData = sd;
      this.prodNum = prodNum;
   }
   @Override
   public void run() {
      for (int i = 0; i < 10; i++) {
         sharedData.put(i);
         System.out.println("Producer #" + this.prodNum + " put: " + i);
         try {
            sleep((int)(Math.random() * 100));
         } catch (InterruptedException e) { }
      }
   }
}