package dev.avyguzov.common.graphAlgorithms.broadSearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BreadthSearchTwoWayTest {
    @Test
    void simpleTest1() {
        var o = new BreadthSearchTwoWay(3);
        o.addEdge(0, 2);
        o.addEdge(1, 2);
        Assertions.assertEquals(2, o.start(0, 1, 2));
    }

    @Test
    void simpleTest2() {
        var o = new BreadthSearchTwoWay(3);
        o.addEdge(0, 2);
        o.addEdge(0, 1);
        o.start(0, 1, 2);
        Assertions.assertEquals(2, o.start(0, 1, 2));
    }

    @Test
    void simpleTest3() {
        var o = new BreadthSearchTwoWay(1);
        Assertions.assertEquals(0, o.start(0, 1, 2));
    }

    @Test
    void simpleTest4() {
        var o = new BreadthSearchTwoWay(2);
        o.addEdge(0, 1);
        Assertions.assertEquals(1, o.start(0, 1, 0));
    }
}