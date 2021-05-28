package dev.avyguzov.timus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task2023Test {
    @Test
    public void test1() {
        Assertions.assertEquals(5, Task2023.solution(new String[] {"Aurora", "Tiana", "Ariel", "Mulan"}));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(0, Task2023.solution(new String[] {"Alice", "Ralph", "Robin"}));
    }

    @Test
    public void test3() {
        Assertions.assertEquals(2, Task2023.solution(new String[] {"Dumbo", "Tarzan"}));
    }
}
