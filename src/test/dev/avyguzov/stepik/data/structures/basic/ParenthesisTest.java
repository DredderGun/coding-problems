package dev.avyguzov.stepik.data.structures.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ParenthesisTest {
    @Test
    public void testFromDesc() {
        Assertions.assertEquals("Success", Parenthesis.solution("([](){([])})"));
    }

    @Test
    public void testFromDesc2() {
        Assertions.assertEquals("5", Parenthesis.solution("()[]}"));
    }

    @Test
    public void testFromDesc3() {
        Assertions.assertEquals("7", Parenthesis.solution("{{[()]]"));
    }

    @Test
    public void testSimple() {
        Assertions.assertEquals("Success", Parenthesis.solution("[]"));
    }

    @Test
    public void testSimple2() {
        Assertions.assertEquals("Success", Parenthesis.solution("{}[]"));
    }

    @Test
    public void testSimple3() {
        Assertions.assertEquals("Success", Parenthesis.solution("[()]"));
    }

    @Test
    public void testSimple4() {
        Assertions.assertEquals("Success", Parenthesis.solution("(())"));
    }

    @Test
    public void testSimple5() {
        Assertions.assertEquals("Success", Parenthesis.solution("{[]}()"));
    }

    @Test
    public void testSimple6() {
        Assertions.assertEquals("1", Parenthesis.solution("{"));
    }

    @Test
    public void testSimple7() {
        Assertions.assertEquals("3", Parenthesis.solution("{[}"));
    }

    @Test
    public void testSimple8() {
        Assertions.assertEquals("Success", Parenthesis.solution("foo(bar);"));
    }

    @Test
    public void testSimple9() {
        Assertions.assertEquals("10", Parenthesis.solution("foo(bar[i);"));
    }
}
