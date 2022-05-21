package dev.avyguzov.stepik.data.structures.queues;

import java.util.*;

/**
 * Array to heap convertation
 * <a href="https://stepik.org/lesson/41560/step/1">Problem description</a>
 */
public class ArrayToHeapTransformer {
    public String transformArrayToHeap(long[] arr) {
        List<List<Integer>> steps = new ArrayList<>();
        for (int i = getParentIndex(arr.length - 1); i >= 0; i--) {
            siftDown(arr, i, steps);
        }
        return buildTrackString(steps);
    }

    private String buildTrackString(List<List<Integer>> steps) {
        if (steps.size() <= 1) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(steps.size()).append("\n");

        for (List<Integer> currTrack : steps) {
            for (int j = 1; j < currTrack.size(); j++) {
                sb.append(currTrack.get(j - 1)).append(" ")
                        .append(currTrack.get(j).toString()).append("\n");
            }
        }

        return sb.toString();
    }

    private void swap(long[] ar, int i1, int i2) {
        long temp = ar[i1];
        ar[i1] = ar[i2];
        ar[i2] = temp;
    }
    
    private int getParentIndex(int childIndex) {
        return (childIndex - 1) / 2;
    }

    private int getLefChildIndex(int parentI) {
        return parentI * 2 + 1;
    }

    private int getRightChildIndex(int parentI) {
        return parentI * 2 + 2;
    }

    private void siftDown(long[] arr, int index, List<List<Integer>> steps) {
        int rightChI = getRightChildIndex(index);
        int leftChI = getLefChildIndex(index);
        int minI = index;
        
        if (rightChI < arr.length && arr[index] > arr[rightChI]) {
            minI = rightChI;
        }
        if (leftChI < arr.length && arr[index] > arr[leftChI]) {
            minI = leftChI;
        }
        if (minI == index) {
            return;
        }
        if (leftChI < arr.length && rightChI < arr.length) {
            minI = arr[rightChI] < arr[leftChI] ? rightChI : leftChI;
        }

        swap(arr, index, minI);
        steps.add(Arrays.asList(index, minI));
        siftDown(arr, minI, steps);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextLong();
        }

        ArrayToHeapTransformer h = new ArrayToHeapTransformer();
        System.out.println(h.transformArrayToHeap(arr));
    }
}