package dev.avyguzov.stepik.data.structures.trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckSearchTreeTest {

    @Test
    void simpleTest1() {
        CheckSearchTree searchTree = new CheckSearchTree();
        boolean isEx = false;
        long[][] tree = new long[][] {
                new long[] {2, 1, 2},
                new long[] {1, -1, -1},
                new long[] {3, -1, -1}};
        try {
            searchTree.checkTree(tree, 0);
        } catch (CheckSearchTree.IncorrectSearchTree ex) {
            isEx = true;
        }
        assertFalse(isEx);
    }

    @Test
    void simpleTest2() {
        CheckSearchTree searchTree = new CheckSearchTree();
        boolean isEx = false;
        long[][] tree = new long[][] {
                new long[] {1, 1, 2},
                new long[] {2, -1, -1},
                new long[] {3, -1, -1}};
        try {
            searchTree.checkTree(tree, 0);
        } catch (CheckSearchTree.IncorrectSearchTree ex) {
            isEx = true;
        }
        assertTrue(isEx);
    }

    @Test
    void simpleTest3() {
        CheckSearchTree searchTree = new CheckSearchTree();
        boolean isEx = false;
        long[][] tree = new long[][] {};
        try {
            searchTree.checkTree(tree, 0);
        } catch (CheckSearchTree.IncorrectSearchTree ex) {
            isEx = true;
        }
        assertFalse(isEx);
    }

    @Test
    void simpleTest4() {
        CheckSearchTree searchTree = new CheckSearchTree();
        boolean isEx = false;
        long[][] tree = new long[][] {
                new long[] {1, -1, 1},
                new long[] {2, -1, 2},
                new long[] {3, -1, 3},
                new long[] {4, -1, 4},
                new long[] {5, -1, -1}};
        try {
            searchTree.checkTree(tree, 0);
        } catch (CheckSearchTree.IncorrectSearchTree ex) {
            isEx = true;
        }
        assertFalse(isEx);
    }

    @Test
    void simpleTest5() {
        CheckSearchTree searchTree = new CheckSearchTree();
        boolean isEx = false;
        long[][] tree = new long[][] {
                new long[] {4, 1, 2},
                new long[] {2, 3, 4},
                new long[] {6, 5, 6},
                new long[] {1, -1, -1},
                new long[] {3, -1, -1},
                new long[] {5, -1, -1},
                new long[] {7, -1, -1}};
        try {
            searchTree.checkTree(tree, 0);
        } catch (CheckSearchTree.IncorrectSearchTree ex) {
            isEx = true;
        }
        assertFalse(isEx);
    }

    @Test
    void simpleTest6() {
        CheckSearchTree searchTree = new CheckSearchTree();
        boolean isEx = false;
        long[][] tree = new long[][] {
                new long[] {4, 1, -1},
                new long[] {2, 2, 3},
                new long[] {1, -1, -1},
                new long[] {5, -1, -1}};
        try {
            searchTree.checkTree(tree, 0);
        } catch (CheckSearchTree.IncorrectSearchTree ex) {
            isEx = true;
        }
        assertTrue(isEx);
    }

    @Test
    void simpleTest7() {
        CheckSearchTree searchTree = new CheckSearchTree();
        boolean isEx = false;
        long[][] tree = new long[][] {
                new long[] {2, -1, 1},
                new long[] {5, 2, -1},
                new long[] {3, -1, 3},
                new long[] {5, -1, -1}};
        try {
            searchTree.checkTree(tree, 0);
        } catch (CheckSearchTree.IncorrectSearchTree ex) {
            isEx = true;
        }
        assertTrue(isEx);
    }

    @Test
    void simpleTest8() {
        CheckSearchTree searchTree = new CheckSearchTree();
        boolean isEx = false;
        long[][] tree = new long[][] {
                new long[] {4, 1, 2},
                new long[] {1, -1, 3},
                new long[] {5, -1, -1},
                new long[] {2, -1, 4},
                new long[] {3, 5, -1},
                new long[] {2, -1, -1}};
        try {
            searchTree.checkTree(tree, 0);
        } catch (CheckSearchTree.IncorrectSearchTree ex) {
            isEx = true;
        }
        assertFalse(isEx);
    }

    @Test
    void simpleTest9() {
        CheckSearchTree searchTree = new CheckSearchTree();
        boolean isEx = false;
        long[][] tree = new long[][] {
                new long[] {2147483647, -1, -1}
        };
        try {
            searchTree.checkTree(tree, 0);
        } catch (CheckSearchTree.IncorrectSearchTree ex) {
            isEx = true;
        }
        assertFalse(isEx);
    }

    @Test
    void simpleTest10() {
        CheckSearchTree searchTree = new CheckSearchTree();
        boolean isEx = false;
        long[][] tree = new long[][] {
                new long[] {9, 1, -1},
                new long[] {8, -1, 2},
                new long[] {9, -1, -1},
        };
        try {
            searchTree.checkTree(tree, 0);
        } catch (CheckSearchTree.IncorrectSearchTree ex) {
            isEx = true;
        }
        assertTrue(isEx);
    }

    @Test
    void simpleTest11() {
        CheckSearchTree searchTree = new CheckSearchTree();
        boolean isEx = false;
        long[][] tree = new long[][] {
                new long[] {5, 1, 2},
                new long[] {3, 3, 4},
                new long[] {5, -1, -1},
                new long[] {2, -1, -1},
                new long[] {4, 5, 6},
                new long[] {3, -1, -1},
                new long[] {5, -1, -1},
        };
        try {
            searchTree.checkTree(tree, 0);
        } catch (CheckSearchTree.IncorrectSearchTree ex) {
            isEx = true;
        }
        assertTrue(isEx);
    }
}