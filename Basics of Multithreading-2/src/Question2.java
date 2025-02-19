/*Q2)-Improve the code written in Basics of Multi Threading Part 1 exercise question 4
        to handle the deadlock using reentract lock.*/
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Resource {
    String name;
    Lock lock = new ReentrantLock();

    Resource(String name) {
        this.name = name;
    }
}
public class Question2 {
    public static void main(String[] args) {
        Resource res1 = new Resource("Resource 1");
        Resource res2 = new Resource("Resource 2");

        Runnable task1 = () -> {
            boolean res1Locked = false;
            boolean res2Locked = false;
            try {
                res1Locked = res1.lock.tryLock();
                res2Locked = res2.lock.tryLock();

                if (res1Locked && res2Locked) {
                    System.out.println(Thread.currentThread().getName() + " locked " + res1.name);
                    System.out.println(Thread.currentThread().getName() + " locked " + res2.name);
                }
            } finally {
                if (res1Locked) res1.lock.unlock();
                if (res2Locked) res2.lock.unlock();
            }
        };

        Runnable task2 = () -> {
            boolean res1Locked = false;
            boolean res2Locked = false;
            try {
                res2Locked = res2.lock.tryLock();
                res1Locked = res1.lock.tryLock();

                if (res2Locked && res1Locked) {
                    System.out.println(Thread.currentThread().getName() + " locked " + res2.name);
                    System.out.println(Thread.currentThread().getName() + " locked " + res1.name);
                }
            } finally {
                if (res2Locked) res2.lock.unlock();
                if (res1Locked) res1.lock.unlock();
            }
        };
        new Thread(task1).start();
        new Thread(task2).start();
    }
}
//Explanation- In Reentract lock a thread acquire a lock multiple times and also have to unlock the lock same number of times
