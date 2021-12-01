package dev.avyguzov.other;

import java.util.*;

public class AnagramsTask {
    public static byte solution(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return 0;
        }
        byte[] firstStrBytes = str1.getBytes();
        byte[] secondStrBytes = str2.getBytes();

        Arrays.sort(firstStrBytes);
        Arrays.sort(secondStrBytes);

        for (int i = 0; i < firstStrBytes.length; i++) {
            if (firstStrBytes[i] != secondStrBytes[i]) {
                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String s2 = s.nextLine();

        System.out.println(solution(s1, s2));
    }
}
