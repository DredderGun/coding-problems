package dev.avyguzov.acmp;

import java.util.Scanner;

// https://acmp.ru/index.asp?main=task&id_task=929
public class Task929 {

    public static int solutionMinScore(int score) {
        int result = 0;

        int cubeSidesCount;
        int i = 6;
        while (i > 0) {
            cubeSidesCount = score / i;
            switch (i) {
                case 6: result += cubeSidesCount; break;
                case 5: result += cubeSidesCount * 2; break;
                case 4: result += cubeSidesCount * 3; break;
                case 3: result += cubeSidesCount * 4; break;
                case 2: result += cubeSidesCount * 5; break;
                case 1: result += cubeSidesCount * 6; break;
            }
            score %= i;
            i--;
        }

        return result;
    }

    public static int solutionMaxScore(int score) {
        return score * 6;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int score = s.nextInt();

        System.out.println(Task929.solutionMinScore(score) + " " + Task929.solutionMaxScore(score));
        s.close();
    }
}
