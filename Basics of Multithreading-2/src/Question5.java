//Q5)- WAP to showcase the difference between shutdown() and shutdownNow().

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " completed");
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted");
        }
    }
}
public class Question5 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor1 = Executors.newFixedThreadPool(2);
        System.out.println("Using shutdown():");
        for (int i = 0; i < 3; i++) {
            executor1.submit(new Task());
        }
        executor1.shutdown(); // Allows running tasks to complete
        Thread.sleep(2000); // Wait to observe behavior
        ExecutorService executor2 = Executors.newFixedThreadPool(2);
        System.out.println("\nUsing shutdownNow():");
        for (int i = 0; i < 3; i++) {
            executor2.submit(new Task());
        }
        executor2.shutdownNow(); // Attempts to stop all tasks immediately
    }
}

/*Explanation- shutdown() initiates a graceful shutdown, allowing all running and pending tasks to complete while rejecting new tasks
On the other hand, shutdownNow() immediately stops all tasks, interrupts running tasks, and returns pending tasks as a list,
 Use shutdown() for controlled exits and shutdownNow() for emergency stops*/
