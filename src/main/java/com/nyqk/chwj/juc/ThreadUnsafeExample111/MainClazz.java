package main.java.com.nyqk.chwj.juc.ThreadUnsafeExample111;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainClazz{
    public static void main(String[] args) throws InterruptedException {
        final int threadSize = 1000;
        WorkClazz example = new WorkClazz();
        final CountDownLatch countDownLatch = new CountDownLatch(threadSize);
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < threadSize; i++) {
            executorService.execute(() -> {
                example.add();
                countDownLatch.countDown();
            });
        }
        // 主线程等待
        countDownLatch.await();
        executorService.shutdown();
        System.out.println(example.get());
    }
}