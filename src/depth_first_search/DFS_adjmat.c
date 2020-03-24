#include <stdio.h>
void DFS(int, int[]);
void addEdge(int, int);

int vertex;
int mat[10][10];

int main()
{
    vertex = 5;
    int visited[vertex];
    int i;
    for (i = 0; i < vertex; i++)
    {
        visited[i] = 0;
    }

    addEdge(0, 1);
    addEdge(0, 2);
    addEdge(1, 3);
    addEdge(1, 4);

    DFS(0, visited);
    return 0;
}

void DFS(int s, int vis[])
{
    int i;
    printf("%d ", s);
    vis[s] = 1;
    for (i = 0; i < vertex; i++)
    {
        if (mat[s][i] == 1 && vis[i] == 0)
        {
            DFS(i, vis);
        }
    }
}

void addEdge(int u, int v)
{
    mat[u][v] = 1;
}