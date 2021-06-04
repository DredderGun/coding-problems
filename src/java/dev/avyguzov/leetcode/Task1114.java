package dev.avyguzov.leetcode;

import java.util.HashMap;
import java.util.concurrent.Semaphore;

public class Task1114 {
    private final HashMap<Integer, Boolean> doneTasks = new HashMap<>();
    private Semaphore semaphore = new Semaphore(1);

    public Task1114() {

    }

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        doneTasks.put(1, true);
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while (doneTasks.get(1) == null) { }
        if (semaphore.tryAcquire()) {

        }
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        doneTasks.put(2, true);
    }

    public void third(Runnable printThird) throws InterruptedException {
        while (doneTasks.get(1) == null || doneTasks.get(2) == null) { }
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
        doneTasks.put(3, true);
    }
}
