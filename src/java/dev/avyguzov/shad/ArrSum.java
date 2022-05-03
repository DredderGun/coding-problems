package dev.avyguzov.shad;

import java.util.Arrays;
import java.util.Scanner;

public class ArrSum {
    public static long solution(int[] nmbrs) {
        if (nmbrs.length == 1) {
            return nmbrs[0];
        }
        Arrays.sort(nmbrs);
        long prevMax = nmbrs[nmbrs.length - 1];
        long prevPrevMax = nmbrs[nmbrs.length - 2];

        int result = 0;

        long sum;
        int firstNmbr;
        for (int i = 0; i < nmbrs.length - 2; i++) {
            firstNmbr = nmbrs[i];
            sum = firstNmbr + prevPrevMax;
            result += sum;

            if (sum >= prevMax) {
                prevPrevMax = prevMax;
                prevMax = sum;
            } else {
                prevPrevMax = sum;
            }
        }

        return prevMax + prevPrevMax + result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] nmbrs = new int[n];
        for (int i = 0; i < nmbrs.length; i++) {
            nmbrs[i] = s.nextInt();
        }

        System.out.println(solution(nmbrs));
    }
}
