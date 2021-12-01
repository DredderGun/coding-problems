package dev.avyguzov.other;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramsTaskTest {

    @Test
    void test1() {
        assertEquals(0, AnagramsTask.solution("artaa", "arta"));
    }

    @Test
    void test2() {
        assertEquals(1, AnagramsTask.solution("qiu", "iuq"));
    }

    @Test
    void test3() {
        assertEquals(0, AnagramsTask.solution("aa", "aaaa"));
    }

    @Test
    void test4() {
        assertEquals(0, AnagramsTask.solution("a", "b"));
    }

    @Test
    void test5() {
        assertEquals(1, AnagramsTask.solution("a", "a"));
    }
}