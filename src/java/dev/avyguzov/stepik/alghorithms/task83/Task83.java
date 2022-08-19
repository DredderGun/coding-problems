package dev.avyguzov.stepik.alghorithms.task83;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Вычислите расстояние редактирования двух данных непустых строк длины не более 10^2, содержащих строчные
 * буквы латинского алфавита.
 *
 * Sample Input 1:
 *
 * ab
 * ab
 * Sample Output 1:
 *
 * 0
 * Sample Input 2:
 *
 * short
 * ports
 * Sample Output 2:
 *
 * 3
 */
public class Task83 {
    private long run() {
        Scanner in = new Scanner(System.in);
        String line1 = in.nextLine();
        String line2 = in.nextLine();

        int[][] arrForSearch = new int[line2.length() + 1][];

        for (int i = 0; i <= line2.length(); i++) {
            arrForSearch[i] = new int[line1.length() + 1];
            arrForSearch[i][0] = i;
        }
        for (int i = 0; i <= line1.length(); i++) {
            arrForSearch[0][i] = i;
        }

        for (int i = 1; i < arrForSearch.length; i++) {
            for (int j = 1; j < arrForSearch[i].length; j++) {
                arrForSearch[i][j] = Stream.of(arrForSearch[i - 1][j - 1] + compareTwoChars(line1.charAt(j - 1), line2.charAt(i - 1)),
                    arrForSearch[i - 1][j] + 1, arrForSearch[i][j - 1] + 1).min(Integer::compareTo).get();
            }
        }

        return arrForSearch[line2.length()][line1.length()];
    }

    private int compareTwoChars(char ch1, char ch2) {
        if (ch1 != ch2) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        long startTime = System.currentTimeMillis();
        System.out.println(new Task83().run());
        long finishTime = System.currentTimeMillis();
        System.out.println(finishTime - startTime + "ms");
    }
}
