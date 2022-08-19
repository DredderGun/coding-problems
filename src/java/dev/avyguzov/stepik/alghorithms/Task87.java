package dev.avyguzov.stepik.alghorithms;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task87 {
    private long run() {
        Scanner in = new Scanner(System.in);
        int demandSum = in.nextInt();
        int coinsCount = in.nextInt();
        int[] coins = new int[coinsCount];

        for (int i = 0; i < coinsCount; i++) {
            coins[i] = in.nextInt();
        }

        int[] prevBestResults = new int[demandSum];
        int[] currBestResults = new int[demandSum];

        for (int i = 0; i < coins.length; i++) {
            int currCoin = coins[i];
            for (int i1 = 0; i1 < prevBestResults.length; i1++) {
                if (i1 - currCoin == -1 && prevBestResults[i1] > (prevBestResults[i1] + 1)) {
                    currBestResults[i1] = prevBestResults[i1] + 1;
                } else if (i1 - currCoin > -1 && prevBestResults[i1 - currCoin] > (prevBestResults[i1] + 1)) {
                    currBestResults[i1] = prevBestResults[i1] + 1;
                }
            }
        }

        return 2L;
    }

    public static void main(String[] args) throws FileNotFoundException {
        long startTime = System.currentTimeMillis();
        System.out.println(new Task87().run());
        long finishTime = System.currentTimeMillis();
        System.out.println(finishTime - startTime + "ms");
    }
}
