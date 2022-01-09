package dev.avyguzov.stepik.alghorithms.task84;

import java.io.FileNotFoundException;
import java.util.*;

public class Task84 {
    private long run() {
        Scanner in = new Scanner(System.in);
        int knapsackCapacity = in.nextInt();
        int goldBarsCount = in.nextInt();

        LinkedList<Integer> bars = new LinkedList<>();
        for (int i = 0; i < goldBarsCount; i++) {
            bars.add(in.nextInt());
        }

        int[] currResult = new int[knapsackCapacity];
        int[] prevResult = new int[knapsackCapacity];

        while (!bars.isEmpty()) {
            int currBar = bars.removeFirst();
            System.arraycopy(currResult, 0, prevResult, 0, knapsackCapacity);

            for (int j = 0; j < prevResult.length; j++) {
                if (j - currBar == -1 && currBar > prevResult[j]) {
                    currResult[j] = currBar;
                } else if (j - currBar > -1 && (prevResult[j - currBar] + currBar) > prevResult[j]) {
                    currResult[j] = prevResult[j - currBar] + currBar;
                } else {
                    currResult[j] = prevResult[j];
                }
            }
            System.arraycopy(currResult, 0, prevResult, 0, knapsackCapacity);
        }

        return prevResult[prevResult.length - 1];
    }

    public static void main(String[] args) throws FileNotFoundException {
        long startTime = System.currentTimeMillis();
        System.out.println(new Task84().run());
        long finishTime = System.currentTimeMillis();
        System.out.println(finishTime - startTime + "ms");
    }
}

