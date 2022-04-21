package dev.avyguzov.stepik.alghorithms.greedy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

// По данному числу 1 <= 10^9 ≤ n ≤10^9
//  найдите максимальное число kk, для которого nn можно представить как сумму kk различных натуральных слагаемых. Выведите в первой строке число kk, во второй — kk слагаемых.

// тут можно сделать ещё короче за скорость sqrt(n). Там способ заключается в умножении инкремента на 2 и проверки больше ли n
public class MaxDifferentTerms {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<Integer> resultAr = new ArrayList<>();

        int subtrahend = 0;
        int remainder;
        while (n != 0) {
            subtrahend += 1;
            remainder = n - subtrahend;
            if (remainder <= subtrahend) {
                subtrahend = n;
            }
            resultAr.add(subtrahend);
            n -= subtrahend;
        }

        System.out.println(resultAr.size());
        resultAr.forEach(System.out::println);
    }
}
