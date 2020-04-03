#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <limits.h>
void Merge(int[], int, int, int);
void Merge_Sort(int[], int, int);
void print(int[], int);

void Merge_Sort(int ar[], int p, int r)
{
    int q;

    if (p < r)
    {
        q = floor((p + r) / 2);
        Merge_Sort(ar, p, q);
        Merge_Sort(ar, q + 1, r);
        Merge(ar, p, q, r);
    }
}

void Merge(int ar[], int p, int q, int r)
{
    int n1, n2, i, j, k;
    n1 = q - p + 1;
    n2 = r - q;
    int L[n1 + 1], R[n2 + 1];
    for (i = 1; i <= n1; i++)
    {
        L[i] = ar[p + i - 1];
    }
    for (j = 1; j <= n2; j++)
    {
        R[j] = ar[q + j];
    }
    L[n1 + 1] = R[n2 + 1] = INT_MAX;
    i = j = 1;
    for (k = p; k <= r; k++)
    {
        if (R[j] >= L[i])
        {
            ar[k] = L[i];
            i++;
        }
        else
        {
            ar[k] = R[j];
            j++;
        }
    }
}
void print(int ar[], int n)
{
    int i;
    printf("\n");
    for (i = 0; i < n; i++)
    {
        printf("%d ", ar[i]);
    }
}

int main()
{
    int n, i;
    /* //case 1
    n=5;
    int ar[5] = {1,2,3,4,5}; */

    /* //case 2
    n = 5;
    int ar[5] = {5, 4, 3, 2, 1}; */

    //case 3
    n=6;
    int ar[6] = {0,0,0,3,4,-2};

    /* //case 4
    n=2;
    int ar[2] = {-1,-4}; */

    Merge_Sort(ar, 0, n);
    print(ar, n);
    return 0;
}
