package dev.avyguzov.shad;

import java.util.HashMap;
import java.util.Scanner;

public class FreqElement {
    public static Integer solution(int[] numbers) {
        HashMap<Integer, Integer> counts = new HashMap<>();
        int maxNmbr = 0;
        int maxValue = 0;

        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];
            counts.compute(curr, (k, oldValue) -> {
                if (oldValue == null) {
                    oldValue = 1;
                } else {
                    oldValue = oldValue + 1;
                }
                return oldValue;
            });
            if (counts.get(curr) == maxValue && curr > maxNmbr) {
                maxNmbr = curr;
            } else if (counts.get(curr) > maxValue) {
                maxNmbr = curr;
                maxValue = counts.get(curr);
            }
        }

        return maxNmbr;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        HashMap<Integer, Integer> counts = new HashMap<>();
        int maxNmbr = 0;
        int maxValue = 0;

        for (int i = 0; i < n; i++) {
            int curr = s.nextInt();
            counts.compute(curr, (k, oldValue) -> {
                if (oldValue == null) {
                    oldValue = 1;
                } else {
                    oldValue = oldValue + 1;
                }
                return oldValue;
            });
            if (counts.get(curr) == maxValue && curr > maxNmbr) {
                maxNmbr = curr;
            } else if (counts.get(curr) > maxValue) {
                maxNmbr = curr;
                maxValue = counts.get(curr);
            }
        }

        System.out.println(maxNmbr);
    }
}
