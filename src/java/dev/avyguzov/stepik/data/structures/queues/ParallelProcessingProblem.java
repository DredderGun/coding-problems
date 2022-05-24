package dev.avyguzov.stepik.data.structures.queues;

import java.util.Scanner;

public class ParallelProcessingProblem {
    private int getLeftChildIndex(int i) {
        return i * 2 + 1;
    }

    private int getRightChildIndex(int i) {
        return i * 2 + 2;
    }

    /**
     * Топит корневой узел с новым значением val += time
     * Приоритет = значение (по задаче время работы) * n + номер элемента (по задаче номер процессора)
     * @param priorityQueueArr очередь с приоритетом
     * @param time значение (по задаче время на обработку)
     * @return формат "{номер элемента} {значение времени}"
     */
    public long[] push(long[] priorityQueueArr, long time) {
        long[] result = new long[] {priorityQueueArr[0] % priorityQueueArr.length, priorityQueueArr[0] / priorityQueueArr.length};
        priorityQueueArr[0] += time * priorityQueueArr.length;
        siftDown(priorityQueueArr, 0);
        return result;
    }

    private void siftDown(long[] priorityQueueArr, int index) {
        int rightChI = getRightChildIndex(index);
        int leftChI = getLeftChildIndex(index);
        int minI = index;

        if (rightChI < priorityQueueArr.length && priorityQueueArr[index] > priorityQueueArr[rightChI]) {
            minI = rightChI;
        }
        if (leftChI < priorityQueueArr.length && priorityQueueArr[index] > priorityQueueArr[leftChI]) {
            minI = leftChI;
        }
        if (minI == index) {
            return;
        }

        if (leftChI < priorityQueueArr.length && rightChI < priorityQueueArr.length) {
            minI = priorityQueueArr[rightChI] < priorityQueueArr[leftChI] ? rightChI : leftChI;
        }

        swap(priorityQueueArr, index, minI);
        siftDown(priorityQueueArr, minI);
    }

    private void swap(long[] ar, int i1, int i2) {
        long temp = ar[i1];
        ar[i1] = ar[i2];
        ar[i2] = temp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] processorsPriorityQueue = new long[in.nextInt()];
        int m = in.nextInt();
        ParallelProcessingProblem o = new ParallelProcessingProblem();
        for (int i = 0; i < processorsPriorityQueue.length; i++) {
            // приоритет = значение (по задаче время работы) * n + номер элемента (по задаче номер процессора)
            processorsPriorityQueue[i] = i;
        }

        long[] result;
        for (int i = 0; i < m; i++) {
            result = o.push(processorsPriorityQueue, in.nextLong());
            System.out.println(result[0] + " " + result[1]);
        }
    }
}
