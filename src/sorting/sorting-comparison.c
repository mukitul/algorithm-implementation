#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <limits.h>

int i, j, k, t, tmp;

void bubble(int ar[], int n)
{
    clock_t start, end;
    start = clock();
    int mov = 0, cmpr = 0;
    k = n;
    while (k != 0)
    {
        t = 0;
        for (j = 1; j < k; j++)
        {
            cmpr++;
            if (ar[j] > ar[j + 1])
            {
                tmp = ar[j];
                ar[j] = ar[j + 1];
                ar[j + 1] = tmp;
                mov++;
                t = j;
            }
        }
        k = t;
    }
    end = clock();

    printf("Bubble   \t%d\t    \t%d     \t%d\n", end - start, cmpr, mov);
}

void selection(int ar[], int n)
{
    clock_t start, end;
    start = clock();
    int mov = 0, cmpr = 0;
    for (j = n; j >= 2; j--)
    {
        t = 1;
        for (k = 2; k <= j; k++)
        {
            cmpr++;
            if (ar[t] < ar[k])
            {
                t = k;
            }
        }
        tmp = ar[j];
        ar[j] = ar[t];
        ar[t] = tmp;
        mov++;
    }
    end = clock();
    printf("Selection\t%d\t    \t%d     \t%d\n", end - start, cmpr, mov);
}

void insertion(int ar[], int n)
{
    clock_t start, end;
    start = clock();
    int mov = 0, cmpr = 0;
    for (j = 2; j <= n; j++)
    {
        i = j - 1;
        t = ar[j];
        while (t < ar[i])
        {
            cmpr++;
            ar[i + 1] = ar[i];
            i = i - 1;
            mov++;
        }
        cmpr++;
        ar[i + 1] = t;
    }
    end = clock();
    printf("Insertion\t%d\t    \t%d     \t%d\n", end - start, cmpr, mov);
}

int main()
{
    int ar[50000], tmp1[50000], tmp2[50000], tmp3[50000], i, n;
    printf("n=?: ");
    scanf("%d", &n);
    for (i = 1; i <= n; i++)
    {
        ar[i] = rand();
    }
    ar[0] = INT_MIN;
    printf("\n");

    for (i = 1; i <= n; i++)
    {
        tmp1[i] = ar[i];
    }
    for (i = 1; i <= n; i++)
    {
        tmp2[i] = ar[i];
    }
    for (i = 1; i <= n; i++)
    {
        tmp3[i] = ar[i];
    }

    printf("SortName \tTime\tComparison\tMovement\n");
    printf("\t(millisecond)\n");
    bubble(tmp1, n);
    selection(tmp2, n);
    insertion(tmp3, n);
    return 0;
}
