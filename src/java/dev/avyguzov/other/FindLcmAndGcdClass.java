package dev.avyguzov.other;

/**
 * That algorithm finds among all pairs of `a` and `b` with a "least common multiple" LCM(a,b) = givenLcm and a
 * "greatest common divisor" GDM(a, b) = givenGcd a pair with minimum sum a + b
 *
 * https://stackoverflow.com/questions/71645854/can-i-solve-this-problem-with-dynamic-programming/71650477#71650477
 * from online exam to CSC 2021
 */
public class FindLcmAndGcdClass {
    private int findGcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return findGcd(b, a % b);
    }

    private int findLcm(int a, int b, int gcd) {
        return (a * b) / gcd;
    }

    private void run(int givenGcd, int givenLcm) {
        int productOfGivenGcdAndLcm = givenGcd * givenLcm;

        int minSum = Integer.MAX_VALUE;
        int foundNumberOne = 0;
        int foundNumberTwo = 0;

        int a;
        int b;
        int count = 0;
        for (a = givenGcd; a <= givenLcm; a = a + 12) {
            if (productOfGivenGcdAndLcm % a == 0) {
                b = productOfGivenGcdAndLcm / a;
                int gcd;
                if (a < b) {
                    gcd = findGcd(b, a);
                } else {
                    gcd = findGcd(a, b);
                }
                int lcm = findLcm(a, b, gcd);
                count++;

                if (gcd == givenGcd && lcm == givenLcm && a + b < minSum) {
                    minSum = a + b;
                    foundNumberOne = a;
                    foundNumberTwo = b;
                }
            }
        }
        System.out.println(minSum);
        System.out.println(foundNumberOne);
        System.out.println(foundNumberTwo);
        System.out.println(count);
    }


    public static void main(String[] args) {
        var o = new FindLcmAndGcdClass();
        o.run(12, 498960);
    }
}
