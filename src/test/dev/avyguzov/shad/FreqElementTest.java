package dev.avyguzov.shad;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreqElementTest {
    @Test
    public void test1() {
        assertEquals(3, FreqElement.solution(new int[] {3, 3, 3}));
    }

    @Test
    public void test2() {
        assertEquals(4, FreqElement.solution(new int[] {4, 1, 4, 3, 3}));
    }

    @Test
    public void test3() {
        assertEquals(10, FreqElement.solution(new int[] {10, 6, 10, 10, 10, 10, 8, 8, 10, 9}));
    }

    @Test
    public void test4() {
        assertEquals(10, FreqElement.solution(new int[] {10}));
    }

    @Test
    public void test5() {
        assertEquals(6, FreqElement.solution(new int[] {2, 2, 2, 6, 6, 6}));
    }
}
