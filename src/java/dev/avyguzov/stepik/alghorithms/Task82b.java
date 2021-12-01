package dev.avyguzov.stepik.alghorithms;

import java.io.*;
import java.util.*;

class MyReader {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;
    MyReader(Reader r) throws IOException {
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
                int[] subsequenceToSearch = new int[subsequenceLength + 1];
                for (int j = 0; j <= subsequenceLength; j++) {
                    subsequenceToSearch[j] = subsequenceCounters[j];
                }
                int indexToUpdate = searchUpperBound(nums, subsequenceToSearch, nums[i]);
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

    private static int searchUpperBound(long[] nums, int[] indexesForSearch, long numberForSearch) {
        int left = 0;
        int right = indexesForSearch.length;
        int i;
        while (left < right) {
            i = (right + left) / 2;
            if (nums[indexesForSearch[i]] >= numberForSearch) {
                left = i + 1;
            } else {
                right = i;
            }
        }
        if (left == indexesForSearch.length) {
            return indexesForSearch.length - 1;
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

    /**
     * For input
     *
     */
    public static void main(String[] args) throws IOException {
        MyReader s = new MyReader(new InputStreamReader(System.in));
        long[] nums = new long[s.nextInt()];
        int[] subsequenceCounters = new int[nums.length];
        int[] subsequenceChain = new int[nums.length];
        subsequenceCounters[0] = 0;
        int subsequenceLength = 0;
        nums[0] = s.nextLong();

        for (int i = 1; i < nums.length; i++) {
            nums[i] = s.nextLong();
            if (nums[i] > nums[subsequenceCounters[0]]) {
                subsequenceCounters[0] = i;
            } else if (nums[i] <= nums[subsequenceCounters[subsequenceLength]]) {
                subsequenceCounters[subsequenceLength + 1] = i;
                subsequenceChain[i] = subsequenceCounters[subsequenceLength];
                subsequenceLength++;
            } else {
                int[] subsequenceToSearch = new int[subsequenceLength + 1];
                for (int j = 0; j <= subsequenceLength; j++) {
                    subsequenceToSearch[j] = subsequenceCounters[j];
                }
                int indexToUpdate = searchUpperBound(nums, subsequenceToSearch, nums[i]);
                if (indexToUpdate - 1 >= 0) {
                    subsequenceChain[i] = subsequenceCounters[indexToUpdate - 1];
                } else {
                    subsequenceChain[i] = i + 1;
                }
                subsequenceCounters[indexToUpdate] = i;
            }
        }

        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

        int[] answer = new int[subsequenceLength + 1];
        answer[subsequenceLength] = subsequenceCounters[subsequenceLength] + 1;
        int prevIndex = subsequenceChain[subsequenceCounters[subsequenceLength]];
        subsequenceLength--;
        while (subsequenceLength >= 0) {
            answer[subsequenceLength] = prevIndex + 1;
            prevIndex = subsequenceChain[prevIndex];
            subsequenceLength--;
        }

        writer.println(answer.length);
        StringBuilder sb = new StringBuilder();
        for (long n : answer) {
            sb.append(n);
            sb.append(" ");
        }
        writer.println(sb);
        writer.close();
    }
}
