# Algorithm Implementation

## Array/Sorting
1) [Kadanes Algorithm](src/kadanes_algorithm)
    - Implementation: [C](src/kadanes_algorithm/KadanesImpl.c), [Java](src/kadanes_algorithm/KadanesImpl.java), [JavaScript](src/kadanes_algorithm/KadanesImpl.js), [Go](src/kadanes_algorithm/KadanesImpl.go), [C#](src/kadanes_algorithm/KadanesImpl.cs)

2) [Sorting](src/sorting)
    * Merge Sort: [C](src/sorting/merge.c)
    * Quick Sort: [C](src/sorting/quick.c)
    * Sorting Comparison (Bubble, Selection and Insertion): [C](src/sorting/sorting-comparison.c)


## Graph 
- Ways of Representing Graph: [Adjacency Matrix vs Adjacency List](https://www.hackerearth.com/practice/algorithms/graphs/graph-representation/tutorial/)

|                  | Adjacency Matrix | Adjacency List |
|------------------|------------------|----------------|
| Space Complexity | O(V^2)           | O(V+E)         |
| Time Complexity  | O(1)             | O(V)           |


1) [Depth First Search (DFS) Algorithm](src/depth_first_search)
    - Implementation (Adjacency Matrix): [C](src/depth_first_search/DFS_adjmat.c), [Java](src/depth_first_search/DFS_adjmat.java), [JavaScript](src/depth_first_search/DFS_adjmat.js), [Go](src/depth_first_search/DFS_adjmat.go), [C#](src/depth_first_search/DFS_adjmat..cs)

2) [Breadth First Search (BFS) Algorithm](src/breadth_first_search)
    - Implementation (Adjacency Matrix): [Java](src/breadth_first_search/BFS_adjmat.java), [Go](src/breadth_first_search/BFS_adjmat.go)


3) [Flood Fill (Special DFS) Algorithm](src/flood_fill)
    - Implementation: [C](src/flood_fill/FloodFillImpl.c), [Java](src/flood_fill/FloodFillImpl.java)


4) [Binary Search Tree (BST) Algorithm](src/bst)
    - Implementation (Insert, Search): [C](src/bst/BinarySearchTree.c), [Java](src/bst/BinarySearchTree.java)