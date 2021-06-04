package dev.avyguzov.leetcode;

import org.junit.jupiter.api.Test;

public class Task1114Test {
    @Test
    public void test1() {
        Task1114 task1114 = new Task1114();
        Runnable task1 = () -> {
            try {
                task1114.first(() -> System.out.println("First"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Runnable task2 = () -> {
            try {
                task1114.second(() -> System.out.println("Second"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Runnable task3 = () -> {
            try {
                task1114.third(() -> System.out.println("Third"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        new Thread(task2).start();
        new Thread(task3).start();
        new Thread(task1).start();
    }
}
