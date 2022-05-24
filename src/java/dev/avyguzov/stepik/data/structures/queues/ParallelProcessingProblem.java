package dev.avyguzov.stepik.data.structures.queues;

import java.util.Scanner;

public class ParallelProcessingProblem {
    private int getLeftChildIndex(int i) {
        return i * 2 + 1;
    }

    private int getRightChildIndex(int i) {
        return i * 2 + 2;
    }

    public long[] addToQueue(long[][] priorityQueueArr, int index, long time) {
        long[] root = new long[] {priorityQueueArr[index][0], priorityQueueArr[index][1]};
        priorityQueueArr[index][1] += time;
        siftDown(priorityQueueArr, index);
        return root;
    }

    private long[] siftDown(long[][] priorityQueueArr, int index) {
        int rightChI = getRightChildIndex(index);
        int leftChI = getLeftChildIndex(index);
        int minI = index;

        // проверяем значения
        if (rightChI < priorityQueueArr.length && priorityQueueArr[index][1] > priorityQueueArr[rightChI][1]) {
            minI = rightChI;
        }
        if (leftChI < priorityQueueArr.length && priorityQueueArr[index][1] > priorityQueueArr[leftChI][1]) {
            minI = leftChI;
        }
        // проверяем id
        if (rightChI < priorityQueueArr.length && priorityQueueArr[index][1] == priorityQueueArr[rightChI][1] &&
                priorityQueueArr[index][0] > priorityQueueArr[rightChI][0]) {
            minI = rightChI;
        }
        if (leftChI < priorityQueueArr.length && priorityQueueArr[index][1] == priorityQueueArr[leftChI][1] &&
                priorityQueueArr[index][0] > priorityQueueArr[leftChI][0]) {
            minI = leftChI;
        }
        if (minI == index) {
            return priorityQueueArr[index];
        }

        if (leftChI < priorityQueueArr.length && rightChI < priorityQueueArr.length) {
            minI = priorityQueueArr[rightChI][1] == priorityQueueArr[leftChI][1] ?
                    priorityQueueArr[rightChI][0] < priorityQueueArr[leftChI][0] ? rightChI : leftChI :
                    priorityQueueArr[rightChI][1] < priorityQueueArr[leftChI][1] ? rightChI : leftChI;
        }

        swap(priorityQueueArr, index, minI);
        return siftDown(priorityQueueArr, minI);
    }

    private void swap(long[][] ar, int i1, int i2) {
        long[] temp = ar[i1];
        ar[i1] = ar[i2];
        ar[i2] = temp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[][] processorsPriorityQueue = new long[in.nextInt()][2];
        int m = in.nextInt();
        ParallelProcessingProblem o = new ParallelProcessingProblem();
        for (int i = 0; i < processorsPriorityQueue.length; i++) {
            processorsPriorityQueue[i][0] = i;
        }

        long[] result;
        long time;
        for (int i = 0; i < m; i++) {
            time = in.nextLong();
            result = o.addToQueue(processorsPriorityQueue, 0, time);
            System.out.println(result[0] + " " + (result[1]));
        }
    }
}
