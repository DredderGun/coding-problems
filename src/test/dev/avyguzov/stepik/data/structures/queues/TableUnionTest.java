package dev.avyguzov.stepik.data.structures.queues;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TableUnionTest {

    @Test
    void simpleTest1() {
        int[] tables = new int[] {1, 1, 1, 1, 1};
        int[] parents = new int[] {0, 1, 2, 3, 4};
        Assertions.assertEquals(2, TableUnion.union(tables, parents, 2, 4));
        Assertions.assertEquals(2, TableUnion.union(tables, parents, 1, 3));
        Assertions.assertEquals(3, TableUnion.union(tables, parents, 0, 3));
        Assertions.assertEquals(5, TableUnion.union(tables, parents, 4, 3));
        Assertions.assertEquals(5, TableUnion.union(tables, parents, 4, 2));
    }

    @Test
    void simpleTest2() {
        int[] tables = new int[] {10, 0, 5, 0, 3, 3};
        int[] parents = new int[] {0, 1, 2, 3, 4, 5};
        Assertions.assertEquals(3, TableUnion.union(tables, parents, 5, 5));
        Assertions.assertEquals(6, TableUnion.union(tables, parents, 5, 4));
        Assertions.assertEquals(6, TableUnion.union(tables, parents, 4, 3));
        Assertions.assertEquals(11, TableUnion.union(tables, parents, 3, 2));
    }
}