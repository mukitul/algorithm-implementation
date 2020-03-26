package main

import "fmt"

var mat [10][10]int

func dfs(s int, visited [5]int) {
	fmt.Print(s, " ")
	visited[s] = 1
	for i := 0; i < len(visited); i++ {
		if mat[s][i] == 1 && visited[i] == 0 {
			dfs(i, visited)
		}
	}
}

func addEdge(u int, v int) {
	mat[u][v] = 1
}

func main() {

	var visited [5]int
	//visited = make([]int, 5, 5)
	addEdge(0, 1)
	addEdge(0, 2)
	addEdge(1, 3)
	addEdge(1, 4)

	dfs(0, visited)
}
