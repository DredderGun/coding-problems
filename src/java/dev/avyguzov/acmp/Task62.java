package dev.avyguzov.acmp;

import java.util.HashMap;
import java.util.Scanner;

// https://acmp.ru/index.asp?main=task&id_task=62
public class Task62 {
    static HashMap<String, Integer> letterAndNumber = new HashMap<>();
    static {
        letterAndNumber.put("A", 1);
        letterAndNumber.put("B", 2);
        letterAndNumber.put("C", 3);
        letterAndNumber.put("D", 4);
        letterAndNumber.put("E", 5);
        letterAndNumber.put("F", 6);
        letterAndNumber.put("G", 7);
        letterAndNumber.put("H", 8);
    }

    public static String solution(String n) {
        String[] boardCell = n.split("");
        int diagonal = letterAndNumber.get(boardCell[0]) + Integer.parseInt(boardCell[1]);

        if (diagonal % 2 == 0) {
            return "BLACK";
        } else {
            return "WHITE";
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String n = s.nextLine();

        System.out.println(solution(n));
        s.close();
    }
}
