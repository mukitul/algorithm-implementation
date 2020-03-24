let mat = [[],[]];
let visited = [];
function addEdge(u, v) {
    mat[[u],[v]] = 1;
}

function dfs(s) {
    console.log(s);
    visited[s] = 1;
    for (let i = 0; i < vertex; i++) {
        if (mat[[s],[i]] == 1 && visited[i] == 0) {
            dfs(i);
        }
    }
}

let vertex = 5;
addEdge(0, 1);
addEdge(0, 2);
addEdge(1, 3);
addEdge(1, 4);
console.log(mat[[0],[1]]);

function initVisited() {
    for (let index = 0; index < vertex; index++) {
        visited[index] = 0;
    }
}
initVisited();
dfs(0);