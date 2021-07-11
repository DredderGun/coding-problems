package dev.avyguzov.timus;

import java.util.Scanner;

// https://timus.online/problem.aspx?space=1&num=1991
public class Task1991 {
    public static int[] solution(int[] blocksWitBumBum, int droidsInBlock) {
        int bumBumRest = 0;
        int droidsRest = 0;

        for (int block : blocksWitBumBum) {
            if (droidsInBlock - block > 0) {
                droidsRest += droidsInBlock - block;
            }
            if (block - droidsInBlock > 0) {
                bumBumRest += block - droidsInBlock;
            }
        }

        return new int[] {bumBumRest, droidsRest};
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int blocksAmount = s.nextInt();
        int droidsInBlock = s.nextInt();
        int[] blocksWitBumBum = new int[blocksAmount];

        for (int i = 0; i < blocksAmount; i++) {
            blocksWitBumBum[i] = s.nextInt();
        }

        int[] result = solution(blocksWitBumBum, droidsInBlock);
        System.out.println(result[0] + " " + result[1]);
    }
}
