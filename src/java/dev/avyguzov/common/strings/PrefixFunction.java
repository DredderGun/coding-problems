package dev.avyguzov.common.strings;

public class PrefixFunction {
    public int getBorderLength(String s, int index) {
        int[] p = new int[index + 1];
        p[0] = 0;
        for (int i = 1; i <= index; i++) {
            if (p[i - 1] == 0 && s.charAt(i) == s.charAt(0)) {
                p[i] = 1;
            } else if (s.charAt(i) == s.charAt(p[i - 1])) {
                p[i] = p[i - 1] + 1;
            } else {
                p[i] = 0;
            }
        }
        return p[index];
    }

    public static void main(String[] args) {
        var o = new PrefixFunction();
        System.out.println(o.getBorderLength("abcabcd", 0));
        System.out.println(o.getBorderLength("abcabcd", 1));
        System.out.println(o.getBorderLength("abcabcd", 2));
        System.out.println(o.getBorderLength("abcabcd", 3));
        System.out.println(o.getBorderLength("abcabcd", 4));
        System.out.println(o.getBorderLength("abcabcd", 5));
        System.out.println(o.getBorderLength("abcabcd", 6));
    }
}
