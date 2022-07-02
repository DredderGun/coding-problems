package dev.avyguzov.stepik.data.structures.hashtables;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class TextSearchTest {
    @Test
    public void test1() {
        Assertions.assertEquals(Arrays.asList(0, 4), new TextSearch().search("abacaba", "aba"));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(Arrays.asList(4), new TextSearch().search("testTesttesT", "Test"));
    }

    @Test
    public void test3() {
        Assertions.assertEquals(Arrays.asList(1, 2, 3), new TextSearch().search("baaaaaaa", "aaaaa"));
    }

    @Test
    public void test4() {
        Assertions.assertEquals(Arrays.asList(0, 1, 2, 3, 4), new TextSearch().search("aaaaaaa", "aaa"));
    }

    @Test
    public void test5() {
        Assertions.assertEquals(Arrays.asList(), new TextSearch().search("aa", "aaaa"));
    }

    @Test
    public void test6() {
        Assertions.assertEquals(Arrays.asList(), new TextSearch().search("aafrer", "kgjn"));
    }
}