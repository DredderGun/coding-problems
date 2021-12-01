package dev.avyguzov.stepik;

import dev.avyguzov.stepik.alghorithms.Task82a;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task82aTest {
    @Test
    public void testSegments1() {
        assertEquals(3, Task82a.solution(new int[]{3, 6, 7, 12}));
    }

    @Test
    public void testSegments2() {
        assertEquals(2, Task82a.solution(new int[]{12, 24}));
    }

    @Test
    public void testSegments3() {
        assertEquals(1, Task82a.solution(new int[]{333}));
    }

    @Test
    public void testSegments4() {
        assertEquals(3, Task82a.solution(new int[]{2, 1, 3, 24}));
    }
}
