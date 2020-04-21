#include <stdio.h>
int row, col;

int floodFill(char graph[][col])
{
    int count = 0;
    int i, j;
    for (i = 0; i < row; i++)
    {
        for (j = 0; j < col; i++)
        {
            if (graph[i][j] == 'l')
            {
                count += dfs(graph, i, j);
            }
        }
    }
}

int dfs(char graph[][col], int i, int j)
{
    if (i < 0 || j < 0 || i > row || j > col)
        return 0;

    graph[i][j] = 'w';
    dfs(graph, i - 1, j);
    dfs(graph, i, j + 1);
    dfs(graph, i - 1, j - 1);
    dfs(graph, i - 1, j);
    dfs(graph, i - 1, j + 1);
    dfs(graph, i + 1, j - 1);
    dfs(graph, i + 1, j);
    dfs(graph, i - 1, j + 1);

    return 1;
}
int main()
{

    return 0;
}