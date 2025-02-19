/*Q4)- Use a singleThreadExecutor, newCachedThreadPool() and newFixedThreadPool()
        to submit a list of tasks and wait for completion of all tasks*/

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Question3 {
    public static void main(String[] args) throws InterruptedException {
        List<Callable<String>> tasks = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            int taskNum = i;
            tasks.add(() -> "Task " + taskNum + " completed by " + Thread.currentThread().getName());
        }

        // 1. Single Thread Executor
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        System.out.println("SingleThreadExecutor:");
        for (Future<String> result : singleThreadExecutor.invokeAll(tasks)) {
            try { System.out.println(result.get()); } catch (ExecutionException e) { e.printStackTrace(); }
        }
        singleThreadExecutor.shutdown();

        // 2. Cached Thread Pool
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        System.out.println("\nCachedThreadPool:");
        for (Future<String> result : cachedThreadPool.invokeAll(tasks)) {
            try { System.out.println(result.get()); } catch (ExecutionException e) { e.printStackTrace(); }
        }
        cachedThreadPool.shutdown();

        // 3. Fixed Thread Pool
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
        System.out.println("\nFixedThreadPool:");
        for (Future<String> result : fixedThreadPool.invokeAll(tasks)) {
            try { System.out.println(result.get()); } catch (ExecutionException e) { e.printStackTrace(); }
        }
        fixedThreadPool.shutdown();
    }
}
/*
Explanation-
newSingleThreadExecutor(): Executes tasks sequentially on a single thread.
newCachedThreadPool(): Creates new threads as needed and reuses idle threads (suitable for many short-lived tasks).
newFixedThreadPool(int n): Uses a fixed number of threads (n), queuing tasks when all
*/
