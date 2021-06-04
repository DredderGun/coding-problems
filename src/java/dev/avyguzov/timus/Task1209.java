package dev.avyguzov.timus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Task1209 {
    public static int[] solution(long[] arrWithPositions) {
        int[] answer = new int[arrWithPositions.length];
        HashMap<Long, Long> computedSums = new HashMap<>();
        computedSums.put(1L, 1L);

        long lastIndex = 1;
        for (int i = 0; i<arrWithPositions.length; i++) {
            long currPosition = arrWithPositions[i];
            if (computedSums.containsValue(currPosition)) {
                answer[i] = 1;
            } else if (currPosition < computedSums.get(lastIndex)) {
                answer[i] = 0;
            } else {
                while (computedSums.get(lastIndex) < currPosition) {
                    computedSums.put(lastIndex + 1, computedSums.get(lastIndex) + lastIndex);
                    lastIndex++;
                    if (computedSums.containsValue(currPosition)) {
                        answer[i] = 1;
                        break;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);

        al.remove(2);

        System.out.println(al);

//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        long[] arrWithPositions = new long[n];
//        StringBuilder result = new StringBuilder();
//
//        for (int i = 0; i < n; i++) {
//            arrWithPositions[i] = s.nextLong();
//        }
//
//        int[] answer = solution(arrWithPositions);
//
//        for (int i = 0; i < n; i++) {
//            result.append(answer[i]);
//            result.append(" ");
//        }
//
//        System.out.println(result.toString().trim());
    }
}
