package dev.avyguzov.other;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YandexTaskRepeatsTest {

    @Test
    void test1() {
        Assertions.assertArrayEquals(new Integer[] {2, 4, 8}, YandexTaskRepeats.solution(new Integer[] {2, 4, 8, 8, 8}));
    }

    @Test
    void test2() {
        Assertions.assertArrayEquals(new Integer[] {2, 8}, YandexTaskRepeats.solution(new Integer[] {2, 2, 2, 8, 8}));
    }

    @Test
    void test3() {
        Assertions.assertArrayEquals(new Integer[] {3}, YandexTaskRepeats.solution(new Integer[] {3, 3, 3, 3, 3}));
    }

    @Test
    void test4() {
        Assertions.assertArrayEquals(new Integer[] {2}, YandexTaskRepeats.solution(new Integer[] {2}));
    }

    @Test
    void test5() {
        Assertions.assertArrayEquals(new Integer[] {5, 10}, YandexTaskRepeats.solution(new Integer[] {5, 5, 5, 10}));
    }
}