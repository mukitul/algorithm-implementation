#include <stdio.h>

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
    int res = binarySearch(ar, 5, 5);
    printf("%d\n", res);
    return 0;
}