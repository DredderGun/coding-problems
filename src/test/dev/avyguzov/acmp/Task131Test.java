package dev.avyguzov.acmp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task131Test {
    @Test
    public void simpleTest() {
        List<List<Integer>> people = new ArrayList<>();
        people.add(Arrays.asList(25, 1));
        people.add(Arrays.asList(70, 1));
        people.add(Arrays.asList(100, 0));
        people.add(Arrays.asList(3, 1));
        Assertions.assertEquals(2, Task131.solution(people));
    }

    @Test
    public void simpleTest2() {
        List<List<Integer>> people = new ArrayList<>();
        people.add(Arrays.asList(25, 0));
        people.add(Arrays.asList(25, 1));
        Assertions.assertEquals(2, Task131.solution(people));
    }

    @Test
    public void simpleTest3() {
        List<List<Integer>> people = new ArrayList<>();
        people.add(Arrays.asList(32, 0));
        people.add(Arrays.asList(250, 0));
        people.add(Arrays.asList(250, 0));
        Assertions.assertEquals(-1, Task131.solution(people));
    }
}
