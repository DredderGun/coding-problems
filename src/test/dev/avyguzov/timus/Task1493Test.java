package dev.avyguzov.timus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1493Test {

    @Test
    public void test1() {
        Assertions.assertEquals("Yes", Task1493.solution("715068"));
    }

    @Test
    public void test2() {
        Assertions.assertEquals("No", Task1493.solution("445219"));
    }

    @Test
    public void test3() {
        Assertions.assertEquals("Yes", Task1493.solution("012200"));
    }

    @Test
    public void test4() {
        Assertions.assertEquals("No", Task1493.solution("111100"));
    }
}
