package dev.avyguzov.acmp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task331Test {
    @Test
    public void simpleTest() {
        Assertions.assertEquals("10:10", Task331.solution("00:00", "10 10"));
        Assertions.assertEquals("05:08", Task331.solution("01:02", "4 6"));
        Assertions.assertEquals("09:00", Task331.solution("11:00", "22 0"));

        Assertions.assertEquals("00:00", Task331.solution("23:59", "0 1"));
        Assertions.assertEquals("00:09", Task331.solution("23:59", "0 10"));
    }
}
