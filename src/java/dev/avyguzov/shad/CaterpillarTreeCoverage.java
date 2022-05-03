package dev.avyguzov.shad;

import java.util.HashMap;
import java.util.Scanner;

public class CaterpillarTreeCoverage {
    HashMap<Integer, Long> memoForFactorial = new HashMap<>();

    public long solution(int[] caterpillarTree) {
        long result = 1;

        for (int i = 1; i < caterpillarTree.length - 1; i++) {
            // добавим сначала вариант с самим узлом, без него, а затем и все сочетания с его потомками
            result += 2 + getCountForChild(caterpillarTree[i]);
        }

        // добавим последний узел
        result++;
        return result % 1_000_000_007;
    }

    private long getCountForChild(int n) {
        if (memoForFactorial.get(n) != null) {
            return memoForFactorial.get(n);
        }

        // начнём с n + 1: вариант для m=1 и m=n
        long result = n + 1;
        for (int m = 2; m < n; m++) {
            result += factorial(n) / (factorial(n - m) * factorial(m));
        }

        memoForFactorial.put(n, result);

        return result;
    }

    private long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        long result = 1;
        while (n > 0) {
            result *= (result * n) % 1_000_000_007;
            n--;
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] caterpillarTree = new int[n];
        for (int i = 0; i < caterpillarTree.length; i++) {
            caterpillarTree[i] = s.nextInt();
        }

        CaterpillarTreeCoverage o = new CaterpillarTreeCoverage();
        System.out.println(o.solution(caterpillarTree));
    }
}
