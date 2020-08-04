package BlockingQueue;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        BlockingQueue<Integer> queue = new SynchronousQueue<>();
        Runnable consumer = () -> {
            for (int i = 0; i < 3; i++) {
                try {
                    System.out.println("consumer is working");
                    Thread.sleep(10000);
                    System.out.println(queue.take());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable producer = ()-> {
            for (int i = 0; i < 3; i++) {
                try {
                    System.out.println("producer sleep");
                    Thread.sleep(1000);
                    System.out.println("producer put");
                    queue.put(i);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        new Thread(producer).start();
        new Thread(consumer).start();
        System.out.println("THE END");
    }
}
