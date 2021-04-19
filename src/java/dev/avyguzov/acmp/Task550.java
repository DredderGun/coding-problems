package dev.avyguzov.acmp;

import java.util.Scanner;

// https://acmp.ru/index.asp?main=task&id_task=550
public class Task550 {
    public static String solution(int n) {
        String resultDate = "";
        if (n % 400 == 0 || (n % 4 == 0 && n % 100 != 0)) {
            resultDate += "12/09/";
        } else {
            resultDate += "13/09/";
        }

        StringBuilder formattedYear = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            formattedYear.append(n % 10);
            n = n / 10;
        }
        formattedYear.reverse();

        return resultDate + formattedYear.toString();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.println(solution(n));
        s.close();
    }
}
