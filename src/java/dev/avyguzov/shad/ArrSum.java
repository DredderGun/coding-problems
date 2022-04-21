package dev.avyguzov.shad;

import java.util.Arrays;
import java.util.Scanner;

public class ArrSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] nmbrs = new int[n];
        for (int i = 0; i < nmbrs.length; i++) {
            nmbrs[i] = s.nextInt();
        }

        Arrays.sort(nmbrs);
        int size = nmbrs.length;
        int firstNmbr, secondNmbr;

        int result = 0;
        for (int i = 0, j = nmbrs.length - 2; i < nmbrs.length / 2; i++, j--) {
            firstNmbr = nmbrs[i];
            secondNmbr = nmbrs[j];

            result += firstNmbr + secondNmbr;

        }
    }
}
