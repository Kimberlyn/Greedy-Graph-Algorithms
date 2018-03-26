# Greedy-Graph-Algorithms
This program computes a minimum cost spanning tree for a weighted graph and computes the single source shortest path tree for the same graph. It also computes the shortest path between two specified vertices.

### About Dijkstra's algorithm:
Dijkstra's algorithm is a greedy algorithm that determines the length of the shortest path from the starting vertex, s, to every other node in the given graph.

### The algorithm:
```
S ⟸ {s}

For each v ∉ S
  d(v) ⟸ ∞
  d(s) ⟸ 0

For each v in V
  PriorityQueue ⟸ v with key d(v)
 
While PriorityQueue ≠ ø
  u ⟸ PriorityQueue.delete-min
  For each edge e=(u,v) ∈ E leaving u
    If d(v) > d(u) + length(u,v)
      v.decrease-key ⟸ d(u) + length(u,v)
      d(v) ⟸ d(u) + length(u,v)
```
