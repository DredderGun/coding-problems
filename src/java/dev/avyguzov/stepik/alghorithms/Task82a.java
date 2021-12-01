package dev.avyguzov.stepik.alghorithms;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://stepik.org/lesson/13257/step/5?unit=3442
 */
public class Task82a {
    /**
     * For tests
     *
     */
    public static int solution(int[] nums) {
        int[] counters = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            counters[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0 && counters[j] + 1 > counters[i]) {
                    counters[i] = counters[j] + 1;
                }
            }
        }

        Arrays.sort(counters);
        return counters[counters.length - 1];
    }

    /**
     * For input
     *
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numbersCount = s.nextInt();
        int[] nums = new int[numbersCount];
        int[] counters = new int[numbersCount];

        for (int i = 0; i < numbersCount; i++) {
            nums[i] = s.nextInt();
            counters[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0 && counters[j] + 1 > counters[i]) {
                    counters[i] = counters[j] + 1;
                }
            }
        }

        Arrays.sort(counters);
        System.out.println(counters[counters.length - 1]);
    }
}
