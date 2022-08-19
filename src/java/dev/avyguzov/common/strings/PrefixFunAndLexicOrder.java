package dev.avyguzov.common.strings;

import java.util.Scanner;

/**
 * Найти лексикографически-минимальную строку, построенную по префикс-функции, в алфавите a-z.
 *
 * Ввод
 * 0 1 2 3 0
 *
 * Вывод
 * aaaab
 */
public class PrefixFunAndLexicOrder {
    public String getSourceString(int[] lexFunOutput) {
        StringBuilder str = new StringBuilder().append('a');
        for (int i = 1; i < lexFunOutput.length; i++) {
            if (lexFunOutput[i] == 0) {
                char cToInsert = 'a';
                int prevBorderLength = lexFunOutput[i - 1];
                int j = 0;
                while (j <= prevBorderLength) {

                    if (str.charAt(j) == cToInsert) {
                        cToInsert++;
                        j = 0;
                    }
                    j++;
                }
                str.append(cToInsert);
            } else {
                str.append(str.charAt(lexFunOutput[i - 1]));
            }
        }

        return str.toString();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = s.nextInt();
        }

        var o = new PrefixFunAndLexicOrder();
        System.out.println(o.getSourceString(ar));
    }
}
