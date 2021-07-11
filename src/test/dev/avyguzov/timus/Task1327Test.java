package dev.avyguzov.timus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1327Test {

    @Test
    public void test1() {
        Assertions.assertEquals(3, Task1327.solution(1, 5));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(50, Task1327.solution(100, 200));
    }

    @Test
    public void test3() {
        Assertions.assertEquals(1, Task1327.solution(12, 14));
    }

    @Test
    public void test4() {
        Assertions.assertEquals(2, Task1327.solution(12, 15));
    }

    @Test
    public void test5() {
        Assertions.assertEquals(1, Task1327.solution(12, 13));
    }

    @Test
    public void test6() {
        Assertions.assertEquals(0, Task1327.solution(10, 10));
    }

    @Test
    public void test7() {
        Assertions.assertEquals(1, Task1327.solution(11, 11));
    }
}
