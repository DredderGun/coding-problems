# iterative Depth-first search
def dps_iter(graph, visited, color, curr_i):
    next_for_visit = [curr_i]
    while not len(next_for_visit) == 0:
        curr_v = next_for_visit.pop()
        if not visited[curr_v] and graph[curr_v] is not None:
            next_for_visit.extend(graph[curr_v])
        if not visited[curr_v]:
            print(graph[curr_v])
            visited[curr_v] = [True, color]


# search a connected component
def graph_components_count_search(graph):
    visited = [0] * len(graph)
    color = 1
    for i in range(len(graph)):
        if not visited[i]:
            dps_iter(graph, visited, color, i)
            color += 1
    return visited


if __name__ == "__main__":
    graph1 = [
        None,
        [2, 3],
        [1, 4],
        [1],
        [2],
        [6],
        [5],
        None,
        [9, 10],
        [8],
        [8]
    ]
    result = graph_components_count_search(graph1)
    print(result)
