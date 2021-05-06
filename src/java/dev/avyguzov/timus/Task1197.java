package dev.avyguzov.timus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

// https://timus.online/problem.aspx?space=1&num=1197
public class Task1197 {
    public static List<Integer> solution(String[] cells) {
        HashMap<String, Integer> letterSideOfChessBoard = new HashMap<>();
        letterSideOfChessBoard.put("a", 1);
        letterSideOfChessBoard.put("b", 2);
        letterSideOfChessBoard.put("c", 3);
        letterSideOfChessBoard.put("d", 4);
        letterSideOfChessBoard.put("e", 5);
        letterSideOfChessBoard.put("f", 6);
        letterSideOfChessBoard.put("g", 7);
        letterSideOfChessBoard.put("h", 8);

        List<Integer> answer = new ArrayList<>();
        int[][] possibleSteps = new int[][] {
                new int[]{2, -1}, new int[]{2, 1}, new int[]{1, 2},
                new int[]{-1, 2}, new int[]{-2, 1}, new int[]{-2, -1},
                new int[]{-1, -2}, new int[]{1, -2}
        };

        int x, y;
        int resultForCurrentCell = 0;
        for (String cell : cells) {
            x = letterSideOfChessBoard.get(cell.split("")[0]);
            y = Integer.parseInt(cell.split("")[1]);

            for (int[] step : possibleSteps) {
                if (y + step[0] <= 8 && y + step[0] > 0 &&
                        x + step[1] <= 8 && x + step[1] > 0) {
                    resultForCurrentCell++;
                }
            }

            if (resultForCurrentCell > 0) {
                answer.add(resultForCurrentCell);
            }
            resultForCurrentCell = 0;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        String[] cells = new String[n];

        for (int i = 0; i < n; i++) {
            cells[i] = s.nextLine();
        }

        for (int ans : solution(cells)) {
            System.out.println(ans);
        }
        s.close();
    }
}
