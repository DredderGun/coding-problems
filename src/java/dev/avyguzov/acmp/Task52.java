package dev.avyguzov.acmp;

import java.util.Scanner;

// https://acmp.ru/index.asp?main=task&id_task=52
public class Task52 {
    public static String solution(int n) {
        if (n < 100000) {
            return "NO";
        }

        if (n / 100000 != n % 10000) {
            return "NO";
        } else if (n / 10000 != n % 1000) {
            return "NO";
        } else if (n / 1000 != n % 1000) {
            return "NO";
        }

        return "YES";
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.println(solution(n));
        s.close();
    }
}
