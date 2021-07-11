package dev.avyguzov.timus;

import java.util.Scanner;

public class Task1319 {
    public static int[][] solution(int squareSide) {
        int diagonalsCount = squareSide * 2 - 1;
        int counter = 1;
        int[][] resultMatrix = new int[squareSide][squareSide];
        
        for (int d = 0; d < diagonalsCount; d++) { // diagonal index
            if (d < squareSide) {
                for (int y = squareSide - 1 - d, x = 0; y < squareSide && x < squareSide; x++, y++) {
                    resultMatrix[x][y] = counter++;
                }
            } else {
                for (int y = 0, x = d - squareSide + 1; y < squareSide && x < squareSide; x++, y++) {
                    resultMatrix[x][y] = counter++;
                }
            }
        }

        return resultMatrix;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int squareSide = s.nextInt();

        int[][] result = solution(squareSide);
        for (int[] row : result) {
            StringBuilder rowString = new StringBuilder();
            for (int cell : row) {
                rowString.append(cell);
                rowString.append(" ");
            }
            System.out.println(rowString.toString().trim());
        }
    }
}
