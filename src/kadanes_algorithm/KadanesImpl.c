#include<stdio.h>

int max(int a, int b){
    if(a>b) return a;
    return b;
}

int kadane(int ar[], int size){
    int i,max_curr,max_glo;
    max_curr=max_glo=ar[0];

    for(i=0;i<size;i++){
        max_curr = max(ar[i], max_curr+ar[i]);

        if(max_curr>max_glo){
            max_glo = max_curr;
        }
    }

    return max_glo;
}

int main(){
    int ar[4] = {-2,3,2,-1};
    int res = kadane(ar,4);
    printf("%d ", res);
    return 0;
}