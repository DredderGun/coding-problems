package dev.avyguzov.other;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParenthesesTaskTest {

    @Test
    public void test1() {
        String targetString = "()";

        ParenthesesTask bt = new ParenthesesTask();
        assertTrue(bt.solution(targetString));
    }

    @Test
    public void test2() {
        String targetString = "()[]{}";

        ParenthesesTask bt = new ParenthesesTask();
        assertTrue(bt.solution(targetString));
    }

    @Test
    public void test3() {
        String targetString = "(]";

        ParenthesesTask bt = new ParenthesesTask();
        assertFalse(bt.solution(targetString));
    }

    @Test
    public void test4() {
        String targetString = "([)]";

        ParenthesesTask bt = new ParenthesesTask();
        assertFalse(bt.solution(targetString));
    }

    @Test
    public void test5() {
        String targetString = "{[]}";

        ParenthesesTask bt = new ParenthesesTask();
        assertTrue(bt.solution(targetString));
    }

    @Test
    public void test6() {
        String targetString = "{{{((";

        ParenthesesTask bt = new ParenthesesTask();
        assertFalse(bt.solution(targetString));
    }

    @Test
    public void test7() {
        String targetString = "(])";

        ParenthesesTask bt = new ParenthesesTask();
        assertFalse(bt.solution(targetString));
    }

}