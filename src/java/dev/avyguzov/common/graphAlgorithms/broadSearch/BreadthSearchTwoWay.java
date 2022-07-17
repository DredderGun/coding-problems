package dev.avyguzov.common.graphAlgorithms.broadSearch;

import java.util.*;

/**
 * Леон и Матильда собрались пойти в магазин за молоком. Их хочет поймать Стэнсфилд, поэтому нашим товарищам нужно сделать это
 * как можно быстрее. Каково минимальное количество улиц, по которым пройдёт хотя бы один из ребят (либо Матильда, либо Леон, либо
 * оба вместе)?
 *
 * Формат ввода
 * Первая строка содержит количество вершин n (1 ≤ n ≤ 105), количество ребер m (0 ≤ m ≤ 105) и номера вершин графа leon, matilda,
 * milk, в которых находятся соответственно Леон, Матильда и магазин с молоком.
 * Следующие m строк содержат ребра графа. В каждой строке два числа, разделенные пробелом, если между i и j существует ребро.
 * Гарантируется, что в графе нет петель и мультиребер.
 *
 * Формат вывода
 * Одно число – количество ребер
 *
 * Пример 1
 * Ввод
 * 3 2 1 2 3
 * 1 3
 * 2 3
 * Вывод
 * 2
 * Пример 2
 * ----------
 * Ввод
 * 3 2 1 2 3
 * 1 3
 * 1 2
 * Вывод
 * 2
 */
public class BreadthSearchTwoWay {
    public class Edge {
        public int vert1;
        public int vert2;

        public Edge(int vert1, int vert2) {
            this.vert1 = vert1;
            this.vert2 = vert2;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Edge edge = (Edge) o;
            return vert1 == edge.vert1 && vert2 == edge.vert2 ||
                    vert2 == edge.vert1 && vert1 == edge.vert2;
        }

        @Override
        public int hashCode() {
            return vert1 + vert2;
        }
    }
    private final LinkedList<Integer>[] graph;

    public BreadthSearchTwoWay(int n) {
        graph = new LinkedList[n];
    }

    public void addEdge(int vertex1, int vertex2) {
        if (graph[vertex1] == null) {
            graph[vertex1] = new LinkedList<>();
        }
        if (graph[vertex2] == null) {
            graph[vertex2] = new LinkedList<>();
        }
        graph[vertex1].add(vertex2);
        graph[vertex2].add(vertex1);
    }

    private HashSet<Edge> backtracePath(HashMap<Integer, Integer> parents, int currI) {
        var path = new HashSet<Edge>();
        
        while (parents.get(currI) != null) {
            path.add(new Edge(parents.get(currI), currI));
            currI = parents.get(currI);
        }
        return path;
    }

    private HashSet<Edge> getShortestPath(int v1, int targetI) {
        var shortestPath = new HashSet<Edge>();
        var parents = new HashMap<Integer, Integer>();
        var queue = new LinkedList<Integer>();
        boolean[] visited = new boolean[graph.length];
        queue.add(v1);
        int currV;
        while (!queue.isEmpty()) {
            currV = queue.pollLast();
            if (visited[currV]) {
                continue;
            }
            if (currV == targetI) {
                shortestPath = backtracePath(parents, currV);
                break;
            }
            for (int adjV : graph[currV]) {
                if (!visited[adjV]) {
                    parents.put(adjV, currV);
                    queue.add(adjV);
                }
            }
            visited[currV] = true;
        }

        return shortestPath;
    }

    private int getCommonEdgesCount(HashSet<Edge> smallerSet, HashSet<Edge> biggerSet) {
        int commonCnt = 0;
        for (Edge ed : smallerSet) {
            if (biggerSet.contains(ed)) {
                commonCnt++;
            }
        }
        return commonCnt + smallerSet.size() - commonCnt + biggerSet.size() - commonCnt;
    }

    public int start(int v1, int v2, int targetI) {
        if (graph.length <= 1) {
            return 0;
        }
        var shortestPath1 = getShortestPath(v1, targetI);
        var shortestPath2 = getShortestPath(v2, targetI);

        if (shortestPath1.size() > shortestPath2.size()) {
            return getCommonEdgesCount(shortestPath2, shortestPath1);
        } else {
            return getCommonEdgesCount(shortestPath1, shortestPath2);
        }
    }
}
