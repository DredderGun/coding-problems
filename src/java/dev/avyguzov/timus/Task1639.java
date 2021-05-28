package dev.avyguzov.timus;

import java.util.Scanner;

public class Task1639 {
    public static String solution(int m, int n) {
        if (m*n % 2 == 0) {
            return "[:=[first]";
        } else {
            return "[second]=:]";
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        System.out.println(solution(m, n));
    }
}
