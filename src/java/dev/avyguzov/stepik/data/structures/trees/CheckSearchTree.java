package dev.avyguzov.stepik.data.structures.trees;

import java.util.Scanner;
import java.util.Stack;

/**
 * Exercise 6.2
 * https://stepik.org/lesson/45970/step/3?unit=24123
 * Check search tree for correctness. A correct search tree has vertexes that more than each vertex of left tree and more OR equal
 * than right tree.
 */
public class CheckSearchTree {
    public static class IncorrectSearchTree extends Exception { }

    /**
     * Check without a recursion
     * @param tree tree to check
     * @throws IncorrectSearchTree throws when search tree are incorrect
     */
    public void checkTreeWithoutRecur(long[][] tree, int rootInd) throws IncorrectSearchTree {
        if (tree.length == 0) {
            return;
        }

        int i = rootInd;
        long[] prev = new long[] {Long.MIN_VALUE, 0};
        Stack<Integer> stack = new Stack<>();
        while (!stack.isEmpty() || i != -1) {
            if (i != -1) {
                stack.push(i);
                i = (int) tree[i][1];
            } else {
                i = stack.pop();
                if (prev[1] == 1 && tree[i][0] <= prev[0] || prev[1] == 0 && tree[i][0] < prev[0]) {
                    throw new IncorrectSearchTree();
                }
                if (tree[i][2] != -1) {
                    prev = new long[] {tree[i][0], 0};
                } else {
                    prev = new long[] {tree[i][0], 1};
                }
                i = (int) tree[i][2];
            }
        }
    }

    private long lastVertex = -1;
    /**
     * Check with a recursion
     * @param tree tree to check
     * @param vInd root index
     * @throws IncorrectSearchTree throws when search tree are incorrect
     */
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
