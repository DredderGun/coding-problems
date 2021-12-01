package dev.avyguzov.other;

import java.util.ArrayList;
import java.util.List;

// https://contest.yandex.ru/contest/8458/problems/D/
public class ParenthesesTask3 {
    public static List<String[]> solution(int n) {
        List<String[]> result = new ArrayList<>();
        String[] parenthesesArr = new String[n];

        for (int i = 0; i < n; i++) {
            if (i < n/2) {
                parenthesesArr[i] = "(";
            } else {
                parenthesesArr[i] = ")";
            }
        }
        result.add(parenthesesArr);

        while (true) {
            int cnt = 0;
            int ind;
            for (ind = n - 1; ind > 0; ind--) {
                if (parenthesesArr[ind].equals("(")) {
                    // подсчитаем cnt до найденной скобки
                    for (int j = 0; j <= ind; j++) {
                        if (parenthesesArr[j].equals(")")) {
                            cnt--;
                        } else {
                            cnt++;
                        }
                    }
                    if (cnt >= 0) {
                        break;
                    }
                }
            }

            if (ind < 0) {
                break;
            }

            // заполняем наиболее старшей последовательностью справа от найденной скобки
            for (int j = ind; j < n; j++) {
                if (cnt + 1 <= n - ind - 1) {
                    parenthesesArr[j] = "(";
                } else {
                    parenthesesArr[j] = ")";
                }
            }
            result.add(parenthesesArr);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution(6));
    }
}
