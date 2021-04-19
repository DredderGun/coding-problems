package dev.avyguzov.acmp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task550Test {

    @Test
    public void simpleTest() {
        Assertions.assertEquals("12/09/2000", Task550.solution(2000));
        Assertions.assertEquals("13/09/2009", Task550.solution(2009));
        Assertions.assertEquals("12/09/0008", Task550.solution(8));
        Assertions.assertEquals("13/09/0009", Task550.solution(9));
        Assertions.assertEquals("12/09/0400", Task550.solution(400));
    }
}
