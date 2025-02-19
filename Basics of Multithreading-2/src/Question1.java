// Q1)-WAP to show usage of Callable and demonstrate how it is different from Runnable
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Question1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Using Runnable (no return value, cannot throw checked exception)
        Runnable runnableTask = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable task executed.");
            }
        };
        executor.submit(runnableTask);

        // Using Callable (returns a value, can throw checked exception)
        Callable<String> callableTask = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Callable task executed.";
            }
        };
        Future<String> future = executor.submit(callableTask);
        System.out.println(future.get()); // Get the result of Callable

        executor.shutdown();
    }
}
/*Runnable: Implements run() method, returns void, and cannot throw checked exceptions.
Callable: Implements call() method, returns a value (Future<T>), and can throw checked exceptions.*/
