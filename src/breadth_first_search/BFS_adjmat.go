package main

import "fmt"

var mat [10][10]int

func size(queue []int) int {
	return len(queue)
}

func enqueue(queue []int, element int) []int {
	queue = append(queue, element)
	return queue
}

func peek(queue []int) int {
	return queue[0]
}

func dequeue(queue []int) []int {
	return queue[1:]
}

func addEdge(u int, v int) {
	mat[u][v] = 1
}

func bfs(s int, visited [5]int) {
	var queue []int
	queue = enqueue(queue, s)

	for size(queue) > 0 {

		var a int
		a = peek(queue)
		fmt.Println(a)
		visited[a] = 1

		queue = dequeue(queue)

		for i := 0; i < 5; i++ {
			if mat[a][i] == 1 && visited[i] == 0 {
				queue = enqueue(queue, i)
			}
		}
	}
}

func main() {
	var visited [5]int

	addEdge(0, 1)
	addEdge(0, 2)
	addEdge(1, 3)
	addEdge(1, 4)

	bfs(0, visited)
}
