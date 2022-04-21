package dev.avyguzov.common.graphAlgorithms.broadSearch;

import java.util.ArrayList;
import java.util.List;

/*
 * Simple node.
 *
 * @author Aleksandr Vyguzov
 */
public class NodeBFS {
    public List<NodeBFS> childes;
    public String name;

    public NodeBFS(String name) {
        this.name = name;
        this.childes = new ArrayList<>();
    }
}
