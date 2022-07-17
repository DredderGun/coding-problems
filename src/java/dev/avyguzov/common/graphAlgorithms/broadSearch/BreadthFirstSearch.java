package dev.avyguzov.common.graphAlgorithms.broadSearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Instance of that class get a value of the shortest track to a required node in a graph.
 *
 * @author Aleksandr Vyguzov
 */
public class BreadthFirstSearch {

    static public class NodeBFS {
        public List<NodeBFS> childes;
        public String name;

        public NodeBFS(String name) {
            this.name = name;
            this.childes = new ArrayList<>();
        }
    }

    protected List<NodeBFS> visitedNodes = new ArrayList<>();

    protected List<List<NodeBFS>> startSearch(NodeBFS node) {
        List<List<NodeBFS>> nodesQueue = new ArrayList<>();
        nodesQueue.add(Collections.singletonList(node));
        checkLevel(node.childes, nodesQueue);
        return nodesQueue;
    }

    protected void checkLevel(List<NodeBFS> levelNodes, List<List<NodeBFS>> nodesQueue) {
        nodesQueue.add(levelNodes);
        visitedNodes.addAll(levelNodes);

        ArrayList<NodeBFS> nextLevel = new ArrayList<>();
        levelNodes.forEach((NodeBFS node) ->
            node.childes.forEach(child -> {
                if (!visitedNodes.contains(child))
                    nextLevel.add(child);
            })
        );

        if (nextLevel.size() > 0)
            checkLevel(nextLevel, nodesQueue);
    }

    public Integer shortestWay(NodeBFS rootNode, String requiredNodeName) {
        List<List<NodeBFS>> nodesQueue = startSearch(rootNode);
        Integer level = 0;
        for (List<NodeBFS> nodes : nodesQueue) {
            for (NodeBFS node : nodes) {
                if (node.name.equals(requiredNodeName)) {
                    return level;
                }
            }
            level++;
        }

        return -1;
    }
}
