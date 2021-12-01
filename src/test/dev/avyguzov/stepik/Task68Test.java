package dev.avyguzov.stepik;

import dev.avyguzov.stepik.alghorithms.Task68;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Task68Test {
    @Test
    public void testSegments() {
        int[] points = new int[] {2, 3, 9, 2, 9};

        assertArrayEquals(new int[]{2, 2, 3, 9, 9}, Task68.solution(points));
    }

    @Test
    public void testSegments2() {
        int[] points = new int[] {2};

        assertArrayEquals(new int[]{2}, Task68.solution(points));
    }

    @Test
    public void testSegments3() {
        int[] points = new int[] {2, 2, 2, 2, 2};

        assertArrayEquals(new int[]{2, 2, 2, 2, 2}, Task68.solution(points));
    }
}
