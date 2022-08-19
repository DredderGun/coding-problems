package dev.avyguzov.stepik.data.structures.trees;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeBFSTest {

    @Test
    void simpleTest1() {
        BinaryTreeBFS bfs = new BinaryTreeBFS();
        int[][] tree = new int[][] {
                new int[] {0, 7, 2},
                new int[] {10, -1, -1},
                new int[] {20, -1, 6},
                new int[] {30, 8, 9},
                new int[] {40, 3, -1},
                new int[] {50, -1, -1},
                new int[] {60, 1, -1},
                new int[] {70, 5, 4},
                new int[] {80, -1, -1},
                new int[] {90, -1, -1}};
        StringBuilder sb = new StringBuilder();
        bfs.inOrderPrint(tree, 0, sb);
        Assertions.assertEquals("50 70 80 30 90 40 0 20 10 60", sb.toString().trim());
        sb = new StringBuilder();
        bfs.preOrderPrint(tree, 0, sb);
        Assertions.assertEquals("0 70 50 40 30 80 90 20 60 10", sb.toString().trim());
        sb = new StringBuilder();
        bfs.postOrderPrint(tree, 0, sb);
        Assertions.assertEquals("50 80 90 30 40 70 10 60 20 0", sb.toString().trim());
    }

    @Test
    void simpleTest2() {
        BinaryTreeBFS bfs = new BinaryTreeBFS();
        int[][] tree = new int[][] {
                new int[] {4, 1, 2},
                new int[] {2, 3, 4},
                new int[] {5, -1, -1},
                new int[] {1, -1, -1},
                new int[] {3, -1, -1}};
        StringBuilder sb = new StringBuilder();
        bfs.inOrderPrint(tree, 0, sb);
        Assertions.assertEquals("1 2 3 4 5", sb.toString().trim());
        sb = new StringBuilder();
        bfs.preOrderPrint(tree, 0, sb);
        Assertions.assertEquals("4 2 1 3 5", sb.toString().trim());
        sb = new StringBuilder();
        bfs.postOrderPrint(tree, 0, sb);
        Assertions.assertEquals("1 3 2 5 4", sb.toString().trim());
    }
}