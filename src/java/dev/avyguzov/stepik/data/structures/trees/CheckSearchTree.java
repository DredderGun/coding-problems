package dev.avyguzov.stepik.data.structures.trees;

import java.util.Scanner;

/**
 * Exercise 6.2
 * https://stepik.org/lesson/45970/step/2?unit=24123
 *
 * Check search tree for correctness
 */
public class CheckSearchTree {
    public static class IncorrectSearchTree extends Exception { }
    private long lastVertex = -1;
    public void checkTree(long[][] tree, int vInd) throws IncorrectSearchTree {
        if (tree.length == 0) {
            return;
        }
        int leftInd = (int) tree[vInd][1];
        int rightInd = (int) tree[vInd][2];
        if (leftInd != -1) {
            checkTree(tree, leftInd);
        }
        if (lastVertex != -1 && lastVertex >= tree[vInd][0]) {
            throw new IncorrectSearchTree();
        }
        lastVertex = tree[vInd][0];

        if (rightInd != -1) {
            checkTree(tree, rightInd);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        long[][] tree = new long[n][];
        for (int i = 0; i < n; i++) {
            tree[i] = new long[] {in.nextLong(), in.nextInt(), in.nextInt()};
        }

        CheckSearchTree checker = new CheckSearchTree();
        boolean isCorrect = true;
        try {
            checker.checkTree(tree, 0);
        } catch (IncorrectSearchTree ex) {
            isCorrect = false;
        }

        if (isCorrect) {
            System.out.println("CORRECT");
        } else {
            System.out.println("INCORRECT");
        }
    }
}
