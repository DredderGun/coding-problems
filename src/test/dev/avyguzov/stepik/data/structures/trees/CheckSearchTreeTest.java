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
            searchTree.checkTreeWithoutRecur(tree, 0);
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
            searchTree.checkTreeWithoutRecur(tree, 0);
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
            searchTree.checkTreeWithoutRecur(tree, 0);
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
            searchTree.checkTreeWithoutRecur(tree, 0);
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
            searchTree.checkTreeWithoutRecur(tree, 0);
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
            searchTree.checkTreeWithoutRecur(tree, 0);
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
            searchTree.checkTreeWithoutRecur(tree, 0);
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
            searchTree.checkTreeWithoutRecur(tree, 0);
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
            searchTree.checkTreeWithoutRecur(tree, 0);
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
            searchTree.checkTreeWithoutRecur(tree, 0);
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
            searchTree.checkTreeWithoutRecur(tree, 0);
        } catch (CheckSearchTree.IncorrectSearchTree ex) {
            isEx = true;
        }
        assertTrue(isEx);
    }

    @Test
    void simpleTest12() {
        CheckSearchTree searchTree = new CheckSearchTree();
        boolean isEx = false;
        long[][] tree = new long[][] {
                new long[] {2, 1, 2},
                new long[] {1, 3, -1},
                new long[] {3, -1, -1},
                new long[] {1, -1, -1},};
        try {
            searchTree.checkTreeWithoutRecur(tree, 0);
        } catch (CheckSearchTree.IncorrectSearchTree ex) {
            isEx = true;
        }
        assertTrue(isEx);
    }

    @Test
    void simpleTest13() {
        CheckSearchTree searchTree = new CheckSearchTree();
        boolean isEx = false;
        long[][] tree = new long[][] {
                new long[] {2, -1, 1},
                new long[] {3, 2, -1},
                new long[] {3, -1, -1}};
        try {
            searchTree.checkTreeWithoutRecur(tree, 0);
        } catch (CheckSearchTree.IncorrectSearchTree ex) {
            isEx = true;
        }
        assertTrue(isEx);
    }

//    2
//            -2147483648 1 -1
//            -1000000000 -1 -1

    @Test
    void simpleTest14() {
        CheckSearchTree searchTree = new CheckSearchTree();
        boolean isEx = false;
        long[][] tree = new long[][] {
                new long[] {-2147483648, 1, -1},
                new long[] {-1000000000, -1, -1}};
        try {
            searchTree.checkTreeWithoutRecur(tree, 0);
        } catch (CheckSearchTree.IncorrectSearchTree ex) {
            isEx = true;
        }
        assertTrue(isEx);
    }

    @Test
    void simpleTest15() {
        CheckSearchTree searchTree = new CheckSearchTree();
        boolean isEx = false;
        long[][] tree = new long[][] {
                new long[] {-1000000000, -1, -1},
                new long[] {-2147483648, 1, -1}
        };
        try {
            searchTree.checkTreeWithoutRecur(tree, 0);
        } catch (CheckSearchTree.IncorrectSearchTree ex) {
            isEx = true;
        }
        assertFalse(isEx);
    }

    @Test
    void simpleTest16() {
        CheckSearchTree searchTree = new CheckSearchTree();
        boolean isEx = false;
        long[][] tree = new long[][] {
                new long[] {8, -1, 1},
                new long[] {9, -1, 2},
                new long[] {9, 3, 4},
                new long[] {8, -1, -1},
                new long[] {10, -1, 5},
                new long[] {10, -1, -1},
        };
        try {
            searchTree.checkTreeWithoutRecur(tree, 0);
        } catch (CheckSearchTree.IncorrectSearchTree ex) {
            isEx = true;
        }
        assertTrue(isEx);
    }
}