package dev.avyguzov.timus;

import java.util.Scanner;

// https://timus.online/problem.aspx?space=1&num=1820
public class Task1820 {
    public static int solution(int n, int k) {
        if (n <= k) {
            return 2;
        }
        int timeToIntegerAmountOfCutlet = n / k * 2;

        int differentCutletSidesThatReminded = n % k * 2;
        if (differentCutletSidesThatReminded == 0) {
            return timeToIntegerAmountOfCutlet;
        } else if (differentCutletSidesThatReminded <= k) {
            return timeToIntegerAmountOfCutlet + 1;
        } else {
            return timeToIntegerAmountOfCutlet + 2;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();

        System.out.println(solution(n, k));
        s.close();
    }
}
