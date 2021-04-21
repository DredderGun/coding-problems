package dev.avyguzov.acmp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task52Test {
    @Test
    public void simpleTest() {
        Assertions.assertEquals("YES", Task52.solution(385916));
        Assertions.assertEquals("NO", Task52.solution(123456));
        Assertions.assertEquals("NO", Task52.solution(1));
        Assertions.assertEquals("YES", Task52.solution(100001));
        Assertions.assertEquals("NO", Task52.solution(55));
    }
}
