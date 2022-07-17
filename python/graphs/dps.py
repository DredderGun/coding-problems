# recursive Depth-first search
def dps_recur(graph, visited, curr_v):
    print(curr_v)
    visited[curr_v] = True
    for i in range(len(graph[curr_v])):
        if not visited[graph[curr_v][i]]:
            dps_recur(graph, visited, graph[curr_v][i])


# iterative Depth-first search
def dps_iter(graph):
    visited = [False] * len(graph)
    next_for_visit = [0]
    while not len(next_for_visit) == 0:
        curr_v = next_for_visit.pop()
        if not visited[curr_v]:
            print(curr_v)
            visited[curr_v] = True
            next_for_visit.extend(graph[curr_v])


if __name__ == "__main__":
    graph = [
        [1, 2],
        [0, 2, 3],
        [0, 1, 7],
        [1, 4, 5],
        [3],
        [3, 6],
        [5],
        [2]
    ]
    # dps_recur(graph, [False]*len(graph), 0)
    dps_iter(graph)
