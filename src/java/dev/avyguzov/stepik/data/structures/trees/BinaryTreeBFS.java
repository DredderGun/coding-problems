package dev.avyguzov.stepik.data.structures.trees;

import java.util.Scanner;

/**
 * Exercise 6.1
 * https://stepik.org/lesson/45970/step/1?unit=24123
 *
 * Just print a tree in In-order, pre-order, post-order
 */
public class BinaryTreeBFS {
    public void postOrderPrint(int[][] tree, int node, StringBuilder result) {
        if (tree[node][1] != -1) {
            postOrderPrint(tree, tree[node][1], result);
        }
        if (tree[node][2] != -1) {
            postOrderPrint(tree, tree[node][2], result);
        }
        result.append(tree[node][0]).append(" ");
    }

    public void preOrderPrint(int[][] tree, int node, StringBuilder result) {
        result.append(tree[node][0]).append(" ");
        if (tree[node][1] != -1) {
            preOrderPrint(tree, tree[node][1], result);
        }
        if (tree[node][2] != -1) {
            preOrderPrint(tree, tree[node][2], result);
        }
    }

    public void inOrderPrint(int[][] tree, int node, StringBuilder result) {
        if (tree[node][1] != -1) {
            inOrderPrint(tree, tree[node][1], result);
        }
        result.append(tree[node][0]).append(" ");
        if (tree[node][2] != -1) {
            inOrderPrint(tree, tree[node][2], result);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[][] tree = new int[n][];
        for (int i = 0; i < n; i++) {
            tree[i] = new int[] {in.nextInt(), in.nextInt(), in.nextInt()};
        }

        BinaryTreeBFS bfs = new BinaryTreeBFS();
        StringBuilder sb = new StringBuilder();
        bfs.inOrderPrint(tree, 0, sb);
        sb.deleteCharAt(sb.length() - 1).append("\n");
        bfs.preOrderPrint(tree, 0, sb);
        sb.deleteCharAt(sb.length() - 1).append("\n");
        bfs.postOrderPrint(tree, 0, sb);
        System.out.println(sb.toString().trim());
    }
}
