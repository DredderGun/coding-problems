package dev.avyguzov.leetcode;

//https://leetcode.com/problems/number-of-good-pairs/
public class Task1512 {
    public static int solution(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    counter++;
                }
            }
        }

        return counter;
    }
}
