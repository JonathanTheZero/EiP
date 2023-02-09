public class ParallellCalculationVariantA implements Runnable {
    public int zaehler;
    @Override
    public void run() {
        for (int i = 0; i < 10_000_000; i++) {
            ++zaehler;
        }
    }

    public static void main(String[] args) throws InterruptedException {
       ParallellCalculationVariantA threadCode = new ParallellCalculationVariantA ();
       ParallellCalculationVariantA threadCode2 = new ParallellCalculationVariantA ();

       Thread thread1= new Thread(threadCode);
       Thread thread2= new Thread(threadCode2);

       thread1.start();

       thread1.join();
       thread2.join();

       System.out.println(threadCode.zaehler + threadCode2.zaehler);
    }
}