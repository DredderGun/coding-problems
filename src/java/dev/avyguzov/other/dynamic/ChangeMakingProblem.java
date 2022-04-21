package dev.avyguzov.other.dynamic;

import java.util.Scanner;
import java.util.Stack;

/**
 * The fewest number of coins you can use to make a certain amount, if you have coins of a certain set of denominations.
 */
public class ChangeMakingProblem {
    private int run(int sum, int[] coinsAmount) {
        Stack<Integer> stack = new Stack<>();

        return 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = in.nextInt();
        int coinsAmount = in.nextInt();
        int[] coins = new int[coinsAmount];
        for (int i = 0; i < coinsAmount; i++) {
            coins[i] = in.nextInt();
        }

        assert coins.length > 2;
        System.out.println(new ChangeMakingProblem().run(sum, coins));
    }
}
