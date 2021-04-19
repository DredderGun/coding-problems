package dev.avyguzov.acmp;

import java.util.Scanner;

// https://acmp.ru/index.asp?main=task&id_task=757
public class Task757 {

    public static Long solution(long c, long h, long o) {
        long cCount = c / 2;
        long hCount = h / 6;

        long result;

        if (cCount < hCount) {
            if (cCount < o) {
                result = cCount;
            } else {
                result = o;
            }
        } else if (hCount < o) {
            result = hCount;
        } else {
            result = o;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long c = s.nextLong();
        long h = s.nextLong();
        long o = s.nextLong();

        System.out.println(solution(c, h, o));
        s.close();
    }
}
