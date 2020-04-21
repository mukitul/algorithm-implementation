#include <stdio.h>
int row = 5;
int col = 4;

int dfs(char graph[][col], int i, int j)
{
    if (i < 0 || j < 0 || i > row || j > col || graph[i][j] == 'w')
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

int floodFill(char graph[][col])
{
    int count = 0;
    int i, j;

    for (i = 0; i < row; i++)
    {
        for (j = 0; j < col; j++)
        {
            if (graph[i][j] == 'l')
            {
                count += dfs(graph, i, j);
            }
        }
    }
    return count;
}

int main()
{
    /* 
    'w', 'w', 'w', 'l'
    'l', 'l', 'w', 'w'
    'w', 'l', 'l', 'w'
    'w', 'w', 'w', 'w'
    'w', 'w', 'l', 'w'
     */
    char graph[5][4] = {{'w', 'w', 'w', 'l'}, {'l', 'l', 'w', 'w'}, {'w', 'l', 'l', 'w'}, {'w', 'w', 'w', 'w'}, {'w', 'w', 'l', 'w'}};
    int res = floodFill(graph);
    printf("%d\n", res);
    return 0;
}