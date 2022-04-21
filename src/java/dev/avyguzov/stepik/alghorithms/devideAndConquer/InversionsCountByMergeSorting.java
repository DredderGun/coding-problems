package dev.avyguzov.stepik.alghorithms.devideAndConquer;

import java.util.*;

public class InversionsCountByMergeSorting {

    private Long inversionsCount;

    public Long getInversionsCount(List<Integer> list) {
        inversionsCount = 0L;
        if (list.size() <= 1) {
            return 0L;
        }
        mergeSort(list, 0, list.size() - 1);
        return inversionsCount;
    }

    private Queue<Integer> mergeSort(List<Integer> list, Integer leftIndex, Integer rightIndex) {
        if (leftIndex < rightIndex) {
            int m = (leftIndex + rightIndex) / 2;
            return merge(mergeSort(list, leftIndex, m), mergeSort(list, m + 1, rightIndex));
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.add(list.get(leftIndex));
        return queue;
    }

    private Queue<Integer> merge(Queue<Integer> leftQueue, Queue<Integer> rightQueue) {
        Queue<Integer> unionQueue = new LinkedList<>();
        while (leftQueue.size() > 0 || rightQueue.size() > 0) {
            if (leftQueue.size() == 0) {
                unionQueue.add(rightQueue.poll());
                continue;
            }
            if (rightQueue.size() == 0) {
                unionQueue.add(leftQueue.poll());
                continue;
            }

            if (leftQueue.peek() > rightQueue.peek()) {
                inversionsCount += leftQueue.size();
                unionQueue.add(rightQueue.poll());
            } else {
                unionQueue.add(leftQueue.poll());
            }
        }
        return unionQueue;
    }

}
