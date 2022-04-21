package dev.avyguzov.other.dynamic;

import java.util.*;

/**
 * You are a robber who has found a block of houses to rob. Each house i has a non-negative vi worth of value inside that you can steal.
 * However, due to the way the security systems of the houses are connected, you’ll get caught if you rob two adjacent houses. What’s the
 * maximum value you can steal from the block?
 */
public class RobberProblemWithRecursion {
    private HashMap<Integer, Integer> cache = new HashMap<>();

    private int run(int[] ar, int endIndex) {
        if (endIndex == 0) {
            return ar[0];
        } else if (endIndex == 1) {
            return Math.max(ar[0], ar[1]);
        } else if (cache.get(endIndex) != null) {
            return cache.get(endIndex);
        }

        int currCount = Math.max(
            ar[endIndex] + run(ar, endIndex - 2),
            run(ar, endIndex - 1));
        return cache.put(endIndex, currCount);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arLength = in.nextInt();
        int[] inputAr = new int[arLength];

        for (int i = 0; i < arLength; i++) {
            inputAr[i] = in.nextInt();
        }

        assert inputAr.length > 2;
        System.out.println(new RobberProblemWithRecursion().run(inputAr, arLength - 1));
    }
}
