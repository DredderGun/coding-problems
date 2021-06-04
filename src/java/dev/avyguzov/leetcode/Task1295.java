package dev.avyguzov.leetcode;

public class Task1295 {
    public static int solution(int[] nums) {
        int digitCount = 0;
        int countEventDigitNumbers = 0;
        for (int n : nums) {
            System.out.println("dsf");
            while (n != 0) {
                n = n / 10;
                digitCount++;
            }
            if (digitCount % 2 == 0) {
                countEventDigitNumbers++;
            }
            digitCount = 0;
        }

        return countEventDigitNumbers;
    }
}
