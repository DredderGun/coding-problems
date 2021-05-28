package dev.avyguzov.timus;

import java.util.Scanner;

public class Task1910 {
    public static int[] solution(int[] n) {
        int maxCounter = 0;
        int currCounter;
        int indexWithMaxCounter = 1;

        for (int i = 1; i < n.length - 1; i++) {
            currCounter = n[i - 1] + n[i] + n[i + 1];
            if (currCounter > maxCounter) {
                maxCounter = currCounter;
                indexWithMaxCounter = i;
            }
        }

        return new int[] {maxCounter, indexWithMaxCounter + 1};
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int[] answer = solution(arr);
        System.out.println(answer[0]);
        System.out.println(answer[1]);
    }
}
