package dev.avyguzov.stepik.alghorithms;

import java.io.*;
import java.util.*;

class MyReader {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;
    MyReader(Reader r) {
        reader = new BufferedReader(r);
    }
    public int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }
    public long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }
    public String nextToken() throws IOException {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(reader.readLine());
        }
        return tokenizer.nextToken();
    }
}

/**
 * https://stepik.org/lesson/13257/step/5?unit=3442
 */
public class Task82b {

    /**
     * For tests
     *
     */
    public static int[] solution(long[] nums) {
        int[] subsequenceCounters = new int[nums.length];
        int[] subsequenceChain = new int[nums.length];
        subsequenceCounters[0] = 0;
        int subsequenceLength = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[subsequenceCounters[0]]) {
                subsequenceCounters[0] = i;
            } else if (nums[i] <= nums[subsequenceCounters[subsequenceLength]]) {
                subsequenceCounters[subsequenceLength + 1] = i;
                subsequenceChain[i] = subsequenceCounters[subsequenceLength];
                subsequenceLength++;
            } else {
                int indexToUpdate = searchUpperBound(nums, subsequenceCounters, nums[i], subsequenceLength);
                if (indexToUpdate - 1 >= 0) {
                    subsequenceChain[i] = subsequenceCounters[indexToUpdate - 1];
                } else {
                    subsequenceChain[i] = i + 1;
                }
                subsequenceCounters[indexToUpdate] = i;
            }
        }

        int[] answer = new int[subsequenceLength + 1];
        answer[subsequenceLength] = subsequenceCounters[subsequenceLength] + 1;
        int prevIndex = subsequenceChain[subsequenceCounters[subsequenceLength]];
        subsequenceLength--;
        while (subsequenceLength >= 0) {
            answer[subsequenceLength] = prevIndex + 1;
            prevIndex = subsequenceChain[prevIndex];
            subsequenceLength--;
        }

        return answer;
    }

    private static int searchUpperBound(long[] nums, int[] indexesForSearch, long numberForSearch, int endIndex) {
        int left = 0;
        int right = endIndex;
        int i;
        while (left < right) {
            i = (right + left) / 2;
            if (nums[indexesForSearch[i]] >= numberForSearch) {
                left = i + 1;
            } else {
                right = i;
            }
        }
        return left;
    }

    // метод, когда в следующую ячейку с ответом копируем элементы из предыдущего
    private static long[] concatenateArrayAndElement(long[] ar1, long element) {
        long[] newAr = new long[ar1.length + 1];
        for (int j = 0; j < ar1.length; j++) {
            newAr[j] = ar1[j];
        }
        newAr[ar1.length] = element;

        return newAr;
    }

    private static int binSearch(int[] array, int key) { //search first index res, array[res] > key
        int res = Arrays.binarySearch(array, key);
        if (res < 0) return -res - 1;
        while (array[res] == key) res++;
        return res;
    }

    /**
     * For input
     *
     */
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), max = 0;
        int[] a = new int[n], d = new int[n + 1], indexes = new int[n + 1], prev = new int[n];
        for (int i = n - 1; i >= 0; i--) { //revers
            a[i] = sc.nextInt();
            prev[i] = indexes[i] = -1;
            d[i] = Integer.MAX_VALUE;
        }
        d[0] = -1;
        d[n] = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int j = binSearch(d, a[i]);
            if (d[j - 1] <= a[i] && d[j] > a[i]) {
                d[j] = a[i];
                indexes[j] = i;
                prev[i] = indexes[j - 1];
                if (j > max) max = j;
            }
        }

        LinkedList<Integer> res = new LinkedList<>();
        System.out.println(max); // length
        int index = indexes[max];
        while (index >= 0) {
            res.addLast(index);
            index = prev[index];
        }
        for (Integer re : res)
            System.out.print(n - re + " ");
    }
}
