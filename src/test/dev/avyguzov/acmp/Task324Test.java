package dev.avyguzov.acmp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task324Test {
    @Test
    public void simpleTest() {
        Assertions.assertEquals("YES", Task324.solution(6116));
        Assertions.assertEquals("NO", Task324.solution(1231));
        Assertions.assertEquals("NO", Task324.solution(1000));
        Assertions.assertEquals("YES", Task324.solution(9999));
    }
}
