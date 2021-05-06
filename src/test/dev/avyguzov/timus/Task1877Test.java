package dev.avyguzov.timus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1877Test {
    @Test
    public void testFromProblemDesc() {
        Assertions.assertEquals("no", Task1877.solution(1, 0));
        Assertions.assertEquals("yes", Task1877.solution(2, 1));
    }

    @Test
    public void myTest1() {
        Assertions.assertEquals("yes", Task1877.solution(0, 1));
    }

    @Test
    public void myTest2() {
        Assertions.assertEquals("yes", Task1877.solution(9999, 9999));
    }
}
