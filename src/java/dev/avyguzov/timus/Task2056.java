package dev.avyguzov.timus;

import java.util.Scanner;

// https://timus.online/problem.aspx?space=1&num=2056
public class Task2056 {

    public static String solution(int[] inputArr) {


        double sum = 0;
        for (int input : inputArr) {
            if (input == 3) {
                return "None";
            }
            sum += input;
        }

        double avg = sum / inputArr.length;
        if (avg == 5) {
            return "Named";
        } else if (avg >= 4.5) {
            return "High";
        } else {
            return "Common";
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] marks = new int[n];

        for (int i = 0; i < n; i++) {
            marks[i] = s.nextInt();
        }
        System.out.println(solution(marks));
    }
}
