//Q4)- Write a code to simulate a deadlock in Java

class Resource {
    String name;
    Resource(String name) {
        this.name = name;
    }
}
public class Question4 {
    public static void main(String[] args) {
        Resource res1 = new Resource("Resource 1");
        Resource res2 = new Resource("Resource 2");
        Thread t1 = new Thread(() -> {
            synchronized (res1) {
                System.out.println(Thread.currentThread().getName() + " locked " + res1.name);

                try { Thread.sleep(100); } catch (InterruptedException e) {}

                synchronized (res2) {
                    System.out.println(Thread.currentThread().getName() + " locked " + res2.name);
                }
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (res2) {
                System.out.println(Thread.currentThread().getName() + " locked " + res2.name);

                try { Thread.sleep(100); } catch (InterruptedException e) {}

                synchronized (res1) {
                    System.out.println(Thread.currentThread().getName() + " locked " + res1.name);
                }
            }
        });
        t1.start();
        t2.start();
    }

}
/*
Explanation- In this code, two threads try to lock two resources
but in the opposite order. Thread 1 locks res1 and waits to lock res2
while Thread 2 locks res2 and waits to lock res1. This causes a deadlock because
each thread is holding one resource and waiting for the other
so neither can proceed. As a result the program gets stuck and neither thread can finish its task.*/
