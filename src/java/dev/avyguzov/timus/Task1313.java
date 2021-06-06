package dev.avyguzov.timus;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1313 {

    public static ArrayList<Integer> solution(int[][] pixelsMatrix) {
        int perimeter = pixelsMatrix.length * 2 - 1;
        ArrayList<Integer> result = new ArrayList<>();
        for (int p = 0; p < perimeter; p++) { // diagonal
            for (int i = pixelsMatrix.length - 1; i >=0; i--) { // y
                for (int j = 0; j < pixelsMatrix.length; j++) { // x
                    if ((i + j) == p) {
                        result.add(pixelsMatrix[i][j]);
                        break;
                    }
                }
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
