package dev.avyguzov.timus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1820Test {
    @Test
    public void testFromProblemDesc() {
        Assertions.assertEquals(3, Task1820.solution(3, 2));
    }

    @Test
    public void myTest1() {
        Assertions.assertEquals(2, Task1820.solution(1, 2));
    }

    @Test
    public void myTest2() {
        Assertions.assertEquals(2, Task1820.solution(7, 10));
    }

    @Test
    public void myTest3() {
        Assertions.assertEquals(2, Task1820.solution(1, 1));
    }

    @Test
    public void myTest4() {
        Assertions.assertEquals(6, Task1820.solution(6, 2));
    }
}
