package flood_fill;

public class FloodFillImpl {

    public boolean[][] visited;

    FloodFillImpl(int r, int c) {
        visited = new boolean[r][c];
    }

    public int floodFill(char[][] graph) {
        int count = 0;
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[0].length; j++) {
                if (graph[i][j] == 'l' && !visited[i][j]) {
                    count++;
                    dfs(graph, i, j);
                }
            }
        }
        return count;
    }

    public void dfs(char[][] graph, int i, int j) {
        if (i < 0 || i >= graph.length || j < 0 || j >= graph[0].length) {
            return;
        }

        if (graph[i][j] == 'l' && !visited[i][j]) {
            visited[i][j] = true;
            dfs(graph, i - 1, j);
            dfs(graph, i, j + 1);
            dfs(graph, i - 1, j - 1);
            dfs(graph, i - 1, j);
            dfs(graph, i - 1, j + 1);
            dfs(graph, i + 1, j - 1);
            dfs(graph, i + 1, j);
            dfs(graph, i - 1, j + 1);
        }

    }

    public static void main(String[] args) {
        char[][] graph = { { 'w', 'w', 'w', 'w' }, { 'l', 'l', 'w', 'w' }, { 'w', 'l', 'l', 'w' },
                { 'w', 'w', 'w', 'w' }, { 'l', 'l', 'l', 'w' } };
        int row = graph.length;
        int col = graph[0].length;
        FloodFillImpl ffi = new FloodFillImpl(row, col);

        int res = ffi.floodFill(graph);
        System.out.println("region: " + res);
    }
}