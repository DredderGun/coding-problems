package dev.avyguzov.acmp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Task929Test {
    @Test
    public void simpleTest() {
        Assertions.assertEquals(5, Task929.solutionMinScore(2));
        Assertions.assertEquals(12, Task929.solutionMaxScore(2));

        Assertions.assertEquals(6, Task929.solutionMinScore(36));
        Assertions.assertEquals(216, Task929.solutionMaxScore(36));

        Assertions.assertEquals(2, Task929.solutionMinScore(5));
        Assertions.assertEquals(30, Task929.solutionMaxScore(5));
    }
}
