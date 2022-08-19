package dev.avyguzov.common.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PrefixFunAndLexicOrderTest {
    @Test
    public void simpleTest1() {
        var o = new PrefixFunAndLexicOrder();
        Assertions.assertEquals("abbac", o.getSourceString(new int[] {0, 0, 0, 1, 0}));
    }

    @Test
    public void simpleTest2() {
        var o = new PrefixFunAndLexicOrder();
        Assertions.assertEquals("aaaab", o.getSourceString(new int[] {0, 1, 2, 3, 0}));
    }

    @Test
    public void simpleTest3() {
        var o = new PrefixFunAndLexicOrder();
        Assertions.assertEquals("abacabb", o.getSourceString(new int[] {0, 0, 1, 0, 1, 2, 0}));
    }

    @Test
    public void simpleTest4() {
        var o = new PrefixFunAndLexicOrder();
        Assertions.assertEquals("abcac", o.getSourceString(new int[] {0, 0, 0, 1, 0}));
    }
}