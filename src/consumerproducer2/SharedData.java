package consumerproducer2;

class SharedData {
   private int contents;
   private boolean available = false;

   public synchronized int get() {
      // ako nema sadrzaja cekaj dok ga ne bude
      while (available == false) {
         try {
            wait();
         } catch (InterruptedException e) {}
      }
      available = false;
      notifyAll();
      return contents;
   }

   public synchronized void put(int value) {
      // ako vec ima sadrzaj cekaj dok se oslobodi
      while (available == true) {
         try {
            wait();
         } catch (InterruptedException e) { }
      }
      contents = value;
      available = true;
      notifyAll();
   }
}