package dev.avyguzov.leetcode;

// https://leetcode.com/problems/shuffle-the-array/
public class Task1470 {
    public static int[] solution(int[] nums, int n) {
        int[] newNums = new int[nums.length];
        for (int i = 0; i < n; i++) {
            newNums[i*2] = nums[i];
            newNums[i*2+1] = nums[n + i];
        }
        return newNums;
    }
}
