package java8;

// Source: https://www.youtube.com/watch?v=xpjvY45Hbyg

// A Future is used as a reference to the result of an asynchronous computation
// Completable Future handle the limitations of Future class

// CompletableFuture use for asynchronous programming in java
// -> Writing non-blocking code by running a task on a separate thread rather than the main application thread
// -> The main thread will be able to execute other tasks in parallel

// Future Limitations
// 1. Futures cannot be completed manually
// 2. Actions cannot be performed until the result is available
// 3. Attaching a callback function is not possible
// 4. Multiple Futures cannot be chained together
// 5. Multiple Futures cannot be combined together
// 6. There is no Exception handling in the Future API

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

// CompletableFuture
// -> implements the Future and in CompletionStage interfaces
// -> provides a huge set of methods for creating, chaining and combining multiple Futures; it also has a very
// comprehensive exception handling support
public class Future_and_CompletableFuture {
    public static void main(String args[]) throws ExecutionException, InterruptedException {
        CompletableFuture<String> completableFuture = new CompletableFuture<>();
        // will never output anything at this tage and we'll wait indefinitely
        // subsequent calls to the complete method will be ignored
        completableFuture.complete("Hello");
        System.out.println(completableFuture.get());

        // We can use default value by getNow, if result is not ready
        System.out.println(completableFuture.getNow("Get now"));
    }
}
