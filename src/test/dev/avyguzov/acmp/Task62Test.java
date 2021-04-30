package dev.avyguzov.acmp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task62Test {
    @Test
    public void simpleTest() {
        Assertions.assertEquals("BLACK", Task62.solution("C3"));
        Assertions.assertEquals("WHITE", Task62.solution("G8"));
        Assertions.assertEquals("BLACK", Task62.solution("E5"));
    }
}
