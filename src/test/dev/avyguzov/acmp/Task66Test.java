package dev.avyguzov.acmp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task66Test {
    @Test
    public void simpleTest() {
        Assertions.assertEquals('w', Task66.solution("q"));
        Assertions.assertEquals('y', Task66.solution("t"));
        Assertions.assertEquals('a', Task66.solution("p"));
        Assertions.assertEquals('z', Task66.solution("l"));
        Assertions.assertEquals('q', Task66.solution("m"));
    }
}
