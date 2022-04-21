package dev.avyguzov.stepik.alghorithms.task87a;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task87a {
    private long run() {
        Scanner in = new Scanner(System.in);
        int numbersCount = in.nextInt();
        int prevPrev;
        int prev = 0;
        int curr = in.nextInt();
        int temp;
        for (int i = 1; i < numbersCount; i++) {
            temp = in.nextInt();
            prevPrev = prev;
            prev = curr;
            curr = Math.max(prev + temp, prevPrev + temp);
        }

        return curr;
    }

    public static void main(String[] args) throws FileNotFoundException {
        long startTime = System.currentTimeMillis();
        System.out.println(new Task87a().run());
        long finishTime = System.currentTimeMillis();
        System.out.println(finishTime - startTime + "ms");
    }
}
