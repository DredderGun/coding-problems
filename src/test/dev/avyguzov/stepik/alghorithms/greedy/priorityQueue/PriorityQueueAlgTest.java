package dev.avyguzov.stepik.alghorithms.greedy.priorityQueue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PriorityQueueAlgTest {

    PriorityQueueAlg alg = new PriorityQueueAlg();

    @BeforeAll
    public void init() {
        alg = new PriorityQueueAlg();
    }

    @Test
    public void testSimpleCase() {
        alg.addNewEl(200);
        alg.addNewEl(10);
        Assertions.assertEquals(new Integer(200), alg.extractMax());
        alg.addNewEl(5);
        alg.addNewEl(500);
        Assertions.assertEquals(new Integer(500), alg.extractMax());
    }

    @Test
    public void testSneakyCase() {
        alg.addNewEl(200);
        alg.addNewEl(10);
        alg.addNewEl(5);
        alg.addNewEl(500);
        Assertions.assertEquals(new Integer(500), alg.extractMax());
        Assertions.assertEquals(new Integer(200), alg.extractMax());
        Assertions.assertEquals(new Integer(10), alg.extractMax());
        Assertions.assertEquals(new Integer(5), alg.extractMax());
    }

    @Test
    public void testWithOneArg() {
        alg.addNewEl(500);
        Assertions.assertEquals(new Integer(500), alg.extractMax());
    }

    @Test
    public void testCase() {
        alg.addNewEl(772);
        alg.addNewEl(168);
        alg.addNewEl(157);
        Assertions.assertEquals(new Integer(772), alg.extractMax());
        alg.addNewEl(930);
        alg.addNewEl(944);
        Assertions.assertEquals(new Integer(944), alg.extractMax());
        Assertions.assertEquals(new Integer(930), alg.extractMax());
        Assertions.assertEquals(new Integer(168), alg.extractMax());
        Assertions.assertEquals(new Integer(157), alg.extractMax());
    }

    // случай, когда бОльший потомок справа можно обойти мимо
    @Test
    public void testCaseWithRightLargerChild() {
        alg.addNewEl(2);
        alg.addNewEl(3);
        alg.addNewEl(15);
        alg.addNewEl(18);
        alg.addNewEl(12);
        Assertions.assertEquals(new Integer(18), alg.extractMax());
        Assertions.assertEquals(new Integer(15), alg.extractMax());
        Assertions.assertEquals(new Integer(12), alg.extractMax());
    }

    @Test
    public void testSameArgs() {
        alg.addNewEl(500);
        alg.addNewEl(500);
        alg.addNewEl(500);
        alg.addNewEl(500);
        Assertions.assertEquals(new Integer(500), alg.extractMax());
        Assertions.assertEquals(new Integer(500), alg.extractMax());
        Assertions.assertEquals(new Integer(500), alg.extractMax());
        Assertions.assertEquals(new Integer(500), alg.extractMax());
    }

    @Test
    public void testWithManyValues() {
        for (int i = 0; i <= 21; i++) {
            alg.addNewEl(i);
        }
        for (int i = 21; i >= 0; i--) {
            Assertions.assertEquals(new Integer(i), alg.extractMax());
        }
    }
}
