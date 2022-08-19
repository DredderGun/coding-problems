package dev.avyguzov.shad;

import java.util.*;

/**
 * Отправить на проверку нужно исходный код программы, решающей поставленную задачу.
 *
 * В этой задаче вам нужно вычислить значение функции Эйлера от некоторого биномиального коэффициента C_n^k  («выбрать k элементов из n»).
 *
 * Формат ввода
 * В единственной строке записаны два целых числа k и n (0 ≤ k ≤ n ≤ 500_000).
 *
 * Формат вывода
 * Выведите одно число  по модулю 1_000_000_007.
 */
public class EulerFunAndBinomProblem {

    public long solution(int n, int k) {
        if (k > n / 2) k = n - k;
        if (k == 0) return 1L;

        boolean[] visitedNmbrs = new boolean[n + 1];
        long result = 1, powForCurrPrime = 0;
        long nmbrForFactorization;
        // в основе этого цикла метод решето Эратосфена
        for (int primeNmbr = 2; primeNmbr <= n; primeNmbr++) {
            if (!visitedNmbrs[primeNmbr]) {
                nmbrForFactorization = primeNmbr;
                while (nmbrForFactorization <= n) {
                    for (int i = 1; nmbrForFactorization * i % 1_000_000_007 <= n; i++) {
                        powForCurrPrime++;
                        // тут мы производим сокращение на k!
                        if (nmbrForFactorization * i % 1_000_000_007 <= k) {
                            powForCurrPrime--;
                        }
                        // тут мы производим сокращение на (n-k)!
                        if (nmbrForFactorization * i % 1_000_000_007 <= n - k) {
                            powForCurrPrime--;
                        }
                        // отмечаем числа, которые уже вошли в разложение
                        visitedNmbrs[(int) nmbrForFactorization * i % 1_000_000_007] = true;
                    }
                    nmbrForFactorization *= primeNmbr;
                }
                result = result * euler(primeNmbr, powForCurrPrime) % 1_000_000_007;
                powForCurrPrime = 0;
            }
        }
        return result;
    }

    /**
     * Если primeNmbr — простое, pow — натуральное число, то \phi (p^a)=p^a-p^{a-1}.
     * @param primeNmbr простое число
     * @param pow степень primeNmbr
     * @return кол-во простых числе перед primeNmbr
     */
    private long euler(long primeNmbr, long pow) {
        if (pow == 0) {
            return 1;
        }
        if (pow == 1) {
            return primeNmbr - 1;
        }

        long result = primeNmbr;
        while (pow > 2) {
            result = result * primeNmbr % 1_000_000_007;
            pow--;
        }
        return (result * primeNmbr) % 1_000_000_007 - result;
    }

    /**
     * Тут старт программы. Ввод данных через консоль
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        int n = s.nextInt();

        EulerFunAndBinomProblem o = new EulerFunAndBinomProblem();
        System.out.println(o.solution(n, k));
    }
}
