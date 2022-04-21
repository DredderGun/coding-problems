package dev.avyguzov.common.graphAlgorithms.dijkstra;

import app.greedy.huffmanСode.HuffmanCode;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

/**
 * Dijkstra search graph implementation. You can find the shortest tracks to a required node with findPathForNode
 * method.
 *
 * @author Aleksandr Vyguzov
 */
public class Dijkstra {

    public static class Node {
        Hashtable<Node, Integer> siblings = new Hashtable<>();
        String name;

        public Node(String name) {
            this.name = name;
        }

        public void addSibling(Node node, Integer val) {
            this.siblings.put(node, val);
        }
    }

    private static class Cost {
        public Integer val;
        public Node parent;
        public Cost(Integer cost, Node parent) {
            this.parent = parent;
            this.val = cost;
        }
    }

    private Hashtable<Node, Cost> costs = new Hashtable<>();
    private Hashtable<String, Node> processed = new Hashtable<>();

    /**
     * First build an object, then search a path
     *
     * @param startNode node from which tracks will be build.
     */
    public Dijkstra (Node startNode) {
        // put first node to common table
        costs.put(startNode, new Cost( 0, null));
        this.updateCostsForSiblings();
    }

    protected void updateCostsForSiblings() {
        Node parentNode;
        while ((parentNode = findCheapestNode()) != null) {
            Cost parentCostInfo = costs.get(parentNode);
            Integer parentCost = parentCostInfo.val;

            for (Map.Entry<Node, Integer> siblingNode : parentNode.siblings.entrySet()) {

                Node currentNode = siblingNode.getKey();
                Integer edge = siblingNode.getValue();

                Cost costInCommonTable = costs.get(currentNode);
                if (costInCommonTable == null || costInCommonTable.val > edge + parentCost) {
                    costs.put(currentNode, new Cost( edge + parentCost, parentNode));
                }
            }

            processed.put(parentNode.name, parentNode);
        }
    }

    protected Node findCheapestNode() {
        Integer cheapestCost = 9999999;
        Node cheapestNode = null;
        for (Map.Entry<Node, Cost> nodeEntry : costs.entrySet()) {
            Cost currentCost = nodeEntry.getValue();
            Node currentNode = nodeEntry.getKey();
            if (currentCost.val < cheapestCost && processed.get(currentNode.name) == null) {
                cheapestNode = currentNode;
                cheapestCost = currentCost.val;
            }
        }
        return cheapestNode;
    }

    public String findPathForNode(Node requiredNode) {
        StringBuilder resultStr = new StringBuilder(requiredNode.name + " <-");
        Cost cost = costs.get(requiredNode);
        while (cost.parent != null) {
            resultStr.append(cost.parent.name).append(" <-");
            cost = costs.get(cost.parent);
        }
        return resultStr.toString();
    }
}
