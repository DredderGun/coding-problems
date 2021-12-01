package dev.avyguzov.other;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OnesTaskTest {
    @Test
    public void test1() {
        assertEquals(0, OnesTask.solution(new int[] {0, 0}));
    }

    @Test
    public void test2() {
        assertEquals(1, OnesTask.solution(new int[] {1, 0}));
    }

    @Test
    public void test3() {
        assertEquals(1, OnesTask.solution(new int[] {0, 1}));
    }

    @Test
    public void test4() {
        assertEquals(5, OnesTask.solution(new int[] {1, 1, 1, 0, 1, 1, 0, 0, 1, 1, 1, 1}));
    }

    @Test
    public void test5() {
        assertEquals(6, OnesTask.solution(new int[] {1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1}));
    }
}