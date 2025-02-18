//Q1) Create and Run a Thread using Runnable Interface and Thread class
// and show usage of sleep and join methods in the created threads.

class ThreadFromInterface implements Runnable{
      public void run(){
          System.out.println(Thread.currentThread().getName() + " (Runnable) started.");
          try {
              Thread.sleep(2000);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
          System.out.println(Thread.currentThread().getName() + " (From Runnable) finished.");
      }
}
class ThreadFromClass extends Thread{
    public void run() {
        System.out.println(Thread.currentThread().getName() + " (From Thread Class) started.");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " (From Thread Class) finished.");
    }


    }

public class Question1 {
    public static void main(String[] args) {
        ThreadFromInterface runnable= new ThreadFromInterface();
         Thread t1 = new Thread(runnable, "Thread1") ;

         ThreadFromClass t2=new ThreadFromClass();
         t2.setName("Thread2");
         t1.start();
         t2.start();

        try {
         t1.join();
         t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread finished.");


    }
}
