package dev.avyguzov.timus;

import java.util.Scanner;

// https://timus.online/problem.aspx?space=1&num=1327
public class Task1327 {

    public static int solution(int A, int B) {
        if ((B - A + 1) % 2 != 0 && B % 2 != 0) {
            return (B - A + 1) / 2 + 1;
        } else {
            return (B - A + 1) / 2;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();

        System.out.println(solution(A, B));
    }
}
