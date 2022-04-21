package dev.avyguzov.stepik.alghorithms.task87b;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Task87b {
    private int inputNumber;

    private String run() {
        Scanner in = new Scanner(System.in);
        inputNumber = in.nextInt();
        int[][] resultsTable = new int[inputNumber + 1][];
        resultsTable[1] = new int[] {0, 0};

        for (int currNumber = 1; currNumber <= inputNumber; currNumber++) {
            int nextForMultiply2 = currNumber * 2;
            int nextForMultiply3 = currNumber * 3;
            int next = currNumber + 1;

            compareAndSave(currNumber, nextForMultiply2, resultsTable);
            compareAndSave(currNumber, nextForMultiply3, resultsTable);
            compareAndSave(currNumber, next, resultsTable);
        }

        Stack<Integer> result = new Stack<>();
        result.push(inputNumber);
        int prevNumber = resultsTable[inputNumber][0];
        while (prevNumber != 0) {
            result.push(prevNumber);
            prevNumber = resultsTable[prevNumber][0];
        }

        StringBuilder sb = new StringBuilder();
        while (!result.isEmpty()) {
            sb.append(result.pop()).append(" ");
        }

        System.out.println(resultsTable[inputNumber][1]);
        return sb.toString().strip();
    }

    private void compareAndSave(int currNumber, int next, int[][] resultsTable) {
        int bestResultSoFar = resultsTable[currNumber][1];
        if (next <= inputNumber) {
            if (resultsTable[next] == null) {
                resultsTable[next] = new int[] {currNumber, bestResultSoFar + 1};
            } else if (resultsTable[next][1] > bestResultSoFar + 1) {
                resultsTable[next] = new int[] {currNumber, bestResultSoFar + 1};
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(new Task87b().run());
    }
}
