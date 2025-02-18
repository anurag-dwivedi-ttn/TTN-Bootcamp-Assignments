/*
Q2)- Use Synchronize method and synchronize block to enable synchronization
between multiple threads trying to access method at same time.
*/

class Counter {
    private int count = 0;

    // Synchronized Method
    public synchronized void incrementUsingMethod() {
        count++; // critical section
    }

    // Synchronized Block
    public void incrementUsingBlock() {
        synchronized (this) { // Locks only this part
            count++; // critical section
        }
    }
    public int getCount() {
        return count;
    }
}

class Minethread extends Thread {
    private Counter c;
    private boolean useMethod;

    public Minethread(Counter c, boolean useMethod) {
        this.c = c;
        this.useMethod = useMethod;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            if (useMethod) {
                c.incrementUsingMethod(); // Calls synchronized method
            } else {
                c.incrementUsingBlock(); // Calls synchronized block
            }
        }
    }
}

public class Question2 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter1 = new Counter(); // Shared counter for method sync
        Counter counter2 = new Counter(); // Shared counter for block sync

        // Using synchronized method
        Thread t1 = new Minethread(counter1, true);
        Thread t2 = new Minethread(counter1, true);

        // Using synchronized block
        Thread t3 = new Minethread(counter2, false);
        Thread t4 = new Minethread(counter2, false);

        // Start all threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        // Wait for all threads to finish
        t1.join();
        t2.join();
        t3.join();
        t4.join();

        // Print results
        System.out.println("Final Count (Sync Method): " + counter1.getCount());
        System.out.println("Final Count (Sync Block): " + counter2.getCount());
    }
}

/*Explantaion- synchronized keyword is used for sequential access of the threads. If multiple threads executing in the same critical section
it creates the race condition and we get random output this problem solved by synchronized keyword. For synchronized the whole method it makes our
program less efficient because it is possible that the method contains any other things which don't need to be synchronized so it is better
to use synchronize in blocks.*/
