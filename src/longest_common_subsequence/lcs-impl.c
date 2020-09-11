#include <stdio.h>
#include <string.h>
void lcsImp(char[], char[]);

int main()
{
    char x[6] = {'a', 'c', 'a', 'd', 'b'}, y[5] = {'c', 'b', 'd', 'a'};
    lcsImp(x, y);
    return 0;
}

void lcsImp(char x[], char y[])
{
    int n = strlen(x); //row
    int m = strlen(y); //col
    printf("n=%d, m=%d\n", n, m);
    int lcs_mat[n + 1][m + 1];
    int i = 0, j = 0;

    for (i = 0; i <= m; i++)
        lcs_mat[0][i] = 0;
    for (i = 0; i <= n; i++)
        lcs_mat[i][0] = 0;

    for (i = 1; i <= n; i++)
    {
        for (j = 1; j <= m; j++)
        {
            if (x[i - 1] == y[j - 1])
            {
                lcs_mat[i][j] = lcs_mat[i - 1][j - 1] + 1;
            }
            else if (lcs_mat[i - 1][j] >= lcs_mat[i][j - 1])
            {
                lcs_mat[i][j] = lcs_mat[i - 1][j];
            }
            else
            {
                lcs_mat[i][j] = lcs_mat[i][j - 1];
            }
        }
    }

    printf("lcs matrix:\n");
    for (i = 0; i <= n; i++)
    {
        for (j = 0; j <= m; j++)
        {
            printf("%d ", lcs_mat[i][j]);
        }
        printf("\n");
    }

    int lcs_size = lcs_mat[n][m];
    char result[lcs_size + 1];
    i = n;
    j = m;

    while (i > 0 && j > 0)
    {
        if (x[i - 1] == y[j - 1])
        {
            result[lcs_size] = x[i - 1];
            i--;
            j--;
            lcs_size--;
        }
        else if (lcs_mat[i - 1][j] >= lcs_mat[i][j - 1])
        {
            i--;
        }
        else
        {
            j--;
        }
    }

    printf("x = %s, y = %s\n lcs of x and y is %s", x, y, result);
}
