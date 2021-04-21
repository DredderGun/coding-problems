package dev.avyguzov.acmp;

import java.util.Scanner;

// https://acmp.ru/index.asp?main=task&id_task=324
public class Task324 {

    public static String solution(int n) {
        char[] charArray = String.valueOf(n).toCharArray();
        int i = 0;
        int j = 3;
        while (i < j) {
            if (charArray[i] != charArray[j]) {
                return  "NO";
            }
            i++;
            j--;
        }

        return "YES";
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.println(solution(n));
        s.close();
    }
}
