package dev.avyguzov.timus;

import java.util.HashMap;
import java.util.Scanner;

// https://timus.online/problem.aspx?space=1&num=1209
public class Task1209 {
    public static int[] solution(long[] arrWithPositions) {
        int[] answer = new int[arrWithPositions.length];
        HashMap<Long, Long> computedSums = new HashMap<>();
        computedSums.put(1L, 1L);

        long lastIndex = 1;
        for (int i = 0; i < arrWithPositions.length; i++) {
            long currPosition = arrWithPositions[i];
            if (computedSums.containsValue(currPosition)) {
                answer[i] = 1;
            } else if (currPosition < computedSums.get(lastIndex)) {
                answer[i] = 0;
            } else {
                while (computedSums.get(lastIndex) < currPosition) {
                    computedSums.put(lastIndex + 1, computedSums.get(lastIndex) + lastIndex);
                    lastIndex++;
                    if (computedSums.containsValue(currPosition)) {
                        answer[i] = 1;
                        break;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long[] arrWithPositions = new long[n];
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            arrWithPositions[i] = s.nextLong();
        }

        int[] answer = solution(arrWithPositions);

        for (int i = 0; i < n; i++) {
            result.append(answer[i]);
            result.append(" ");
        }

        System.out.println(result.toString().trim());
    }
}
