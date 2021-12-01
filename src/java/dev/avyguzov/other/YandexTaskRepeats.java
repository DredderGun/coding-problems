package dev.avyguzov.other;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class YandexTaskRepeats {
    public static Integer[] solution(Integer[] input) {
        if (input.length == 1) {
            return input;
        }
        ArrayList<Integer> result = new ArrayList<>();
        int previousEl = -11111;
        for (Integer currEl : input) {
            if (currEl != previousEl) {
                result.add(currEl);
            }
            previousEl = currEl;
        }

        return result.toArray(new Integer[0]);
    }

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if (n == 1) {
            System.out.println(s.nextInt());
        } else {
            int lastElement = -111111111;
            for (int i = 0; i < n; i++) {
                int currEl = s.nextInt();
                if (currEl != lastElement) {
                    System.out.println(currEl);
                }
                lastElement = currEl;
            }
        }
    }
}
