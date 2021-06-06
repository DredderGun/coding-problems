package dev.avyguzov.timus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1313Test {
    @Test
    public void test1() {
        ArrayList<Integer> result = Task1313.solution(new int[][]{
                new int[] {1, 3, 6, 10},
                new int[] {2, 5, 9, 13},
                new int[] {4, 8, 12, 15},
                new int[] {7, 11, 14, 16},
        });
        Assertions.assertEquals(
                new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16)), result);
    }

    @Test
    public void test2() {
        ArrayList<Integer> result = Task1313.solution(new int[][]{
                new int[] {1, 3},
                new int[] {2, 4}
        });
        Assertions.assertEquals(
                new ArrayList<>(Arrays.asList(1, 2, 3, 4)), result);
    }

    @Test
    public void test3() {
        ArrayList<Integer> result = Task1313.solution(new int[][]{
                new int[] {1}
        });
        Assertions.assertEquals(
                new ArrayList<>(Arrays.asList(1)), result);
    }
}
