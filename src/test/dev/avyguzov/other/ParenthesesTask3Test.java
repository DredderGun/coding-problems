package dev.avyguzov.other;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ParenthesesTask3Test {
    @Test
    public void test1() {
        ParenthesesTask3 bt = new ParenthesesTask3();
        assertEquals(bt.solution(1), Arrays.asList("()"));
    }

    @Test
    public void test2() {
        ParenthesesTask3 bt = new ParenthesesTask3();
        assertEquals(bt.solution(2), Arrays.asList("(())", "()()"));
    }

    @Test
    public void test3() {
        ParenthesesTask3 bt = new ParenthesesTask3();
        assertEquals(bt.solution(3), Arrays.asList("((()))", "(()())", "(())()", "()"));
    }
}