package dev.avyguzov.timus;

import java.util.Scanner;

// https://timus.online/problem.aspx?space=1&num=1264
public class Task1264 {
    public static int solution(int N, int M) {
        return N * (M + 1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int M = s.nextInt();

        System.out.println(solution(N, M));
        s.close();
    }
}
