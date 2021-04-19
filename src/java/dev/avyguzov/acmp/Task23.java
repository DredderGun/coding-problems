package dev.avyguzov.acmp;

import java.util.Scanner;

// https://acmp.ru/index.asp?main=task&id_task=23
public class Task23 {
    public static int solution(int n) {
        int dividerSum = 0;

        for (int i = 1; i<=n; i++) {
            if (n % i == 0) {
                dividerSum += i;
            }
        }

        return dividerSum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.println(solution(n));
        s.close();
    }
}
