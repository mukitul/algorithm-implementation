#include <stdio.h>

// reccur
int binarySearchReccur(int ar[], int left, int right, int x)
{
    if (right >= left)
    {
        int mid = left + (right - left) / 2;
        if (ar[mid] == x)
        {
            return mid;
        }
        else if (ar[mid] > x)
        {
            return binarySearchReccur(ar, left, mid - 1, x);
        }
        else
        {
            return binarySearchReccur(ar, mid + 1, right, x);
        }
    }

    return -1;
}

// iterative
int binarySearch(int ar[], int len, int x)
{
    int left = 0;
    int right = len - 1;

    while (left <= right)
    {
        int mid = left + (right - left) / 2;
        if (ar[mid] == x)
        {
            return mid;
        }
        else if (ar[mid] > x)
        {
            right = mid - 1;
        }
        else
        {
            left = mid + 1;
        }
    }

    return -1;
}
int main()
{
    int ar[5] = {1, 2, 3, 4, 5};
    int res1 = binarySearch(ar, 5, 6);
    printf("%d\n", res1);

    int res2 = binarySearchReccur(ar, 0, 4, 0);
    printf("%d\n", res2);
    return 0;
}