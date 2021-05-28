package dev.avyguzov.timus;

import java.util.Scanner;

public class Task1068 {
    public static int solution(int n) {
        int sum = 0;

        if (n > 0) {
            while (n > 0) {
                sum += n--;
            }
        } else {
            while (n < 2) {
                sum += n++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(solution(s.nextInt()));
    }
}
