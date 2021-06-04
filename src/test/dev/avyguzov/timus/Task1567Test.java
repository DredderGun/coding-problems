package dev.avyguzov.timus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1567Test {
    @Test
    public void test1() {
        Assertions.assertEquals(114, Task1567.solution("pokupaite gvozdi tolko v kompanii gvozdederov i tovarischi!"));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(8, Task1567.solution("p r n"));
    }

    @Test
    public void test3() {
        Assertions.assertEquals(8, Task1567.solution("pr n"));
    }
}
