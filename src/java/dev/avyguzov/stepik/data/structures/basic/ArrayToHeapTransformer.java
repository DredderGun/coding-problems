package dev.avyguzov.stepik.data.structures.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Array to heap algorithm
 * <a href="https://stepik.org/lesson/41560/step/1?unit=20013">https://stepik.org/lesson/41560/step/1?unit=20013</a>
 */
public class ArrayToHeapTransformer {
    private int tracksNumber;
    private final List<List<Integer>> trackList = new ArrayList<>();

    public String transformArrayToHeap(long[] arr) {
        int parentI;
        List<Integer> currTrack;
        for (int i = arr.length - 1; i >= 1; i = i - 2) {
            parentI = getParentIndex(i);
            currTrack = new ArrayList<>();
            currTrack.add(parentI);
            siftDown(arr, parentI, currTrack);
            if (currTrack.size() > 1) {
                tracksNumber += currTrack.size() - 1;
                trackList.add(currTrack);
            }
        }
        return buildTrackString();
    }

    private String buildTrackString() {
        if (trackList.size() <= 1) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(tracksNumber).append("\n");

        for (List<Integer> currTrack : trackList) {
            for (int j = 1; j < currTrack.size(); j++) {
                sb.append(currTrack.get(j - 1)).append(" ").append(currTrack.get(j).toString()).append("\n");
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
    private void siftDown(long[] arr, int index, List<Integer> track) {
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
        track.add(minI);
        siftDown(arr, minI, track);
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
