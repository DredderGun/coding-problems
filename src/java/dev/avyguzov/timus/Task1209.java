package dev.avyguzov.timus;

import java.util.Scanner;

public class Task1209 {
    public static int[] solution(int[] arrWithPositions) {
        int[] answer = new int[arrWithPositions.length];

        for (int i = 0, currSum = 1; currSum < 2 * Math.pow(10, 9); i++) {
            currSum += i;

            for (int j = 0; j < arrWithPositions.length; j++) {
                if (currSum == arrWithPositions[j]) {
                    answer[j] = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arrWithPositions = new int[n];
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            arrWithPositions[i] = s.nextInt();
        }

        int[] answer = solution(arrWithPositions);

        for (int i = 0; i < n; i++) {
            result.append(answer[i]);
            result.append(" ");
        }

        System.out.println(result.toString().trim());
    }
}
