package dev.avyguzov.other;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class YandexTaskTest {
    @Test
    public void simpleTest() {
        Assertions.assertEquals("3a2f4cd", YandexTask.solution("aaaffccccd"));
    }

    @Test
    public void simpleTest2() {
        Assertions.assertEquals("3a2f6c", YandexTask.solution("aaaffcccccc"));
    }

    @Test
    public void simpleTest3() {
        Assertions.assertEquals("3u", YandexTask.solution("uuu"));
    }
}
