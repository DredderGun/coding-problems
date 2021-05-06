package dev.avyguzov.timus;

import java.util.Scanner;

// https://timus.online/problem.aspx?space=1&num=1877
public class Task1877 {
    public static String solution(int code1, int code2) {
        if (code1 % 2 == 0) {
            return "yes";
        } else if (code2 % 2 != 0) {
            return "yes";
        } else {
            return "no";
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int code1 = s.nextInt();
        int code2 = s.nextInt();

        System.out.println(Task1877.solution(code1, code2));
        s.close();
    }
}
