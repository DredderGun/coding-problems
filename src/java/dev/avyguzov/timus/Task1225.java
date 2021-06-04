package dev.avyguzov.timus;

import java.util.Scanner;

public class Task1225 {
    public static long solution(int n) {
        long[][] arr = new long[2][46];

        arr[0][1] = 1;
        arr[1][1] = 1;
        arr[1][2] = 1;
        arr[0][2] = 1;

        for (int i = 3; i <= 45; i++) {
            arr[0][i] = arr[1][i - 1] + arr[1][i - 2];
            arr[1][i] = arr[0][i - 1] + arr[0][i - 2];
        }

        return arr[0][n] + arr[1][n];
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(solution(s.nextInt()));
    }
}
