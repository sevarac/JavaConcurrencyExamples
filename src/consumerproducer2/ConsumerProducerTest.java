package consumerproducer2;

public class ConsumerProducerTest {
   public static void main(String[] args) {
      SharedData sharedData = new SharedData();
      Producer p1 = new Producer(sharedData, 1);
      Consumer c1 = new Consumer(sharedData, 1);
      p1.start(); 
      c1.start();
   }
}