package dev.avyguzov.timus;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1313 {

    public static ArrayList<Integer> solution(int[][] pixelsMatrix) {
        int perimeter = pixelsMatrix.length * 2 - 1;
        ArrayList<Integer> result = new ArrayList<>();
        for (int p = 0; p < perimeter; p++) { // diagonal
            int i, j;
            if (p < pixelsMatrix.length - 1) {
                i = p;
                j = 0;
            } else {
                i = pixelsMatrix.length - 1;
                j = p - (pixelsMatrix.length - 1);
            }
            for (; i >= 0 && j < pixelsMatrix.length; i--, j++) {
                result.add(pixelsMatrix[i][j]);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] inputMatrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                inputMatrix[i][j] = s.nextInt();
            }
        }

        StringBuffer sb = new StringBuffer();
        solution(inputMatrix).forEach(el -> sb.append(el).append(" "));
        System.out.println(sb.toString().trim());
    }
}
