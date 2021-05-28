package dev.avyguzov.timus;

import java.util.Scanner;

public class Task1880 {
    public static int solution(int[] a, int[] b, int[] c) {
        int counter = 0;
        for (int i = 0; i<a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    for (int m = 0; m < c.length; m++) {
                        if (b[j] == c[m]) {
                            counter++;
                        }
                    }
                }

            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] firstAr = new int[n];
        for (int i = 0; i < n; i++) {
            firstAr[i] = s.nextInt();
        }
        n = s.nextInt();
        int[] secondAr = new int[n];
        for (int i = 0; i < n; i++) {
            secondAr[i] = s.nextInt();
        }
        n = s.nextInt();
        int[] threeAr = new int[n];
        for (int i = 0; i < n; i++) {
            threeAr[i] = s.nextInt();
        }

        System.out.println(solution(firstAr, secondAr, threeAr));
        s.close();
    }
}