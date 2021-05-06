package dev.avyguzov.timus;

import java.util.Scanner;

public class Task2066 {
    public static int solution(int a, int b, int c) {
        int result = c;
        if (b == 1 || b == 0) {
            result += b;
        } else {
            result *= b;
        }

        return a - result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        System.out.println(solution(a, b, c));
        s.close();
    }
}
