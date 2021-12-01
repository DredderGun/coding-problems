package dev.avyguzov.stepik.alghorithms;

import java.util.Scanner;

/**
 * https://stepik.org/lesson/13252/step/3?unit=3437
 */
public class Task68 {

    public static int[] solution(int[] input) {
        int[] numbersCount = new int[11];

        for (int i : input) {
            numbersCount[i]++;
        }
        for (int i = 2; i < numbersCount.length; i++) {
            numbersCount[i] = numbersCount[i - 1] + numbersCount[i];
        }

        int[] sortedAr = new int[input.length];
        for (int i = numbersCount.length - 1; i > 0; i--) {
            while (numbersCount[i] - numbersCount[i - 1] > 0) {
                sortedAr[numbersCount[i] - 1] = i;
                numbersCount[i]--;
            }
        }

        return sortedAr;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numbersCount = s.nextInt();

        int[] input = new int[numbersCount];
        for (int i = 0; i < input.length; i++) {
            input[i] = s.nextInt();
        }

        for (int j : solution(input)) {
            System.out.println(j);
        }
    }
}
