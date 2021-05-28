package dev.avyguzov.timus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1924Test {
    @Test
    public void testFromDesc() {
        Assertions.assertEquals("grimy", Task1924.solution(1));
    }

    @Test
    public void testFromDesc2() {
        Assertions.assertEquals("black", Task1924.solution(4));
    }

    @Test
    public void test1() {
        Assertions.assertEquals("grimy", Task1924.solution(2));
    }
}
