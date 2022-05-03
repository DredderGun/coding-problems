package dev.avyguzov.shad;

import java.util.*;

public class EulerFunAndBinomProblem {
    HashMap<Long, Long> eulerFunCache = new HashMap<>();

    public long solution(int n, int k) {
        if (k > n / 2) k = n - k;
        if (k == 1) return euler(n);
        if (k == 0) return 1;

        long r = 1;
        long result = 1;
        for (int i = 1; i <= k; ++i) {
            r *= n - k + i;
            r /= i;

            if (r > 1_000_000_007) {
                result *= euler(r % 1_000_000_007);
                r = 1;
            }
        }

        result *= euler(r);
        return result;
    }

    private List<Long> getBinomAsMultipliers(int n, int k) {
        if (k > n / 2) k = n - k;
        if (k == 1) return List.of((long) n);
        if (k == 0) return List.of(1L);

        ArrayList<Long> primeMultipliers = eratosthenesSeive(n);
        int currPrimePow;
        for (int i = 0; i < primeMultipliers.size(); i++) {
            Long currPrime = primeMultipliers.get(i);
            long calculatedNmbr = 1L;
            int m = n - k;
            for (int j = 1; Math.pow(currPrime, j) <= n; j++) {
                currPrimePow = (int) (n / Math.pow(currPrime, j));
                calculatedNmbr = (calculatedNmbr * powWithModule(currPrimePow, currPrime)) % 1_000_000_007;
            }
            primeMultipliers.set(i, calculatedNmbr);
        }
        return primeMultipliers;
    }
    
    private long powWithModule(int pow, long nmbr) {
        long resultNmbr = nmbr;
        while (pow > 1) {
            resultNmbr = (resultNmbr * nmbr) % 1_000_000_007;
            pow--;
        }
        return resultNmbr;
    }

    private ArrayList<Long> eratosthenesSeive(int upperLimit) {
        boolean[] numbers = new boolean[upperLimit + 1];
        ArrayList<Long> primeNmbrs = new ArrayList<>();

        int currCompositeNumber;
        for (int i = 2; i <= upperLimit; i++) {
            if (!numbers[i]) {
                primeNmbrs.add((long) i);
                for (int j = 2; j < upperLimit; j++) {
                    currCompositeNumber = i * j;
                    if (currCompositeNumber <= upperLimit) {
                        numbers[currCompositeNumber] = true;
                    }
                }
            }
        }
        return primeNmbrs;
    }

    private long euler(long nmbr) {
        if (nmbr == 0) {
            return 1;
        }
        if (eulerFunCache.get(nmbr) != null) {
            return eulerFunCache.get(nmbr);
        }
        long result = 1L;
        for (long i = nmbr - 1; i > 1; i--) {
            if (findGcd(nmbr, i) == 1) {
                result++;
            }
        }
        eulerFunCache.put(nmbr, result);
        return result;
    }

    private long findGcd(long a, long b) {
        if (a % b == 0) {
            return b;
        }
        return findGcd(b, a % b);
    }

    // тут старт программы. Ввод данных через консоль
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int k = s.nextInt();
//        int n = s.nextInt();

        EulerFunAndBinomProblem o = new EulerFunAndBinomProblem();
//        System.out.println(o.solution(n, k));
//        {2=8, 3=4, 5=2, 7=1}
//        System.out.println(Math.pow(2, 8)*Math.pow(3, 4)*Math.pow(5, 2)*7);
        System.out.println(o.getBinomAsMultipliers(10, 5));
    }
}
