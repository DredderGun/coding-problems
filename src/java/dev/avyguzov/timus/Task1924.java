package dev.avyguzov.timus;

import java.util.Scanner;

public class Task1924 {
    public static String solution(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n;
            n--;
        }

        if (sum % 2 == 0) {
            return "black";
        } else {
            return "grimy";
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(solution(n));
    }
}
