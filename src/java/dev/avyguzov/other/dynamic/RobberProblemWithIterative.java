package dev.avyguzov.other.dynamic;

import java.util.Scanner;

/*
 * You are a robber who has found a block of houses to rob. Each house i has a non-negative vi worth of value inside that you can steal.
 * However, due to the way the security systems of the houses are connected, you’ll get caught if you rob two adjacent houses. What’s the
 * maximum value you can steal from the block?
 */
public class RobberProblemWithIterative {
    private int run(int[] ar) {
        int countPrev = ar[1];
        int countPrevPrev = ar[0];
        int temp;

        for (int i = 2; i < ar.length; i++) {
            temp = countPrev;
            countPrev = Math.max(countPrev, countPrevPrev + ar[i]);
            countPrevPrev = temp;
        }

        return Math.max(countPrev, countPrevPrev);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arLength = in.nextInt();
        int[] inputAr = new int[arLength];

        for (int i = 0; i < arLength; i++) {
            inputAr[i] = in.nextInt();
        }

        assert inputAr.length > 2;
        System.out.println(new RobberProblemWithIterative().run(inputAr));
    }
}
