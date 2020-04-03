#include<stdio.h>
#include<stdlib.h>
#include<limits.h>
int i, j, tmp;

void Quick_Sort(int ar[], int f, int l)
{
    if(f<l)
    {
        i = f+1;
        while(ar[i]<ar[f])
        {
            i++;
        }
        j = l;
        while(ar[j]>ar[f])
        {
            j--;
        }
        while(i<j)
        {
            tmp = ar[i];
            ar[i] = ar[j];
            ar[j] = tmp;
            while(ar[i]<=ar[f])
            {
                i++;
            }
            while(ar[j]>=ar[f])
            {
                j--;
            }
        }
        tmp = ar[j];
        ar[j] = ar[f];
        ar[f] = tmp;
        Quick_Sort(ar,f,j-1);
        Quick_Sort(ar,j+1,l);
    }
}
void print(int ar[], int n)
{
    int i;
    printf("\n");
    for(i=0; i<n; i++)
    {
        printf("%d ", ar[i]);
    }
}

int main()
{
    int n;
    
    //case 1
    n=6;
    int ar[6] = {0,0,0,3,4,-2};

    Quick_Sort(ar, 0 , n);
    print(ar,n);


    return 0;
}
