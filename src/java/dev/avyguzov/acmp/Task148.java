package dev.avyguzov.acmp;

import java.util.Scanner;

// https://acmp.ru/index.asp?main=task&id_task=148
public class Task148 {
    public static int solution(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }

        return a == 0 ? b : a;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();

        System.out.println(solution(A, B));
        s.close();
    }
}
