// Q3)-WAP to showcase the usage of volatile in java.

class Shared {
    volatile boolean running = true; //
}
public class Question3 {
    public static void main(String[] args) throws InterruptedException {
        Shared shared = new Shared();
        Thread t = new Thread(() -> {
            System.out.println("Thread started...");
            while (shared.running); // May keep running indefinitely!
            System.out.println("Thread stopped.");
        });
        t.start();
        Thread.sleep(2000);
        shared.running = false; //

        t.join();
        System.out.println("Main thread exits.");
    }
}
/*In this code there’s a flag running shared between two threads.
The worker thread keeps checking this flag in a loop. After 2 seconds
the main thread sets the flag to false and because the flag is marked as volatile
the worker thread immediately sees the change and stops. Without volatile the worker thread
might never see the updated flag and keep running forever.*/
