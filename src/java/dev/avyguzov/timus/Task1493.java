package dev.avyguzov.timus;

import java.util.Scanner;

// https://timus.online/problem.aspx?space=1&num=1493
public class Task1493 {

    public static String solution(String ticketNum) {
        int leftSum = 0;
        for (int i = 0; i < 3; i++) {
            leftSum += Integer.parseInt(ticketNum.substring(i, i+1));
        }
        int rightSum = 0;
        for (int i = 3; i < 6; i++) {
            rightSum += Integer.parseInt(ticketNum.substring(i, i+1));
        }

        if (rightSum - leftSum == 1 && ticketNum.charAt(5) != '0') {
            return "Yes";
        }
        if (leftSum - rightSum  == 1 && ticketNum.charAt(5) != '9') {
            return "Yes";
        }

        return "No";
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String n = s.nextLine();

        System.out.println(solution(n));
    }
}
