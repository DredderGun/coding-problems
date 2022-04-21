package dev.avyguzov.stepik.data.structures.basic;

import java.util.*;

/**
 * Tree height.
 * https://stepik.org/lesson/41234/step/2?thread=solutions&unit=19818
 */
public class TreeHeightWithQueue {

    private int run(HashMap<Integer, List<Integer>> tree) {
        Queue<Integer> nodesQueue = new LinkedList<>();

        nodesQueue.add(tree.get(-1).get(0));
        int height = 1;
        while (!nodesQueue.isEmpty()) {
            List<Integer> nextLevel = new ArrayList<>();
            while (!nodesQueue.isEmpty()) {
                int nextParent = nodesQueue.remove();
                List<Integer> child = tree.get(nextParent);
                if (child != null) {
                    nextLevel.addAll(child);
                }
            }
            if (!nextLevel.isEmpty()) {
                nodesQueue.addAll(nextLevel);
                height++;
            }
        }

        return height;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        HashMap<Integer, List<Integer>> tree = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int finalI = i;
            int currNode = in.nextInt();

            tree.compute(currNode, (key, oldValue) -> {
                if (oldValue == null) {
                    oldValue = new ArrayList<>();
                }
                oldValue.add(finalI);
                return oldValue;
            });
        }

        TreeHeightWithQueue th = new TreeHeightWithQueue();
        System.out.println(th.run(tree));
    }
}
